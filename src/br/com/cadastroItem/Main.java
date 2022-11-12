package br.com.cadastroItem;


import br.com.cadastroItem.views.Cadastro;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        ItemDeInformatica item1 = new ItemDeInformatica("2030", "Teclado", 
               new Date(), "10 dias", "Logitech"
                , "2 meses", "Teclado preto");
       
       
       List<ItemDeInformatica> itens = new ArrayList<>();
       ItemDeInformatica[] arrayItens = new ItemDeInformatica[4000];
       
       itens.add(item1);
       ItemDeInformatica item2 =  consultarItem(itens, "2030");
        deletarItem(itens, "2030");
        listarItens(itens);
        
    }
    
    public static void deletarItem(List<ItemDeInformatica> itens, String codigo){
        ItemDeInformatica itemDeletar =  consultarItem(itens, codigo);
        itens.remove(itemDeletar);
    }
    
    public static void editarItem(List<ItemDeInformatica> itens, String codigo){
        ItemDeInformatica itemEditar =  consultarItem(itens, codigo);
        int index = itens.indexOf(itemEditar);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o código do produto: ");
        itemEditar.codigo = sc.nextLine();
        
        System.out.println("Informe o nome do produto: ");
        itemEditar.nome = sc.nextLine();
        
        System.out.println("Informe o prazo de devolução do produto: ");
       itemEditar.prazoDevolucao = sc.nextLine();
        
        System.out.println("Informe a marca do produto: ");
        itemEditar.marca  = sc.nextLine();
        
        System.out.println("Informe a garantia do produto: ");
        itemEditar.garantia = sc.nextLine();
        
        System.out.println("Informe a descrição do produto: ");
        itemEditar.descricao = sc.nextLine();
        
         itens.set(index, itemEditar);
    }
    
    public static ItemDeInformatica  consultarItem(List<ItemDeInformatica> itens, String codigo){
        for(ItemDeInformatica item : itens){
            if(item.codigo.equals(codigo)){
//                System.out.println("Código: " + item.codigo);;
//            System.out.println("Nome: " + item.nome);
//            System.out.println("Data de entrada: " + item.dataEntrada);
//            System.out.println("Prazo de devolução: " + item.prazoDevolucao);
//            System.out.println("Marca: " + item.marca);
//            System.out.println("Garantia: " + item.garantia);
//            System.out.println("Descrição: " + item.descricao);
                return item;
            }
        }
        return null;
    }
   
    public static void listarItens(List<ItemDeInformatica> itens){
        for(ItemDeInformatica item : itens){
            System.out.println("Código: " + item.codigo);
            System.out.println("Nome: " + item.nome);
            System.out.println("Data de entrada: " + item.dataEntrada);
            System.out.println("Prazo de devolução: " + item.prazoDevolucao);
            System.out.println("Marca: " + item.marca);
            System.out.println("Garantia: " + item.garantia);
            System.out.println("Descrição: " + item.descricao);
            
        }
    }
    
    public static void criarItem(List<ItemDeInformatica> itens){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o código do produto: ");
        String codigo = sc.nextLine();
        
        System.out.println("Informe o nome do produto: ");
        String nome = sc.nextLine();
        
        System.out.println("Informe o prazo de devolução do produto: ");
        String prazoDevolucao = sc.nextLine();
        
        System.out.println("Informe a marca do produto: ");
        String marca = sc.nextLine();
        
        System.out.println("Informe a garantia do produto: ");
        String garantia = sc.nextLine();
        
        System.out.println("Informe a descrição do produto: ");
        String descricao = sc.nextLine();
        
        ItemDeInformatica item = new ItemDeInformatica(codigo, nome, new Date(), prazoDevolucao, marca, garantia, descricao);
        itens.add(item);
        sc.close();
    }
}
