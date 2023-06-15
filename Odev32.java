
//Kullanıcıdan üç ülke girmesini isteyen ve bunları azalan sırada gösteren bir program yazınız

package Odev32;
import java.util.Arrays;
import java.util.Scanner;
public class Odev32 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
        String[] ulkeler = new String[3];
        //üç elemanlı bir array olusturup aldığım ülke isimlerini buraya yazdıracağım

        System.out.println("3 adet ülke ismi giriniz: ");

        System.out.print("birinci ulke: ");
        ulkeler[0] = input.nextLine();
        System.out.print("ikinci ulke: ");
        ulkeler[1] = input.nextLine();
        System.out.print("ucuncu ulke: ");
        ulkeler[2] = input.nextLine();


        Arrays.sort(ulkeler, (s1, s2) -> s2.compareTo(s1)); 
        //array sıralarken tersten sıralama yapmak icin s2 buyukse s1'den karsılastırması yazdık

        System.out.println("Ülkelerin tersten sıralanmış hali: ");
        for (String ulke : ulkeler) {
            System.out.println(ulke);
        }
    }
}
