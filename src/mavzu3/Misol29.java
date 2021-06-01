package mavzu3;

import java.util.Scanner;

public class Misol29 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(" x ni kiriting :");
        int x=sc.nextInt();
        System.out.println(" y ni kiriting :");
        int y=sc.nextInt();
        System.out.println(" x1 ni kiriting :");
        int x1=sc.nextInt();
        System.out.println(" y1 ni kiriting :");
        int y1=sc.nextInt();
        System.out.println(" x2 ni kiriting :");
        int x2=sc.nextInt();
        System.out.println(" y2 ni kiriting :");
        int y2=sc.nextInt();
        if (x+y>x1+y1&&x+y>x2+y2){
            System.out.println(true);
        }else System.out.println(false);
    }
}
