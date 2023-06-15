package RegularPolygon;
import java.util.Scanner;

public class RegularPolygon {

	//degiskenler
	private int n;
    private double side;
    private double x;
    private double y;
    
    //Varsayılan değerlerle normal bir çokgen oluşturan arg içermeyen bir kurucu (yapıcı)
    public RegularPolygon() {
        this.n = 3;
        this.side = 1.0;
        this.x = 0.0;
        this.y = 0.0;
    }
    
    
    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    
    //Belirtilen kenar sayısı,
    //kenar uzunluğu ve x- ve y-koordinatları ile normal bir çokgen oluşturan bir kurucu (yapıcı)
    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }
    
    //Tüm değişkenleri için erişimci ve düzenleyici metodları 
    //(Her değişken için get ve set metodu). 
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
	
	
    //Çokgenin çevresini döndüren getPerimeter() metodu.
    public double getPerimeter() {
        return n * side;
    }
    
    //Çokgenin alanını döndüren getArea() metodu. 
    public double getArea() {
        return (n * side * side) / (4 * Math.tan(Math.PI / n));
    }
    
    
   

//test edecegimiz kısım, her nesne için çevresi ve alanı görüntülenecek
    public static void main(String[] args) {
        RegularPolygon polygon1 = new RegularPolygon();
        RegularPolygon polygon2 = new RegularPolygon(6, 4);
        RegularPolygon polygon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("Polygon 1 perimeter: " + polygon1.getPerimeter());
        System.out.println("Polygon 1 area: " + polygon1.getArea());
        System.out.println("Polygon 2 perimeter: " + polygon2.getPerimeter());
        System.out.println("Polygon 2 area: " + polygon2.getArea());
        System.out.println("Polygon 3 perimeter: " + polygon3.getPerimeter());
        System.out.println("Polygon 3 area: " + polygon3.getArea());
    }
 }
