package mavzu1;

import com.company.Main;

import java.util.Scanner;

public class Misol4 {
    public static void main(String[] args){
        //Aylananing diametri d berilgan. Uning uzunligi aniqlansin L=p*d,p=3.14
        Scanner sc=new Scanner (System.in);
        System.out.println(" d ni kiritng :");
        double d= sc.nextInt();
        System.out.println("uzunligi L = "+d* Math.PI);
    }
}
