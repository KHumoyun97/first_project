package mavzu3;

import java.util.Scanner;

public class Misol35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" x ni kiriting : ");
        int x=sc.nextInt();
        System.out.println(" y ni kiriting : ");
        int y=sc.nextInt();
        System.out.println(" x1 ni kiriting : ");
        int x1=sc.nextInt();
        System.out.println(" y1 ni kiriting : ");
        int y1=sc.nextInt();
        int s=x+y;
        int s1=x1+y1;
        if ((s+s1)%2!=0){
            System.out.println(true);
        }else System.out.println(false);
    }
}
