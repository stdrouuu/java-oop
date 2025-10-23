// package oop2;

// public class primitive2 {
//     public static void main(String[] args) {
//         int grade = 99;
//         boolean madeHonorRoll = grade >= 88;
//         if(madeHonorRoll)
//             System.out.println("You made the Honor Roll.");
//             System.out.println("ok.");
//     }
// }

//-----------------------------------------------------------------------------------------------------------------------------------------

// package oop2;

// public class primitive2 {
//     public static void main(String[] args) {
//             int numberDaysAbsent = 0;
//             int grade = 99;
//             boolean madeHonorRoll = grade >= 88;
//             if(madeHonorRoll && numberDaysAbsent==0) 
//             //operand1 = madeHonorRoll; operator &&,>=, ==; operand2 = numberDaysAbsent==0
//                 System.out.println("You qualify for the scholarship");

//             if(grade > 70 && numberDaysAbsent < 5)
//                 System.out.println("You may try out for the sports team");
//         }
//     }

//-------------------------------------------------------------------------------------------------------------------------------------------

package oop2;

public class primitive2 {
        public static void main(String[] args) {
            int menu = 'C'; //operatornya =
            //if bisa pake tipe data koma kayak float
            //kalo switch gabisa pake float (keterbatasan tipe data)
                switch(menu){ 
                    case 'A': System.out.println("Nasi goreng");
                        break;
                    case 'B': System.out.println("Ayam Goreng");
                        break;
                    case 'C': System.out.println("Cap Cay");
                        break;
                    case 'D': System.out.println("Es Teh");
                        break;
                    default: System.out.println("Tidak ada pesanan");
            }
        }
    }

//----------------------------------------------------------------------------------------------------------------------------------------------

// package oop2;

// public class primitive2 {
//         public static void main(String[] args) {
//         int numberDaysAbsent = 0;
//             int grade = 99;
//             boolean madeHonorRoll =  grade >= 88;
//             if(madeHonorRoll && numberDaysAbsent==0) //operand1 = madeHonorRoll; operator &&,>=, ==; operand2 = numberDaysAbsent==0
//                 System.out.println("You qualify for the scholarship");

//             if(grade > 70 && numberDaysAbsent < 5)
//                 System.out.println("You may try out for the sports team");
//         }
//     }
