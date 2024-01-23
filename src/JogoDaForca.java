import java.util.Scanner;

public class JogoDaForca {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String palavraSecreta = escolherPalavraSecreta();
            char[] palavraAdivinhada = new char[palavraSecreta.length()];
            for (int i = 0; i < palavraAdivinhada.length; i++) {
                palavraAdivinhada[i] = '_';
            }
            int tentativasRestantes = 6;
            boolean jogoEmAndamento = true;
            while (jogoEmAndamento) {
                exibirEstadoAtual(palavraAdivinhada, tentativasRestantes);
                char letra = pedirLetra();
                boolean letraAdivinhada = verificarLetra(palavraSecreta, palavraAdivinhada, letra);
                if (!letraAdivinhada) {
                    tentativasRestantes--;
                }
                if (tentativasRestantes == 0) {
                    exibirEstadoAtual(palavraAdivinhada, tentativasRestantes);
                    System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
                    jogoEmAndamento = false;
                } else if (verificarVitoria(palavraAdivinhada)) {
                    exibirEstadoAtual(palavraAdivinhada, tentativasRestantes);
                    System.out.println("Parabéns! Você adivinhou a palavra!");
                    jogoEmAndamento = false;
                }
            }
            scanner.close();
        }
        public static String escolherPalavraSecreta() {
            String[] palavras = {"java", "programacao", "computador", "desenvolvimento", "algoritmo"};
            int indice = (int) (Math.random() * palavras.length);
            return palavras[indice];
        }
        public static void exibirEstadoAtual(char[] palavraAdivinhada, int tentativasRestantes) {
            System.out.println("Palavra: " + new String(palavraAdivinhada));
            System.out.println("Tentativas restantes: " + tentativasRestantes);
        }
        public static char pedirLetra() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite uma letra:");
            return scanner.next().charAt(0);
        }
        public static boolean verificarLetra(String palavraSecreta, char[] palavraAdivinhada, char letra) {
            boolean letraAdivinhada = false;
            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraAdivinhada[i] = letra;
                    letraAdivinhada = true;
                }
            }
            return letraAdivinhada;
        }
        public static boolean verificarVitoria(char[] palavraAdivinhada) {
            for (char c : palavraAdivinhada) {
                if (c == '_') {
                    return false;
                }
            }
            return true;
        }

}

