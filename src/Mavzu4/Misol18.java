package Mavzu4;

import java.util.Scanner;

public class Misol18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1-SON  ni kiriting :");
        int a=sc.nextInt();
        System.out.println(" 2-SON  ni kiriting :");
        int b=sc.nextInt();
        System.out.println(" 3-SON  ni kiriting :");
        int c=sc.nextInt();
        if (a==b){
            System.out.println(" Natija : "+a/2);
            System.out.println(" Natija : "+b/2);
            System.out.println(" Natija : "+c/2);
        }else System.out.println(" Natija : "+(-a));
        System.out.println(" Natija : "+(-b));
        System.out.println(" Natija : "+(-c));

    }
}
