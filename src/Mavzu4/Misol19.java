package Mavzu4;

import java.util.Scanner;

public class Misol19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-son ni kiriting :");
        int a=sc.nextInt();
        System.out.println("2-son ni kiriting :");
        int b=sc.nextInt();
        System.out.println("3-son ni kiriting :");
        int c=sc.nextInt();
        System.out.println("4-son ni kiriting :");
        int d=sc.nextInt();
        if (a==b&&b==c){
            System.out.println(" 4-raqam "+d);
        }else if (d==b&&b==c){
            System.out.println(" 1-raqam "+d);
        }else if (a==d&&d ==c){
            System.out.println(" 2-raqam "+d);
        }else if (a==b&&b==d){
            System.out.println(" 3-raqam "+d);
        }

    }
}
