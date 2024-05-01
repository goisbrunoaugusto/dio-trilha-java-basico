import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome : ");
        String nome = sc.nextLine();

        System.out.println("Digite o numero da agencia : ");
        String agencia = sc.next();

        System.out.println("Digite o numero da conta : ");
        Integer conta = sc.nextInt();

        System.out.println("Digite o valor a ser depositado : ");
        BigDecimal saldo = sc.nextBigDecimal();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + conta + " e seu saldo "+ saldo + " já está disponível para saque");
    }
}
