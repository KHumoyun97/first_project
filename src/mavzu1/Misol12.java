package mavzu1;

import java.util.Scanner;

public class Misol12 {
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        System.out.println(" a ni kiritng : ");
        int a=sc.nextInt();
        System.out.println(" b ni kiritng : ");
        int b=sc.nextInt();
        int c= (int) Math.sqrt(a*a+b*b);
        System.out.print("Gipetenuzasi P : "+c);
        System.out.print("Perimetri P : "+(a+b+c));
    }
}
