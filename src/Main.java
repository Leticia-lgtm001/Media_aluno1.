import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digiye nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();

        double media = (n1 + n2 + n3) / 3;

        System.out.println("Aluno: " + nome);
        System.out.printf("Media: %.2f%n", media);

        scanner.close();
    }
}
