package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int b = 0;
        int c = 0;
        int counter1 = 0;
        int counter2 = 0;
        int a = 0;
        int number = 0;
        int compNumb = 0;
        int sumOfCompCubes = 0;
        Random random = new Random();
        for (int i = 0; i < 3; i++) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("---     Start game     ---");
            System.out.println("predict amount  of points (2,  12)");
            number = scanner.nextInt();
            try {
                if (number < 2) {
                    System.out.println("predict amount can not be 2");
                } else {

                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            a = rollTheDice() + rollTheDice();
            System.out.println("On the dice fell " + a + " points.");
            b = (a - Math.abs(a - number) * 2);
            System.out.println("Result is " + b + " points ");
            counter1 = counter1 + b;


            System.out.println("     ");
            compNumb = random.nextInt(2, 12);
            System.out.println("Computer predicted " + compNumb + " points ");
            System.out.println("Computer rolls the dices...");
            sumOfCompCubes = rollTheDice() + rollTheDice();

            c = sumOfCompCubes - Math.abs(sumOfCompCubes - compNumb) * 2;
            System.out.println("result is " + c + "points");
            counter2 = counter2 + c;
        }


        System.out.println(
                "-----   Current score   -----\n" +
                        "User :" + counter1 + "points\n" +
                        "Computer " + counter2 + "points");
        System.out.println("          ");
        System.out.println("-----       Finish game!        -----\n" +
                " Round |        User    |     Computer\n" +
                " - - - + - - - - - - -  + - -\n" +
                "   1   |predicted : " + number + "   | predicted : " + compNumb + "\n" +
                "       | Dice : " + a + "       |  Dice : " + sumOfCompCubes + "\n" +
                "       | Result : " + b + "     | Result : " + c + "\n" +
                "- - - -+ - - - - - - - -+ - - - - - - - - -\n" +
                "   2   |predicted : " + number + "   | predicted : " + compNumb + "\n" +
                "       | Dice : " + a + "       |  Dice : " + sumOfCompCubes + "\n" +
                "       | Result : " + b + "     | Result : " + c + "\n" +
                "- - - -+ - - - - - - - - + - - - - - - - - -\n" +
                "  3    |predicted : " + number + "   | predicted : " + compNumb + "\n" +
                "       | Dice : " + a + "       |  Dice : " + sumOfCompCubes + "\n" +
                "       | Result : " + b + "     | Result : " + c + "\n" );

    }

    static int rollTheDice() {
        Random random = new Random();
        int cube = random.nextInt(2, 6);


        switch (cube) {
            case 2:
                System.out.println("+------+\n" + "| #    |\n" + "|      |\n" + "|     #|\n" + "+------+");
                break;
            case 3:
                System.out.println("+------+\n" + "| #    |\n" + "|   #  |\n" + "|     #|\n" + "+------+");
                break;
            case 4:
                System.out.println("+------+\n" + "| #   #|\n" + "|      |\n" + "| #   #|\n" + "+------+");
                break;
            case 5:
                System.out.println("+------+\n" + "| #   #|\n" + "|   #  |\n" + "| #   #|\n" + "+------+");
                break;
            case 6:
                System.out.println("+------+\n" + "| #   # |\n" + "| #   # |\n" + "| #   # |\n" + "+------+");
                break;

        }
        return cube;
    }
}

