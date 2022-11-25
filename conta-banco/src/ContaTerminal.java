import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //A fazer: Conhecer e importar a classe Scanner (OK)
        
        Scanner sc = new Scanner(System.in);

        //Exibir as mensagens para o nosso usuário
        System.out.printf("--------------------------------%n");
        System.out.printf("     Welcome to dio bank!       %n");
        System.out.printf("     (Created by henrique)      %n");
        System.out.printf("--------------------------------%n");
        System.out.println("");
        System.out.print("Type ur bank account number: ");
        int bankNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Now we need your agency: ");
        String agency = sc.nextLine();
        System.out.print("Type here your name: ");
        String name = sc.nextLine();
        //Apenas para fim de instancia (Amount não terá um set, terá um método de saque)
        System.out.print("Amount: ");
        float amount = sc.nextFloat();
        
        System.out.println("Here are your informations: ");

        System.out.printf("--------------------------------%n");
        System.out.printf("| %-10s | %-8s | %4s |%n", "ATTRIBUTE", "TYPE", "EXAMPLE");
        System.out.printf("--------------------------------%n");

        System.out.printf("| %-10s | %-8s | %04d |%n", "NUMBER", "integer",  bankNumber);
        System.out.printf("| %-10s | %-8s | %4s  |%n", "AGENCY", "String",   agency);
        System.out.printf("| %-10s | %-8s | %4s  |%n", "CLIENT NAME", "String",    name);
        System.out.printf("| %-10s | %-8s | %2f |%n", "AMOUNT", "float",     amount);

        System.out.printf("--------------------------------%n");
        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem da conta criada
    }
}
