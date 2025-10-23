package oop2;

public class coba {
    public static void main(String[] args) {
        double height = 4, radius = 10, volume;
        // volume = 1/3 * 3.14 * radius * radius * height;
        // System.out.println(volume);

        // volume = 3.14 * radius * radius * height * 1/3;
        // System.out.println(volume);

        // volume = 1/3.0 * 3.14 * radius * radius * height ;
        // System.out.println(volume);

        volume = (double)1/3 * 3.14 * radius * radius * height ; // casting double -> (double)
        System.out.println(volume);
    }
}