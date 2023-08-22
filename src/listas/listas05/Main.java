package listas.listas05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Funcionarios> funcionarios = new ArrayList<>();
        int n;
        int id;
        boolean existe;
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos funcionarios seram cadastrados?");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Funcionarios funcionario = new Funcionarios();
            System.out.println("Digite o nome do funcionario #" + (i + 1));
            funcionario.setNome(sc.next());
            System.out.println("Digite seu salario: ");
            funcionario.setSalario(sc.nextDouble());
            do {
                existe = false;
                System.out.println("Digite seu id: ");
                id = sc.nextInt();
                for (Funcionarios func : funcionarios) {
                    if (func.getId() == id) {
                        System.out.println("Este id ja existe escolha novamente: ");
                        existe = true;
                    }
                }
            } while (existe);
            funcionario.setId(id);
            funcionarios.add(funcionario);
        }

        System.out.println("Digite o Id do funcionario que irá receber o aumento: ");
        id = sc.nextInt();
        
        boolean idExiste=false;
        for(Funcionarios func: funcionarios){
            if(func.getId()==id){
            System.out.println("Funcionario existe");
            System.out.println("Qual deve ser a porcentagem de aumento do salario?");
            double porcentagem = sc.nextDouble();
            double salario = func.getSalario()*((porcentagem+100)/100);
            func.setSalario(salario);
            idExiste=true;
            }
        }
        if(!idExiste){
            System.out.println("Id não encontrado!");
            sc.close();
            return;
        }

        System.out.println("A listagem dos funcionarios é: ");
       int i=1;
        for(Funcionarios func: funcionarios){
            System.out.println("Funcionario #"+i);
            System.out.println("Id:"+func.getId());
            System.out.println("Nome:"+func.getNome());
            System.out.println("Salario:"+func.getSalario());
        }
        sc.close();
    }
}
