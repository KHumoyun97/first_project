package mavzu2;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Misol6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Ikki xonali son kirting :");
        int a=sc.nextInt();
        System.out.println(" O'nlik xonasi : "+(a/10));
        System.out.println(" birlik xonasi : "+(a-(a/10)*10));
    }
}
