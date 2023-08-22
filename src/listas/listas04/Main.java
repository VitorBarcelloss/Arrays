package listas.listas04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Quantos números deseja digitar? ");
        int n = sc.nextInt();

        for(int i=0; i<n;i++){
            System.out.println("Digite o número: ");
            numero = sc.nextInt();

            if(numero%2==0){
                pares.add(numero);
            }
            if(numero%2==1){
                impares.add(numero);
            }
        }

        System.out.println("Pares: "+pares.toString());
        System.out.println("Impares: "+impares.toString());
        sc.close();
    }
}
