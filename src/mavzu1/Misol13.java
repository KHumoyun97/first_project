package mavzu1;

import java.util.Scanner;

public class Misol13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("R1 kiriting :");
        int r1=sc.nextInt();
        System.out.println("R2 kiriting :");
        int r2=sc.nextInt();
        System.out.println("S1 = "+Math.PI*r1);
        System.out.println("S2 = "+Math.PI*r2);
        System.out.println("S3 = "+Math.PI*(Math.PI*r2-Math.PI*r1));

    }
}
