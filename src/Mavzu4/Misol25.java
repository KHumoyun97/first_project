package Mavzu4;

import java.util.Scanner;

public class Misol25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" X ni kiriting :");
        int x=sc.nextInt();
        if (x<-2||x>2){
            System.out.println(" Natija : "+2*x);
        }else System.out.println(" Natija : "+(-3*x));
    }
}
