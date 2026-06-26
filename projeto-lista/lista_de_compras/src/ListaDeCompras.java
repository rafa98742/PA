import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeCompras {
    public static void main(String[] args) throws Exception {

       Scanner inUser = new Scanner(System.in);
       ArrayList<String> lista = new ArrayList<>();
       
       int opcaoLista = 0;
       int opcao = 0;
       String novoItem = ""; 
       
       
            do{
                try{
                    System.out.println("""
                    Bem vindos ao programa lista de compras

                    Escolha a opção desejada:

                    1 - Criar uma nova lista de compras
                    2 - Sair

                    """);
                    opcaoLista = inUser.nextInt();
                    inUser.nextLine();

                    switch(opcaoLista){
                        case 1 -> {
                            System.out.println("Lista Criada com sucesso");

                            do{
                                System.out.println("""
                                        Escolha a opção desejada:
                                        1 - Adicionar um item da lista
                                        2 - Remover item da lista
                                        3 - Mostrar lista de compras
                                        4 - Alterar item da Lista
                                        5 - Limpar lista de compras
                                        6 - Sair
                                        """);
                                    
                                opcao = inUser.nextInt();
                                inUser.nextLine();
                                    
                                switch(opcao){
                                case 1 -> {
                                    System.out.println("Você escolheu criar um item da lista");
                                    System.out.println("Digite o nome do produto: ");                                    

                                    novoItem = inUser.nextLine();
                                    lista.add(novoItem);
                                    
                                }

                                case 2 ->{
                                    System.out.println("Você escolheu remover um item da lista");
                                    System.out.println("Digite o número do item que deseja remover");
                                    int remover = inUser.nextInt();
                                    lista.remove(remover-1);
                                }

                                case 3 ->{
                                    System.out.println("Você escolheu ver a lista");
                                    int posicao = 0;

                                    if (lista.size() > 0) {
                                        for (String item : lista) {
                                            System.out.printf("%d - %s%n", posicao + 1, item);
                                            posicao++;
                                        }
                                    } else {
                                        System.out.println("A lista está vazia");
                                    }
                                    
                                    System.out.println("");   
                                }

                                case 4 ->{
                                    System.out.println("Lista limpa com sucesso");
                                    lista.clear();
                                }

                                }
                           
                             }while(opcao !=5);                    


                            
                        }
                        case 2 -> System.out.println("Obrigado por usar o nosso programa");
                        default -> System.out.println("Erro: Entrada inválida");
                    }
            
                }catch(Exception erro){
                    System.out.println("Erro: Entrada invalida");
                    inUser.nextLine();
                    opcaoLista = 1;
                }
            
            }while(opcaoLista != 2);        
       
       inUser.close();
    }
}