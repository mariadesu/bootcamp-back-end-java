import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Infos
        int numero;
        String agencia, nomeCliente, linha;
        float saldo;
        Scanner sc = new Scanner(System.in);

        //Criando a conta
        System.out.println("Bem-vindo ao S Banco!\nPara criar uma conta, preencha as infos");
        System.out.println("Digite o numero:");
        numero = sc.nextInt();
        linha = sc.nextLine();
        System.out.println("Digite a agencia:");
        agencia = sc.nextLine();
        System.out.println("Digite o nome do cliente:");
        nomeCliente = sc.nextLine();
        System.out.println("Digite o saldo:");
        saldo = sc.nextFloat();

        //Mensagem final
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco!\nSua agência é " + agencia + ", conta " + numero + " e seu saldo R$" + saldo + " já está disponível para saque.");

    }
}