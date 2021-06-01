package Mavzu4;

import java.util.Scanner;

public class Misol12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Uchta sonni kiriting :");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if (a>b&&b>c){
            System.out.println(" Natija : "+c);
        }else  if (a<b&&b>c){
            System.out.println(" Natija : "+a);
        }else  if (a>b&&b<c){
            System.out.println(" Natija : "+b);
        }
    }
}
