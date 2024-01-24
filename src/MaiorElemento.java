public class MaiorElemento {
    public static void main(String[] args){
        int [][] matriz = {{1,2,4}, {5,8,9}, {23,24,46},{14,21,11}};

        int maiorElemento = encontrarMaiorElemento(matriz);
    }
    private static int encontrarMaiorElemento(int[][] matriz) {
        int maiorElemento =  matriz [0][0];
        return maiorElemento;
    }


}
