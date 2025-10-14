package oop2;

import java.util.Scanner;

public class primitive {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = scanner.nextInt();

        boolean Dewasa;

        if (umur >= 17) {
            Dewasa = true;
        } else {
            Dewasa = false;
        }

        if (Dewasa) {
            System.out.println("Dewasa");
        } else {
            System.out.println("Belum Dewasa");
        }
        scanner.close();
    }
}