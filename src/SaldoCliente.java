public class SaldoCliente {
    public static void main(String[] args) {

        int [] cliente1 = {1500 , -2500, 300, 100};
        int [] cliente2 = {2000 , 1000, -1200, -800};
        int [] cliente3 = {1000, 4500, 2300 , 900};

        int saldoFinalClinte1 = calcularSaldoFinal (cliente1);
        int saldoFinalClinte2 = calcularSaldoFinal (cliente2);
        int saldoFinalClinte3 = calcularSaldoFinal (cliente3);

        System.out.println("Saldo final do cliente1: "  + saldoFinalClinte1);
        System.out.println("Saldo final do cliente1: "  + saldoFinalClinte2);
        System.out.println("Saldo final do cliente1: "  + saldoFinalClinte3);

    }

    private static int calcularSaldoFinal(int[] cliente) {
        return 0;

    }

}
