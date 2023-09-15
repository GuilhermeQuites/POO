import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial do Rendimento: ");
        double vrInicial = scanner.nextDouble();

        System.out.println("Digite a taxa de juros: ");
        double txJuros = scanner.nextDouble();

        System.out.println("Digite o numero de meses para o Rendimento:");
        int numMeses = scanner.nextInt();

        Rendimento r1 = new Rendimento(vrInicial,txJuros,numMeses);
        r1.calcularRendimento();



    }
}
