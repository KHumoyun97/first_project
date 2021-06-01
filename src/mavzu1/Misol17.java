package mavzu1;

import java.util.Scanner;

public class Misol17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A ni kiriting : ");
        int a=sc.nextInt();
        System.out.println(" B ni kiriting : ");
        int b=sc.nextInt();
        System.out.println(" C ni kiriting : ");
        int c=sc.nextInt();
        System.out.println(" AC natija : "+(c-a));
        System.out.println(" BC natija : "+(c-b));
    }
}
