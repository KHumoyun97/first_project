package Mavzu4;

import java.util.Scanner;

public class Misol29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Raqam kiriting :");
        int x=sc.nextInt();
        if (x>0&&x%2==0){
            System.out.println(" Musbat juft son");
        }else if (x>0&&x%2!=0){
            System.out.println(" Musbat toq son");
        }else if (x<0&&x%2==0){
            System.out.println(" Mnfiy juft son");
        }else if (x<0&&x%2!=0){
            System.out.println(" Manfiy toq son");
        }else System.out.println(" Raqam 0 ga teng!!!" );

    }
}
