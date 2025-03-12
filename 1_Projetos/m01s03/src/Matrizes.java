public class Matrizes {
    public static void main(String[] args) {
        int[][] matriz1;
        matriz1 = new int[3][3];

        matriz1[0][2] = 5;

        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                System.out.println("Linha: " + linha + " & Coluna: " + coluna);
                matriz1[linha][coluna] = linha+coluna;
                System.out.println(matriz1[linha][coluna]);
            }
        }
    }
}
