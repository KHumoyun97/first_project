package mavzu1;

import java.util.Scanner;

public class Misol8 {
    public static void main(String[] args) {
        //Ikkita son a va b berilgan. Ularning o'rta arifmetigi aniqlansin?
        //(a=b)/2
        Scanner sc=new Scanner(System.in);
        System.out.println(" a  ni kiriting : ");
        int a=sc.nextInt();
        System.out.println(" b  ni kiriting : ");
        int b=sc.nextInt();
        System.out.println(" O'rta arifmetigi : "+(a+b)/2);
    }
}
