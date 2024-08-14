
import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String name;
        String agencia;
        int numero;
        BigDecimal saldo;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor, digite o seu nome: ");
        name = entrada.nextLine();
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = entrada.nextLine();
        System.out.println("Por favor, digite número da Conta: ");
        numero = entrada.nextInt();
        System.out.println("Por favor, digite o seu saldo: ");
        saldo = entrada.nextBigDecimal();
        entrada.close();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco. A sua agência é " 
        + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}