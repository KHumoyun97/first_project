package mavzu1;

import java.util.Scanner;

public class Misol14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("L ni kiriting :");
        double l=sc.nextDouble();
        System.out.println(" R = "+Math.PI*l*2);
        System.out.println(" R = "+Math.PI*(Math.PI*l*2)*(Math.PI*l*2));
    }
}
