package mavzu5;

import java.util.Scanner;

public class Misol1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(" 1 da 7 gacha son kiriting :");
        int x=sc.nextInt();
        switch (x){
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
                System.out.println(" Shanba");break;
            case 7:
                System.out.println(" Yakshabna");
                default:
                    System.out.println(" Notugri raqam kiritldi : ");
        }
    }
}
