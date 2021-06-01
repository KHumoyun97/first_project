package Mavzu4;

import java.util.Scanner;

public class Misol26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" X ni kiriting :");
        int x=sc.nextInt();
        if (x<=0){
            System.out.println(" Natija : "+(-x));
        }else if (0<x&&x<2){
            System.out.println(" Natija : "+x*x);
        }else if (x>=2){
            System.out.println(" Natija : "+4);
        }
    }
}
