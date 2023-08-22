package matrizes.matrizes07;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
    Random n = new Random();
    int[][] array = new int[4][4];
    int linha=0;
    int coluna=3;

    for(int i=0;i<array.length;i++){
        for(int j=0;j<array[i].length;j++){
            array[i][j] = n.nextInt(30);
        }
        }
        
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]); 
        }

        int maiorValor = array[0][array[0].length - 1];

        for (int i = 1; i < array.length; i++) {
            for(int j=0; j<array[i].length;j++){
            int maiorAtual = array[i][j];
            if (maiorAtual > maiorValor) {
                maiorValor = maiorAtual;
                linha=i;
                coluna=j;
            }
        }
        }

        System.out.println("O maior valor nos subarrays é: " +maiorValor);
        System.out.println("A posição do valor mais alto é: "+linha+"x"+coluna);
    }
}
