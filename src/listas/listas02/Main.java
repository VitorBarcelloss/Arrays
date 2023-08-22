package listas.listas02;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> lista = new ArrayList<>();

        lista.add(15);
        lista.add(8);
        lista.add(23);
        lista.add(19);
        lista.add(27);
        lista.add(5);
        int soma=0;
        for(int a: lista){
            soma+=a;
        }

        double media = soma/lista.size();

        System.out.println("A média da lista é: "+ media);

    }
}
