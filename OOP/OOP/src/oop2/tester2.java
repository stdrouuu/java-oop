package oop2;

import oop.belajar_cara1;
import oop.belajar_cara2;

// import oop.belajar;

public class tester2 {
    public static void main(String[] args) {
        //kalo mau panggil belajar_cara1 (package oop), bisa langsung panggil nama class + methodnya
        //jangan lupa import oop.belajar_cara1; karena beda package
        belajar_cara1.rect();
        belajar_cara1.triangle();

        //kalo mau panggil belajar_cara2 (package oop), harus panggil object dulu, 
        //lalu, baru panggil nama objek + methodnya
        //jangan lupa import oop.belajar_cara2; karena beda package
        belajar_cara2 rw = new belajar_cara2(); //object
        rw.rect();
        rw.triangle();

        //kalo mau panggil belajar2 (package oop2), harus panggil object dulu,
        //kalo package sama, gak perlu import
        belajar2 sw = new belajar2();
        sw.rectangle();
    }
}
