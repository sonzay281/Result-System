package com.leapfrog;

import java.util.Scanner;

/**
 *
 * @author Anonymous
 */
public class MainMenu {

    double eng, math, nep, sci, comp, per = 1, sum = 0;

    public void menu() {

        Scanner input = new Scanner(System.in);
        System.out.println("\t School Result Management System ");
        System.out.println("\t ******************************* ");
        System.out.print("\t   Enter the marks obtained in\n");
        System.out.print("\t\t\tEnglish:");
        eng = input.nextInt();
        System.out.print("\t\t\tMath:");
        math = input.nextInt();
        System.out.print("\t\t\tNepali:");
        nep = input.nextInt();
        System.out.print("\t\t\tScience:");
        sci = input.nextInt();
        System.out.print("\t\t\tComputer Science:");
        comp = input.nextInt();

    }

    public void calculation() {
        if (eng >= 40 & math >= 40 & nep >= 40 & sci >= 40 & comp >= 40) {

            sum = eng + math + nep + sci + comp;
            per = (sum / 500) * 100;
            if (per >= 90 & per <= 100) {
                System.out.println("Grade A+");
            } else if (per >= 80 & per < 90) {
                System.out.println("Grade A");
            } else if (per >= 70 & per < 80) {
                System.out.println("Grade B+");
            } else if (per >= 60 & per < 70) {
                System.out.println("Grade B");
            } else if (per >= 50 & per < 60) {
                System.out.println("Grade C+");
            } else if (per >= 40 & per < 50) {
                System.out.println("Grade C");
            }

        } else {
            System.out.println(" Fail ");
        }
        System.out.println("Total percantage:" + per);
        System.out.println("Total marks:" + sum);
    }

}
