package ex4;
import java.util.ArrayList;
import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {
        ArrayList<String> pessoas = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        
    int man = 0;
    int fem = 0;
    float media = 0;
    int menor = Integer.MAX_VALUE;
    int maior = Integer.MIN_VALUE;
    int soma = 0;

        // Loop de cadastro de nomes
        while (true) {
            System.out.print("Cadastre os nomes (ou 'sair' para encerrar): ");
            String nome = scn.nextLine();
            
//          if pra sair do loop
            if (nome.equalsIgnoreCase("sair")) {
                break;
            }
            
//          Cadastrar a idade
            System.out.print("Digite a idade: ");
            int idade = Integer.parseInt(scn.nextLine());
            
//          Cadastrar a idade
            System.out.print("Digite o gênero, Masculino(M), Feminino(F): ");
            String genero = scn.nextLine();
            
//          Cadastrar o peso
            System.out.println("Digite o peso:");
            int peso = Integer.parseInt(scn.nextLine());
            
//          Cadastrar o peso
            System.out.println("Digite a altura:");
            int altura = Integer.parseInt(scn.nextLine());
            
            
//          Pra adicionar as pessoas
            pessoas.add(nome);
            pessoas.add(String.valueOf(idade));
            pessoas.add(String.valueOf(peso));
            pessoas.add(String.valueOf(altura));
            pessoas.add(genero);
            
            
//          Pra fazer a contagem de homens e mulheres  
            if ("M".equals(genero)){
                man++;
            } else if ("F".equals(genero)){
                fem++;
            }
            
//          Maior e menor idade
            if(idade > maior){
                maior = idade;
            }
            
            if(idade < menor){
                menor = idade;
            }
            
//          Soma das idades
            soma += idade;
        }
        
        
        // Exibindo os nomes cadastrados
        System.out.println("=======================");
        System.out.println("Pessoas cadastradas:");
        System.out.println("=======================");
        for (int i = 0; i < pessoas.size(); i++) {
            String nome = pessoas.get(i);
            int idade = Integer.parseInt(pessoas.get(i + 1));
            String peso = pessoas.get(i + 2);
            String altura = pessoas.get(i + 3);
            
//          tentativa de imprimir os resultados
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Peso: " + peso);
            System.out.println("Altura: " + altura);
            System.out.println("------------------------");
            
            System.out.println("Quantidade de homens: " + man);
            System.out.println("Quantidade de mulheres: " + fem);
            System.out.println("------------------------");
            
            
            System.out.println("Maior Idade: " + maior);
            System.out.println("Menor Idade: " + menor);
            System.out.println("------------------------");
            
//          Media das Idades
            if(pessoas.size() > 0){
                 media = soma / pessoas.size()/ 10; 
            }  
            System.out.println("Média das idades: " + media);
                    
            
//          Adição do i++ pra poder pular o índice para pular a idade na próxima iteração
            i++;
        }

        // Fechando o Scanner
        scn.close();
        
    }
}
