package listas.listas03;

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
       
        for(int a:lista){
            if(a==19){
                System.out.println("O número 19 esta na lista!");
            } 

            if(a==25){
                System.out.println("O numero 25 esta na lista!");
            } 
        }

    }
}
