package mavzu2;

import java.util.Scanner;

public class Misol28 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" K soni kiriting. k soni 365 gacha bo'lgan son oraliqni kiriting !!!");
        int k=sc.nextInt();
        System.out.println(" 1-7 gacha son kiriting N soni :");
        int n=sc.nextInt();
        int s2=k%7;
        System.out.println(" Natija : "+s2);
        switch ((7+n)-s2){
            case 1:
                System.out.println(" Dushanba");break;
            case 2:
                System.out.println(" Seshanba");break;
            case 3:
                System.out.println(" Chorshanba");break;
            case 4:
                System.out.println(" Payshanba");break;
            case 5:
                System.out.println(" Juma");break;
            case 6:
                System.out.println(" shanba");break;
            case 7:
                System.out.println(" Yakshanba");break;
        }
    }
}
