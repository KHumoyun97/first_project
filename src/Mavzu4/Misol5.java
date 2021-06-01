package Mavzu4;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Scanner;

public class Misol5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Uchta son kiriting  :");
        int x=sc.nextInt();
        int x1=sc.nextInt();
        int x2=sc.nextInt();
        if ( x>0&&x1<0&&x2<0){
            System.out.println(" Bittasi mustabt Ikkitasi manfiy son!!!");
        }else  if ( x>0&&x1>0&&x2<0){
            System.out.println(" Ikkitasi mustabt Bittasi mafiy son!!!");
        }
    }
}
