package mavzu1;

import java.util.Scanner;

public class Misol18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" A ni kiriting : ");
        int a=sc.nextInt();
        System.out.println(" B ni kiriting : ");
        int b=sc.nextInt();
        System.out.println(" C ni kiriting : ");
        int c=sc.nextInt();
        System.out.println(" Natija : "+((c-a)*(b-c)));
    }
}
