package oop2;
//property => name ssa gender, gpa
//methodnya => setSsn

public class Student {
    int ssn; // social security number
    String name;
    double gpa;
    boolean gen; // gender perempuan true


    // Modifier private: Hanya dapat diakses dari class itu sendiri
    // private int ssn; 
    // private String name;
    // private double gpa;
    // private boolean gen;

    //atasi dengan encapsulation field private
//     private int ssn; 
//     private String name;
//     private double gpa;
//     private boolean gen;

// public int getSsn() {
//     return ssn;
//     }
// public void setSsn(int ssn) {
//     this.ssn = ssn;
//     }

// public String getName() {
//     return name;
//     }
// public void setName(String name) {
//     this.name = name;
//     }

// public Double getGpa() {
//     return gpa;
//     }
// public void setGpa(Double gpa) {
//     this.gpa = gpa;
//     }

// public Boolean isGen() {
//     return gen;
//     }
// public void setGen(Boolean gen) {
//     this.gen = gen;
//     }

    //set dan get buat dikapsulasi biar terporoteksi, 
    //supaya ga error di class lain biar ga error, msti pake teknik setter dan getter
}
