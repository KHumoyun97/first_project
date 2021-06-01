package mavzu2;

import java.util.Scanner;

public class Misol5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A ni kiriting : ");
        int a1=sc.nextInt();
        int a2=sc.nextInt();
        System.out.println(" B ni kiriting : ");
        int b1=sc.nextInt();
        int b2=sc.nextInt();
        System.out.println(" Natija : "+(a1+a2-b1-b2));
    }
}
