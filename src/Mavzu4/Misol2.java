package Mavzu4;

import java.util.Scanner;

public class Misol2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Son kiriting :");
        int x=sc.nextInt();
        if (x>0){
            x+=1;
            System.out.println(" Natija : "+x);
        }else System.out.println(" Natija : "+(x-2));
    }
}
