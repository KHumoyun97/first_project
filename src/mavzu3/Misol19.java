package mavzu3;

import java.util.Scanner;

public class Misol19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf(" 1-sonni kiriting !!!");
        int a=sc.nextInt();
        System.out.printf(" 2-sonni kiriting !!!");
        int b=sc.nextInt();
        System.out.printf(" 3-sonni kiriting !!!");
        int c=sc.nextInt();
        if (a*b==1){
            System.out.println(true);
        }else if (a*c==1){
            System.out.println(true);
        }else if (c*b==1){
            System.out.println(true);
        }else System.out.println(false);
    }
}
