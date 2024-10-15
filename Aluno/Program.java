package Aluno;
import java.util.Scanner;
import java.util.Locale;
import Aluno.entities.Estudante;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    Estudante estudante = new Estudante();
    System.out.println("Digite os dados do Aluno(nome e notas): ");
    estudante.nome = sc.nextLine();
    estudante.nota1 = sc.nextDouble();
    estudante.nota2 = sc.nextDouble();
    estudante.nota3 = sc.nextDouble();
    System.out.printf("Nota final: %.2f%n", estudante.notaFinal());
    if(estudante.notaFinal() < 60){
      System.out.println("REPROVADO");
      System.out.printf("FALTOU %.2f", estudante.pontosFaltantes());
    }else{
      System.out.println("APROVADO");
    }

    sc.close();
  }
}
