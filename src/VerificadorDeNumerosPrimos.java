import java.util.Scanner;

public class VerificadorDeNumerosPrimos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro : ");
        int numero = scanner.nextInt();

        if (numero <= 1) {
            System.out.println("O numero" + numero + " não é um numero primo");


        }
        for (int i = 2; i <= numero ; i++) {
            if (numero % i == 0 && i == numero) {
                System.out.println("O numero" + numero + " é um numero primo");
                break;
            } else if (numero % i == 0) {
                System.out.println("o numero" + numero + " não é primo ");
            }
        }
        
    }

}
