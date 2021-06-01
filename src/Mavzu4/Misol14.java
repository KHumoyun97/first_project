package Mavzu4;

import java.util.Scanner;

public class Misol14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Uchta sonni kiriting :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b&&b>c){
            System.out.println(" Natija : "+a+c);
        }else  if (a<b&&a>c){
            System.out.println(" Natija : "+b+c);
        }else  if (a<c&&b>c){
            System.out.println(" Natija : "+a+b);
        }
    }
}
