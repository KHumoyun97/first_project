package mavzu2;

import java.util.Scanner;

public class Misol29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A ni kiriting :");
        int a=sc.nextInt();
        System.out.println(" B ni kiriting :");
        int b=sc.nextInt();
        int c=a*b;
        if (a>b){
            System.out.println("Kvadratlar soni : "+b*b);
        }else System.out.println("Kvadratlar soni "+a*a);
        System.out.println(" Yuzasi :"+a*b);
    }
}
