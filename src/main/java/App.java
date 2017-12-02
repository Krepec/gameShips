

import java.util.*;

public class App {

    public static void main(String[] args) {
        PointComparator pointComparator = new PointComparator();
        List<Point> hitPointPlayer1 = new ArrayList<Point>();
        List<Point> hitPointPlayer2 = new ArrayList<Point>();
        String[][] player1 = createNewBoard();
        String[][] player2 = createNewBoard();
        showGameBoard(player1);
        System.out.println("\n");
        showGameBoard(player2);

        List<Point> newShip1 = new ArrayList<Point>();
        newShip1.add(new Point(0, 0));
        newShip1.add(new Point(0, 1));
        newShip1.add(new Point(0, 2));
        newShip1.add(new Point(0, 3));
        newShip1.add(new Point(0, 4));


        List<Point> newShip2 = new ArrayList<Point>();
        newShip2.add(new Point(1, 0));
        newShip2.add(new Point(1, 1));
        newShip2.add(new Point(1, 2));
        newShip2.add(new Point(1, 3));
        newShip2.add(new Point(1, 4));

        createShip(newShip1, player1);
        createShip(newShip2, player2);

        System.out.println("\n");
        showGameBoard(player1);
        System.out.println("\n");
        showGameBoard(player2);

        boolean isTurnPlayer1 = true;
        boolean gameOver = false;
        while (!gameOver) {
            Scanner input = new Scanner(System.in);
            String shot = "";
            if (isTurnPlayer1) {
                System.out.println("Teraz gra Player1");

            } else {
                System.out.println("Teraz gra Playet2");

            }
            System.out.println("Podaj oś x: ");
            int x = input.nextInt();
            System.out.println("Podaj oś y: ");
            int y = input.nextInt();


            if (isTurnPlayer1) {
                if (player2[x][y].contains("x")) {
                    player2[x][y] = "T";
                    hitPointPlayer1.add(new Point(x, y));
                    hitPointPlayer1.sort(pointComparator);
                    System.out.println("trafione");
                    isTurnPlayer1 = true;
                } else {
                    System.out.println("pudło");
                    isTurnPlayer1 = false;
                }


            } else {
                if (player1[x][y].contains("x")) {
                    player1[x][y] = "T";
                    hitPointPlayer2.add(new Point(x,y));
                    hitPointPlayer2.sort(pointComparator);
                    System.out.println("trafione");
                    isTurnPlayer1 = false;
                } else {
                    System.out.println("pudło");
                    isTurnPlayer1 = true;
                }


            }



            if (hitPointPlayer2.equals(newShip1)){
                gameOver = true;
                System.out.println("Koniec Gry ! Wygrywa Player 2");
            }
            else if(hitPointPlayer1.equals(newShip2)){
                gameOver = true;
                System.out.println("Koniec Gry ! Wygrywa Player 1");
            }
            else {
                gameOver = false;
            }

            showGameBoard(player1);
            System.out.println();
            showGameBoard(player2);
            System.out.println(hitPointPlayer1);
            System.out.println(newShip2);

        }
    }

    // wyswietlamy tablice
    static public void showGameBoard(String[][] gameBoard) {  // musi byc statyczne zeby sie odwołac w main
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(gameBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    static public String[][] createNewBoard() {
        String[][] gameBoard = new String[10][10];
// inicjujemy tablice
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                gameBoard[i][j] = "o";
            }

        }

        return gameBoard;
    }

    // metoda zmieni z o na x na posdtawie podanych wspolrzednych
    static public String[][] createShip(List<Point> points, String[][] board) {
        for (Point p : points) {
            int x = p.getX();
            int y = p.getY();
            board[x][y] = "x";
        }

        return board;
    }











    // DOKONCZYC !!!
    /*public boolean isFinish(List<Point> points){
        List<Point> checkEnd = new ArrayList<Point>();
        if (points.equals("x")){
            checkEnd.add(points[x][y]);
        }
        return
    }*/



}
/**
 * Created by laptop on 24.11.17.
 */


// 1 scaner z podniem współ, jak trafi to mozna kontynuowac lub zmieniac gracza
// jezeli trafi trzeba zmienic na cos innego
// 2 while - warunek zakonczenia gry
//