package com.company;
import java.util.Scanner;
class Main {
    static int a, b;
    static String[][] bord;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of Grid");
        a = in.nextInt();
        b = in.nextInt();
        bord = new String[a][b];
        printBord();
        for (int i = 1;i<=a*b;i++) {
            System.out.println("Enter X/O");
            String user = in.next();
            System.out.println("Enter Index");
            if (user.equals("X")||user.equals("x")) {
                bord[in.nextInt()][in.nextInt()] = "X";
                printBord();
            }else if (user.equals("O")||user.equals("o")) {
                bord[in.nextInt()][in.nextInt()] = "O";
                printBord();
            }
        }System.out.println("Grid is full");
    }
    private static void printBord() {
        for (int c = 0; c < bord.length; c++) {
            for (int d = 0; d < bord[c].length; d++) {
                if(bord [c][d]== null) {
                  bord [c][d] = "-";
                }
                 System.out.print(" | "+ bord[c][d] );
            }
                  System.out.println(" | ");
        }
    }
}
