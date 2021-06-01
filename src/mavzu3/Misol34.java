package mavzu3;

import java.util.Scanner;

public class Misol34 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" x ni kiriting : ");
        int x=sc.nextInt();
        System.out.println(" y ni kiriting : ");
        int y=sc.nextInt();
        int s=x+y;
        if (s%2!=0){
            System.out.println(true);
        }else System.out.println(false);

    }
}
