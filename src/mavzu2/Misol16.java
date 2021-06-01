package mavzu2;

import java.util.Scanner;

public class Misol16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Uch xonali son kiriting :");
        int a=sc.nextInt();
        System.out.println(" Natija : "+(a-(a/100)*100)/10+a/100+(a-(a/100)*100-((a-(a/100)*100)/10)*10));

    }
}
