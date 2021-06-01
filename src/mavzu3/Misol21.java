package mavzu3;

import java.util.Scanner;

public class Misol21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf(" 1-sonni kiriting !!!");
        int a=sc.nextInt();
        System.out.printf(" 2-sonni kiriting !!!");
        int b=sc.nextInt();
        System.out.printf(" 3-sonni kiriting !!!");
        int c=sc.nextInt();
        if (a<b&&b<c){
            System.out.println(true);
        }else System.out.println(false);
    }
}
