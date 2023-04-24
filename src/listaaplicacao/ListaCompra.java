/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listaaplicacao;

import java.util.ArrayList;

public class ListaCompra {
    private ArrayList<String> listaCompra = new ArrayList<>();
    
    public void addItemLista(String item){
        listaCompra.add(item);
    }
    
    public void printListaCompra(){
        System.out.println("Voce tem "+ listaCompra.size() + " item(ns) na sua lista");
        for (int i = 0; i<listaCompra.size(); i++){
            System.out.println((i+1)+". "+listaCompra.get(i));
        }
    }
    
    public void mudarItem(int posicao, String novoItem){
        listaCompra.set(posicao, novoItem);
        System.out.println("O item "+(posicao+1)+" da lista de compra foi mudado");
    }
    
    public void removerItem(int posicao){
        String item = listaCompra.get(posicao);
        listaCompra.remove(posicao);
    }
    
    public String encontrarItem (String procurarItem){
        int posicao = listaCompra.indexOf(procurarItem);
        if (posicao >= 0){
            return listaCompra.get(posicao);
        }
        return null;
    }
}
