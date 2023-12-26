import java.util.Scanner;

public class CalculoMedia {
    public static void main(String[] args) {
        // Crie um objeto Scanner para a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicite ao usuário para inserir quatro números
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = scanner.nextDouble();

        System.out.print("Digite o quarto número: ");
        double numero4 = scanner.nextDouble();

        // Calcule a média
        double media = (numero1 + numero2 + numero3 + numero4) / 4;

       // Valor total
        double total = (numero1 + numero2 + numero3 + numero4);
        
        //Exibir total
        System.out.println("A soma total dos quatro numero é: " + total);

        // Exiba o resultado
        System.out.println("A média dos quatro números é: " + media);

        // Fecha o Scanner 
        scanner.close();
    }
}
