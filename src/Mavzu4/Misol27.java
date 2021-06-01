package Mavzu4;

import java.util.Scanner;

public class Misol27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" X ni kiriting :");
        int x=sc.nextInt();
        if (x==0||x==2){
            System.out.println(" Natija : "+1);
        }else if (x<0){
            System.out.println(" Natija : "+0);
        }else if (x==1||x==3){
            System.out.println(" Natija : "+-1);
        }
    }
}
