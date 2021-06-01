package mavzu2;

import javafx.scene.transform.Scale;
import jdk.nashorn.internal.runtime.regexp.joni.ScanEnvironment;

import java.util.Scanner;

public class misol30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Yilni kiritng :");
        int a=sc.nextInt();
        System.out.println((a/100+1)+" yillikka kiradi!!! "+a+"-yil");
    }
}
