
//kullanıcıdan bir dizi girmesini isteyen ve dizinin elemanları toplamını döndüren test programı

package Odev62;
import java.util.Scanner;
public class Odev62 {
	public static double toplamArray(double[] dizi) {
		
	    double toplam = 0;
	    
	    for (int i = 0; i < dizi.length; i++) { //dizideki elemanlari tek tek topla
	    	
	      toplam += dizi[i];
	    }
	    return toplam;
	  }
	  
	  public static void main(String[] args) {
		  
	    Scanner input = new Scanner(System.in);

	    System.out.print("Kaç boyutlu bir dizi gireceksiniz?: ");
	    int boyut = input.nextInt();
	    
	    double[] dizi = new double[boyut];

	    for (int i = 0; i < boyut; i++) {
	    	
	      System.out.print( (i+1) + ". eleman: "); //dizideki elemanlari tek tek soracak
	      dizi[i] = input.nextDouble();
	      
	    }

	    double toplam = toplamArray(dizi); //burada metodu cagırıyoruz ve hesaplama yaptiriyoruz
	    System.out.println("Dizinin elemanlarının toplamı: " + toplam);
	  }
}
