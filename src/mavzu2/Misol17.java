package mavzu2;

import java.util.Scanner;

public class Misol17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" To'rt vb xonali son kiriting :");
        int a=sc.nextInt();
        int s=(a-(a/1000)*1000)/100;
        System.out.println(" Natija : "+s);
    }
}
