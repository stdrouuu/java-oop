package oop2;
//property => name ssa gender, gpa
//methodnya => setSsn
public class Student_cara2 {
    // Modifier private: Hanya dapat diakses dari class itu sendiri
    //atasi dengan encapsulation field private
    private int ssn; 
    private String name;
    private double gpa;
    private boolean gen;

public int getSsn() {
    return ssn;
    }
public void setSsn(int ssn) {
    this.ssn = ssn;
    }

public String getName() {
    return name;
    }
public void setName(String name) {
    this.name = name;
    }

public double getGpa() {
    return gpa;
    }
public void setGpa(double gpa) {
    this.gpa = gpa;
    }

public boolean isGen() {
    return gen;
    }
public void setGen(boolean gen) {
    this.gen = gen;
    }
}
    //set dan get buat dikapsulasi biar terporoteksi, 
    //supaya ga error di class lain biar ga error, msti pake teknik setter dan getter
