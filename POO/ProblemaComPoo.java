package Exercicios.POO;

import java.util.Scanner;
import Exercicios.POO.Triangle;
import java.util.Locale;

public class ProblemaComPoo {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    // cria as variaveis com o tipo da Classe "Triangle"
    Triangle x, y;
    // Identa as variaveis com o atributo da classe
    x = new Triangle();
    y = new Triangle();
    //pedir as medidas do triangulo X
    System.out.println("Enter the measures of triangle X: ");
    // valores do triangulo X com o atributo da classe Triangle.
    x.a = sc.nextDouble();
    x.b = sc.nextDouble();
    x.c = sc.nextDouble();
     //pedir as medidas do triangulo Y
    System.out.println("Enter the measures of triangle Y: ");
    // valores para o triangulo Y
    y.a = sc.nextDouble();
    y.b = sc.nextDouble();
    y.c = sc.nextDouble();

    // area do triangulo X
    double areaX = x.area();
      // area do triangulo Y
    double areaY = y.area();
    // escreve a area do triangulo X
    System.out.printf("Triangle X area : %.4f%n ", areaX);
    // escreve a area do triangulo Y
    System.out.printf("Triangle Y area : %.4f%n ", areaY);
    // condicional para checar qual o maior
    if (areaY > areaX) {
      System.out.printf("Larger area is Y: %.4f%n ", areaY);
    } else {
      System.out.printf("Larger area is X: %.4f%n", areaX);
    }

    sc.close();
  }
}
