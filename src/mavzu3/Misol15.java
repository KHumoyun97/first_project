package mavzu3;

import java.util.Scanner;

public class Misol15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A ni kiriting :");
        int a=sc.nextInt();
        System.out.println(" B ni kiriting :");
        int b=sc.nextInt();
        System.out.println(" C ni kiriting :");
        int c=sc.nextInt();
        if (a%2==0&&b%2==0){
            System.out.println(true);
        }else if (b%2==0&&c%2==0){
            System.out.println();
        }else if (c%2==0&&a%2==0){
            System.out.println(true);
        }else System.out.println(false);
    }
}
