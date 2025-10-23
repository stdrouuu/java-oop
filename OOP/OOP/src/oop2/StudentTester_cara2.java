package oop2;

public class StudentTester_cara2 {
    //nama ibjectnya s s1 s2

    //kalo pake private dan encapsulation field private
    public static void main(String[] args) {
        Student_cara2 s = new Student_cara2();
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