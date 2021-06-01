package mavzu1;

import java.util.Scanner;

public class Misol6 {
    public static void main(String[] args){
        //Kubning yon tomoni a berilgan.Uning hajmini V=a^3 va to'la sirti S=6*a^2 aniqlansin?

        Scanner sc=new Scanner(System.in);
        System.out.println(" a ni kiriting :");
        int a=sc.nextInt();
        System.out.println(" Hajmi V = "+Math.pow(a,3));
        System.out.println(" To'l sirti  S = "+6*a*a);
    }
}
