package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    // owner ZELAXSUS
    public static void main(String[] args) {
        System.out.println("BİLDİRİ : 0 VE 1000 ARASINDAKİ TUTAR KDV ORANI %0.08'DİR.DİĞER YÜKSEK TUTARLAR KDV ORANI %18 OLARAK ALINMIŞTIR");
        double tutar;
        double kdvtutar=0.18;
        double kdvtutar2=0.08;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen fiyat giriniz: ");
        tutar=input.nextInt();

        if ((tutar < 1000) && tutar >0){
           double toplamtutar2= kdvtutar2* tutar;
            System.out.println("KDV TUTAR: "+ kdvtutar2);
            System.out.println("TUTAR: " +(toplamtutar2 + tutar) );
        }
        else {
            double toplamtutar= kdvtutar  * tutar;
            System.out.println("KDV: "+ toplamtutar);
            System.out.print("TOPLAM TUTAR: "+ (toplamtutar+tutar));
        }






    }
}
