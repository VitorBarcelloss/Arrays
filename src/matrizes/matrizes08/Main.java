package matrizes.matrizes08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número de linhas m: ");
        int m = sc.nextInt();

        System.out.print("Digite o número de colunas n: ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        
        System.out.println("Digite os numeros da matriz:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.print("Digite um valor igual a algum digitado na matriz: ");
        int x = sc.nextInt();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] == x) {
                    System.out.println("Valor encontrado em (" + i + ", " + j + "): " + x);

                    if (i > 0) {
                        System.out.println("Acima: " + matriz[i - 1][j]);
                    }
                    if (i < m - 1) {
                        System.out.println("Abaixo: " + matriz[i + 1][j]);
                    }
                    if (j > 0) {
                        System.out.println("Esquerda: " + matriz[i][j - 1]);
                    }
                    if (j < n - 1) {
                        System.out.println("Direita: " + matriz[i][j + 1]);
                    }

                    System.out.println();
                }
            }
        }

        sc.close();
    }
}

