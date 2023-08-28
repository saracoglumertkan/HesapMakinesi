package HesapMakinesi;

import java.util.Scanner;

public class Makine {

    public static void main(String[] args) {

        double n1, n2;
        int selection;
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz: ");
        n1 = input.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        n2 = input.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçiniz: \n 1- Toplama \n 2- Çıkarma \n 3-Bölme \n 4- Çarpma");
        selection = input.nextInt();

        switch (selection){
            case 1:
                System.out.println(n1+n2);
                break;
            case 2:
                System.out.println(n1-n2);
                break;
            case 3:
                System.out.println(n1/n2);
                break;
            case 4:
                System.out.println(n1*n2);
                break;
            default:
                System.out.println("Geçersiz seçim yaptınız!");
        }

    }
}
