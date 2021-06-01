package mavzu5;

import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class Misol5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A ni kiriting :");
        int a=sc.nextInt();
        System.out.println(" B ni kiriting :");
        int b=sc.nextInt();
        System.out.println(" 1 dan 4 gacha raqam kiriting :");
        int x=sc.nextInt();
        switch (x){
            case 1:
                System.out.println(" Natija : "+(a+b));break;
            case 2:
                System.out.println(" Natija : "+a*b);break;
            case 3:
                System.out.println(" Natija : "+(a-b));break;
            case 4:
                System.out.println(" Natija : "+(a/b));
        }
    }
}
