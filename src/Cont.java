public class Cont {
    public static void main(String[] args) {

        int i = 1;
        int max = 10;

        System.out.println("contando ate " + max);


        while (i <= max) {
            System.out.println("valor de i : " + i);
            i++;

            System.out.println("Valor de i; " + i); //Valor de 11

            do {
                i++;
                System.out.println("valor de i : " + i);
            } while (i < 15);

            System.out.println(i);
        }

    }

}
