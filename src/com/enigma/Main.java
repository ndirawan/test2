package com.enigma;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.numberOne();
        System.out.println();
        main.triangle();
        System.out.println();
        main.fibonacci();
    }
    //Soal Nomor 1
    void numberOne(){
        System.out.println("Soal nomor 4");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
                if (j == 5) {
                    System.out.print("\n");
                    for (int k = 1; k <= 1; k++) {
                        for (int l = 5; l >= 1; l--) {
                            System.out.print(l);
                            if (l == 1) {
                                System.out.print("\n");
                            }
                        }
                    }
                }
            }
        }
    }
    //Soal Nomor 4
    void triangle(){
        System.out.println("Soal nomor 2");
        for (int i = 1; i <= 5; i++) {
            for (int j = 4; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //Soal Nomor 3
    void fibonacci(){
        System.out.println("Soal nomor 3");
        int x = 0, y = 1, z = 1;

        System.out.print("Masukan jumlah bilangan fibonacci = ");
        Scanner input = new Scanner(System.in);
        int jumlah = input.nextInt();

        for (int i = 0; i < jumlah; i++) {
            System.out.print(z + " ");
            z = x + y;
            x = y;
            y = z;
        }
    }
}