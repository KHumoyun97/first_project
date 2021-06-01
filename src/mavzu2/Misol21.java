package mavzu2;

import java.util.Scanner;

public class Misol21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" N ni sekundda kiriting  :");
        int a=sc.nextInt();
        System.out.println(" Kun boshidan boshlab "+a/60+" minut "+(a-(a/60)*60)+" sekund vaqt o'tdi!!!");

    }
}
