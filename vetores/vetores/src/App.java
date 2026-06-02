import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner Entrada = new Scanner(System.in);
        System.out.println("Digite o seu nome");
        String nome = Entrada.nextLine();
        System.out.printf("O meu nome e: %s", nome);
        Entrada.close();
    }
}
