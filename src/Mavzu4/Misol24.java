package Mavzu4;

import java.util.Scanner;

public class Misol24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" X ni kiriting :");
        int x=sc.nextInt();
        if (x>0){
            System.out.println(" Natija : "+2*Math.sin(x));
        }else if (x<=0){
            System.out.println(" Natija : "+(x-6));
        }
    }
}
