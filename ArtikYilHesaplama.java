package Giris;
import java.util.Scanner;
public class ArtikYilHesaplama {
    public static void main(String[] args) {
        int yil,artikYil,artikYil400,artikYil100;

        Scanner pipi = new Scanner(System.in);
        System.out.print("Yıl girin : ");
        yil = pipi.nextInt();

        artikYil100 = yil % 100;
        artikYil = yil % 4;
        artikYil400 = yil % 400;

        if (artikYil100 == 0){
            if (artikYil400 == 0){
                System.out.println("Artık yıldır.");
            }else {
                System.out.println("Artık yıl değildir.");
            }
        }else {
            if (artikYil == 0){
                System.out.println("Artık yıldır.");
            }else {
                System.out.println("Artık yıl değildir.");
            }
        }

    }
}
