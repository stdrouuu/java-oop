package oop2;

import java.util.Scanner;

public class trafficlight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the traffic light code: "); 
        
        if (scanner.hasNextInt()) {
            int lightCode = scanner.nextInt(); 
            String lightColor; 
            String nextLightColor; 

            
            if (lightCode == 3) {
                lightColor = "Yellow";
                nextLightColor = "Red"; 
                // System.out.println("Right now, the traffic light is " + lightColor);//optional
                System.out.println("The next traffic light is " + nextLightColor);

            } else if (lightCode == 2) {
                lightColor = "Green";
                nextLightColor = "Yellow"; 
                // System.out.println("Right now, the traffic light is " + lightColor);//optional
                System.out.println("The next traffic light is " + nextLightColor);

            } else if (lightCode == 1) {
                lightColor = "Red";
                nextLightColor = "Green";
                // System.out.println("Right now, the traffic light is " + lightColor);//optional
                System.out.println("The next traffic light is " + nextLightColor);   
            } 
            
        } else {
                System.out.println("Invalid color");
        }

        scanner.close();
    }
}