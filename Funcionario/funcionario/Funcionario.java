package Funcionario.funcionario;

public class Funcionario {
  public String nome;
  public double SalarioBruto;
  public double imposto;

  public double SalarioLiquido(){
    return SalarioBruto - imposto;
  }

  public void AumentarSalario(double porcentagem){
    SalarioBruto += SalarioBruto * porcentagem / 100.0  ;
  }
  public String toString(){
    return nome + ", Salário: $ " + String.format("%.2f", SalarioLiquido());
  }
}
