package oop2;

public class StudentTester {
    //nama ibjectnya s s1 s2

    // public static void main(String[] args) {
    //     //nama class nama object = new nama_constructor
    //     Student s = new Student(); //object
        //false=cowo, true=cewe
        // s.ssn = 100;
        // s.name = "atika";
        // s.gpa = 3.5;
        // s.gen = true; 
        
        // Student s1 = new Student();
        // s1.ssn = 101;
        // s1.name = "jackson";
        // s1.gpa = 2.7;
        // s1.gen = false; 

        // Student s2 = new Student();
        // s2.ssn = 102;
        // s2.name = "dita";
        // s2.gpa = 2.1;
        // s2.gen = true; 

        // System.out.println(s.ssn);
        // System.out.println(s.name);
        // System.out.println(s.gpa);
        // System.out.println(s.gen);

        // System.out.println(s1.ssn);
        // System.out.println(s1.name);
        // System.out.println(s1.gpa);
        // System.out.println(s1.gen);

        // System.out.println(s2.ssn);
        // System.out.println(s2.name);
        // System.out.println(s2.gpa);
        // System.out.println(s2.gen);


        
    //kalo pake private dan encapsulation field private
    public static void main(String[] args) {
        Student s = new Student();
        s.setSsn(100);
        s.setName("atika"); //nama method setname, kirim ke file student
        s.setGpa(3.5); 
        s.setGen(true);

        System.out.println(s.getSsn());
        System.out.println(s.getName());
        System.out.println(s.getGpa());
        System.out.println(s.isGen()); //khusus booelan tipe-datanya pake is
    }
}