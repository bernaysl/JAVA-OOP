//oyun dolap bulmacası

package Odev51;

public class Odev51 {
	public static void main(String[] args) {
	 boolean[] dolap = new boolean[100]; // 100 booelan elemandan olusan dizi olusturuyoruz
     for (int i = 1; i <= 100; i++) {
         for (int j = i - 1; j < dolap.length; j += i) { //her dolapta islem yapması icin loop kullandım
        	 dolap[j] = !dolap[j]; // Dolap açıksa kapat kapalıysa aç
         }
     }
     System.out.println("Açık dolaplar: ");
     for (int i = 0; i < dolap.length; i++) { //bu dongude acık olan dolapları yazdıracak
         if (dolap[i]) {
             System.out.print((i + 1) + " "); 
         }
     }
}
}
