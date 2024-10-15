package entities;

public class Retangulo {
  public double width;
  public double height;

  public double area() {
    return width * height;
  }

  public double perimeter() {
    double p = 2 * (height + width);
    return p;
  }

  public double diagonal() {
    double d = Math.sqrt(Math.pow(height, 2) + Math.pow(width, 2));
    return d;
  }
}
