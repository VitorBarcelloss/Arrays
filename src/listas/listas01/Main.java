package listas.listas01;

import java.util.ArrayList;
import java.util.Collections;
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

        Collections.sort(lista);

       

        System.out.println("Maior valor é: "+ lista.get(lista.size()-1));

        System.out.println("Os valores da lista são: "+lista.toString());

        lista.remove(lista.size()-1);

        System.out.println("Os valores atuais da lista são: "+lista.toString());

    }
}
