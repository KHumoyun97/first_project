package mavzu1;

import java.util.Scanner;

public class Misol3 {
    public static void main(String[] args){
        //3-misol:To'g'r to'rtburchkning tomonlari a va b berilgan.
        //Uning yuzasi S=a*b va P=2*(a+b) perimetri aniqlasin?
        Scanner sc=new Scanner(System.in);
        System.out.println(" a ni kiritng :");
        int a=sc.nextInt();
        System.out.println(" b ni kiritng :");
        int b=sc.nextInt();
        System.out.println("Yuzasi: S = "+a*b);
        System.out.println("Perimetri: P = "+2*(a+b));
    }
}
