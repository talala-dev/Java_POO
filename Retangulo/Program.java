import java.util.Scanner;
import java.util.Locale;
import entities.Retangulo;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
  
    Retangulo rectangle = new Retangulo();
    
    System.out.println("Enter the rectangle widht and height: ");
    rectangle.height = sc.nextDouble();
    rectangle.width = sc.nextDouble();
    System.out.println("Area: "+ rectangle.area());
    System.out.println("Perimeter: " +rectangle.perimeter());
    System.out.println("Diagonal : " + rectangle.diagonal());

    sc.close();
  }
}
