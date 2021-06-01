package mavzu1;

import java.util.Scanner;

public class Misol7 {
    public static void main(String[] args) {
        //Doiraning radiusi R berilgan. Uning uzunligi L va
        // yuzasi S aniqlansin
        //L=2*p*R S=p*R^2
        Scanner sc=new Scanner(System.in);
        System.out.println(" R ni kiriting :");
        int r=sc.nextInt();
        System.out.println(" Uzunligi L = "+2*Math.PI*r);
        System.out.println(" Yuzasi S  = "+2*r*r);
    }
}
