//kullanıcıdan bir liste girmesini isteyen ve liste sıralıysa true döndüren test programı. ilk eleman liste elemanı sayısını verir.

package Odev63;
import java.util.Scanner;
public class Odev63 {
    public static boolean siraliMi(int[] liste) {
    	
        for (int i = 0; i < liste.length-1; i++) {
        	
            if (liste[i] < liste[i+1]) {
                return false;
            }
        }
        return true;
        
    }
    
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Listedeki elemanları virgülle ayırarak girin: ");
        String[] strArr = input.nextLine().split(",");
        
        int eleman = strArr.length;
        
        int[] dizi = new int[eleman];
        
        
        for (int i = 0; i < eleman; i++) {
        	dizi[i] = Integer.parseInt(strArr[i].trim()); //dizi siralama, trim boslukları kaldirmaya yarar
        }

        
        if (siraliMi(dizi)) {
        	
            System.out.println("Liste " + eleman + " elemanlı ve azalan sırada sıralanmıştır.");
        } 
        else {
            System.out.println("Liste " + eleman + " elemanlı ve sıralı değildir.");
        }
        System.out.println("Liste: " + eleman + java.util.Arrays.toString(dizi));
       
    }

}

