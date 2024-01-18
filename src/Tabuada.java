import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para obter o resultado desejado na tabuada : ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do numero" + numero + " : ");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        scanner.close();
        
    }
}




