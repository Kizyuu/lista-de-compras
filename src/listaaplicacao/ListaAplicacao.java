/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaaplicacao;

import java.util.Scanner;

public class ListaAplicacao {
    private static Scanner scanner = new Scanner(System.in);
    private static ListaCompra listaCompra = new ListaCompra();

    public static void main(String[] args) {
        boolean sair = false;
        int escolha = 0;
        printInstrucao();
        
        while(!sair){
            System.out.println("Selecione a opcao: ");
            escolha = scanner.nextInt();
            scanner.nextLine();
            
            switch(escolha){
                case 0:
                    printInstrucao();
                    break;
                case 1:
                    listaCompra.printListaCompra();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    mudarItem();
                    break;
                case 4:
                    removerItem();
                    break;
                case 5:
                    procurarItem();
                    break;
                case 6:
                    sair = true;
                    break;
            }
        }
    }
    public static void printInstrucao(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - para mostrar as opcoes de escolhas");
        System.out.println("\t 1 - para mostrar os itens da lista de compra");
        System.out.println("\t 2 - para adicionar item na lista");
        System.out.println("\t 3 - para mudar item na lista");
        System.out.println("\t 4 - para remover item na lista");
        System.out.println("\t 5 - para procurar item na lista");
        System.out.println("\t 6 - para sair");
    }
    
    public static void addItem(){
        System.out.println("Por favor coloque o item de mercadoria: ");
        listaCompra.addItemLista(scanner.nextLine());
    }
    
    public static void mudarItem(){
        System.out.println("Selecione o numero do item: ");
        int itemNo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Insira o item para realocar: ");
        String novoItem = scanner.nextLine();
        listaCompra.mudarItem(itemNo - 1, novoItem);
    }
    
    public static void removerItem(){
        System.out.println("Insira o numero do item: ");
        int itemDel = scanner.nextInt();
        scanner.nextLine();
        listaCompra.removerItem(itemDel -1);
    }
    
    public static void procurarItem(){
        System.out.println("Insira o item para procurar: ");
        String procurarItem = scanner.nextLine();
        
        if(listaCompra.encontrarItem(procurarItem)!= null){
            System.out.println("Encontrou "+procurarItem+" na lista de compras"); 
        }
        else {
            System.out.println(procurarItem+ " nao esta na lista de compras");
        }
    }
    
}
