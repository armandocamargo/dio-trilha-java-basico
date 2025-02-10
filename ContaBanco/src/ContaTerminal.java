import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    


    public static void main(String[] args) {
        
        int conta = 0;

        String agencia;
    
        String nomeCliente;
    
        double saldo;

        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Seja bem vindo(a) ao banco");

        System.out.println("*****************************************");

        System.out.println("Por favor, digite o número da Agência !");
        conta = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Por favor, digite a agencia com digito !");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        nomeCliente = entrada.nextLine();

        System.out.println("Por favor, digite o seu saldo !");
        saldo = entrada.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, conta, saldo);

        entrada.close();
    }


}
