package mavzu3;

import java.util.Scanner;

public class Misol32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" a ni kiriting :");
        int a=sc.nextInt();
        System.out.println(" b ni kiriting :");
        int b=sc.nextInt();
        System.out.println(" c ni kiriting :");
        int c=sc.nextInt();
        if (a==c&&b==c){
            System.out.println(true);
        }else System.out.println(false);
    }
}
