/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication29;
import java.util.Scanner;
/**
 *
 * @author hekimcanaktas
 */
public class JavaApplication29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int islem;
        double sonuc=0,birinciSayi,ikinciSayi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        birinciSayi = scanner.nextDouble();
        System.out.println("İkinci sayıyı giriniz: ");
        ikinciSayi = scanner.nextDouble();
        System.out.println("Bir işlem seçiniz (Toplama için 1,çıkartma için 2,çarpma için 3,bölme için 4 seçiniz):");
        
        islem = scanner.nextInt();
        
        switch(islem){
            case 1:
               sonuc = birinciSayi+ ikinciSayi;
               break;
               
            case 2:
               sonuc = birinciSayi - ikinciSayi;
               break;
               
            case 3:
               sonuc = birinciSayi * ikinciSayi;
                break;

            case 4:
                 sonuc = birinciSayi/ ikinciSayi;
                 break;
            default:
                System.out.println("Geçersiz işlem girdiniz !!");
                break;
        }
        
        System.out.println("İşlem sonucu: " + sonuc);
        
    }
    
}
