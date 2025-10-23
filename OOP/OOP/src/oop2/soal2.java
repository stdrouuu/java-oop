package oop2;

import java.util.Scanner;

public class soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a color code: ");
        
        if (scanner.hasNextInt()) {
            int wavelength = scanner.nextInt();
            String color;

            if (wavelength >= 380 && wavelength <= 450) {
                color = "Violet";
                System.out.println("The color is " + color);

            } else if (wavelength >= 451 && wavelength <= 495) {
                color = "Blue";
                System.out.println("The color is " + color);

            } else if (wavelength >= 496 && wavelength <= 570) {
                color = "Green";
                System.out.println("The color is " + color);

            } else if (wavelength >= 571 && wavelength <= 590) {
                color = "Yellow";
                System.out.println("The color is " + color);

            } else if (wavelength >= 591 && wavelength <= 620) {
                color = "Orange";
                System.out.println("The color is " + color);

            } else if (wavelength >= 621 && wavelength <= 750) {
                color = "Red";
                System.out.println("The color is " + color);
            } 
        
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum.");
        }

        scanner.close();
    }
}

//contoh input 
//Enter a color code:
//630
// The color is Red

//Enter a color code:
//25.0
//The entered wavelength is not a part of the visible spectrum.

//Enter a color code:
//750.5
//The entered wavelength is not a part of the visible spectrum.