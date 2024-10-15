package entities;

public class Retangulo {
  public double width;
  public double height;

  public double Area() {
    return width * height;
  }

  public double Perimeter() {
    double p = 2 * (height + width);
    return p;
  }

  public double Diagonal() {
    double d = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    return d;
  }
}
