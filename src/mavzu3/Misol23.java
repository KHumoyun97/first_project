package mavzu3;

import java.util.Scanner;

public class Misol23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.printf(" 1-sonni kiriting !!!");
        int a=sc.nextInt();
        int a1=a/100;
        int a2=(a-a1*100)/10;
        int a3=(a-(a1*100+a2*10));
        int c=sc.nextInt();
        if (a1==a3){
            System.out.println(true);
        }else System.out.println(false);
    }
}
