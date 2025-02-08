package encapsulamento.EXdeFIc;

import encapsulamento.EXdeFIc.entitites.Account;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account = null;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit?(Y/N)");
        char resposta = sc.next().charAt(0);
        if(resposta == 'Y' || resposta == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        }if(resposta == 'N' || resposta == 'n') {
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.print("Account Data:");
        System.out.println(account);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.print("Update account data:");
        System.out.print(account);
        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.print("Update account data:");
        System.out.print(account);

        sc.close();
    }
}
