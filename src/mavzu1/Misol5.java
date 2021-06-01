package mavzu1;

import java.util.Scanner;

public class Misol5 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("a ni kiriting : ");
        int a=sc.nextInt();
        System.out.println("b ni kiriting : ");
        int b=sc.nextInt();
        System.out.println("c ni kiriting : ");
        int c=sc.nextInt();
        System.out.println("To'la sirt S = "+2*(a*b+b*c+a*c));
        System.out.println("Hajmi  V = "+a*b*c);

    }
}
