package vetores.vetores07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Quartos[] quartos = new Quartos[10];
        boolean[] quartosOcupados = new boolean[10];
        int n;
        int caso;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bem vindo ao pensionato Dona Maria!");

        System.out.println("Por favor informe a quantia de pessoas que seram cadastradas: ");
        n = sc.nextInt();

        if (n > 10) {
            System.out.println(
                    "Temos apenas 10 quartos disponiveis, digite 1 para redigitar o número de pessoas ou 2 para sair: ");
            caso = sc.nextInt();
            switch (caso) {
                case 1:
                    System.out.println("Por favor informe a quantia de pessoas que seram cadastradas: ");
                    n = sc.nextInt();
                    break;

                case 2:
                    System.out.println("Até mais!");
                    sc.close();
                    return;
            }
        }

        for (int i = 0; i < n; i++) {
            quartos[i] = new Quartos();

            System.out.println("Digite seu nome: ");
            quartos[i].setNome(sc.next());

            System.out.println("Digite seu email: ");
            quartos[i].setEmail(sc.next());

            int quartoEscolhido;
            do {

                System.out.println("Quartos disponíveis: ");
                for (int j = 0; j < quartosOcupados.length; j++) {
                    if (!quartosOcupados[j]) {
                        System.out.println("Quarto " + (j + 1) + " disponível.");
                    }
                }

                System.out.println("Qual quarto deseja alugar? ");
                quartoEscolhido = sc.nextInt();

                if (quartoEscolhido < 1 || quartoEscolhido > 10) {
                    System.out.println("Número de quarto inválido. Tente novamente.");
                } else if (quartosOcupados[quartoEscolhido - 1]) {
                    System.out.println("Quarto já ocupado. Escolha outro quarto.");

                } else {
                    quartosOcupados[quartoEscolhido - 1] = true;
                    quartos[i].setQuarto(quartoEscolhido);
                }
            } while (quartos[i].getQuarto() == 0);

        }

        System.out.println("Quartos escolhidos: ");
        for (Quartos quarto : quartos) {
            if (quarto != null) {
                System.out.println(quarto.getQuarto() + ": " + quarto.getNome() + ", " + quarto.getEmail());
            }
        }
        sc.close();

    }

}
