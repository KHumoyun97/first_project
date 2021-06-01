package mavzu2;

import java.util.Scanner;

public class Misol8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Ikki xonali son kirting :");
        int a=sc.nextInt();
        System.out.println(" Natija : "+(a-(a/10)*10)+(a/10));

    }
}
