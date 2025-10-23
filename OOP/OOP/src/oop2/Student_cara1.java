package oop2;
//property => name ssa gender, gpa
//methodnya => setSsn

public class Student_cara1 {
    int ssn; // social security number
    String name;
    double gpa;
    boolean gen; // gender perempuan true

    public static void main(String[] args) {
        Student_cara1 s = new Student_cara1(); 
        s.ssn = 100;
        s.name = "atika";
        s.gpa = 3.5;
        s.gen = true; 
        
        Student_cara1 s1 = new Student_cara1();
        s1.ssn = 101;
        s1.name = "jackson";
        s1.gpa = 2.7;
        s1.gen = false; 

        Student_cara1 s2 = new Student_cara1();
        s2.ssn = 102;
        s2.name = "dita";
        s2.gpa = 2.1;
        s2.gen = true; 

        System.out.println(s.ssn);
        System.out.println(s.name);
        System.out.println(s.gpa);
        System.out.println(s.gen);

        System.out.println(s1.ssn);
        System.out.println(s1.name);
        System.out.println(s1.gpa);
        System.out.println(s1.gen);

        System.out.println(s2.ssn);
        System.out.println(s2.name);
        System.out.println(s2.gpa);
        System.out.println(s2.gen);
    }
}

