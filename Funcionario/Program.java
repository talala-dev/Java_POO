package Funcionario;

import java.util.Locale;
import java.util.Scanner;

import Funcionario.funcionario.Funcionario;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();

    System.out.print("Nome: ");
    funcionario.nome = sc.nextLine();

    System.out.print("Salário Bruto: ");
    funcionario.SalarioBruto = sc.nextDouble();

    System.out.print("Impostos: ");
    funcionario.imposto = sc.nextDouble();

    System.out.println("Funcionário: " + funcionario.toString());

    System.out.print("Qual a porcentagem de aumento do salário?: ");
    funcionario.AumentarSalario(sc.nextDouble());

    System.out.println();
    System.out.println("Update data: " + funcionario.toString());

    sc.close();
  }
}
