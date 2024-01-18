import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite numero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0)
            System.out.println("o numero é par: " + numero);
        else {
            System.out.println("O numero é impar: " + numero);
        }
        scanner.close();

    }
}
