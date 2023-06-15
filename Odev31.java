package Odev31;
import java.util.Scanner;

//Kullanıcıdan ikili sayı girmesini isteyen ve karşılık gelen ondalık değerini gösteren bir program yazınız..


public class Odev31 {
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Bir ikili sayı giriniz (örnek:11010) : ");
        String ikili_sayi= input.nextLine(); //sayiyi string olarak aliyoruz

        int ondalik_sayi= Integer.parseInt(ikili_sayi,2); //parseInt ile string sayiyi int olarak ondalik türüne dönüstürüyoruz
        //sonda verdigimiz 2 parametresi ile sayi sistemini belirttik
        
        System.out.println("Girdiğiniz sayının ondalık değeri: " + ondalik_sayi);
        
    }
	
}
