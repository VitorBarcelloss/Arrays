package vetores.vetores08;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double soma = 0;
        double media;
        int menores = 0;
        

        System.out.println("Quantas pessoas seram cadastradas? ");
        n = sc.nextInt();
        Pessoa[] pessoa = new Pessoa[n];
        for (int i = 0; i < n; i++) {
            pessoa[i] = new Pessoa();
            System.out.println("Digite o seu nome: ");
            pessoa[i].setNome(sc.next());
            System.out.println("Digite sua idade: ");
            pessoa[i].setIdade(sc.nextInt());
            System.out.println("Digite sua altura: ");
            pessoa[i].setAltura(sc.nextDouble());
        }

        for (Pessoa pessoas : pessoa) {
            if (pessoas.getIdade() < 16) {
                menores++;
            }
            soma += pessoas.getAltura();
        }

        double porcentagem = (100 * menores) / n;
        media = soma / pessoa.length;

        System.out.printf("Altura média: %.2f \n", media);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");
        for (Pessoa pessoas : pessoa) {
            if (pessoas.getIdade() < 16) {
                System.out.println(pessoas.getNome());
            }
        }
        sc.close();
    }
}
