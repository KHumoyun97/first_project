package Mavzu4;

import java.util.Scanner;

public class Misol9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A nikiriting :");
        int a=sc.nextInt();
        System.out.println(" B nikiriting :");
        int b=sc.nextInt();
        if (b>a){
            a=b;
            System.out.println(" A teng : "+a);
        }else System.out.println(" A teng : "+a);
    }
}
