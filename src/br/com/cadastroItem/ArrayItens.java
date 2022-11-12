package br.com.cadastroItem;

import java.util.Date;
import java.util.Scanner;

public class ArrayItens {

    public static void main(String[] args) {
        ItemDeInformatica[] arrayItens = new ItemDeInformatica[4000];
        int contadorDeItens = 0;
        ItemDeInformatica item1 = new ItemDeInformatica("2030", "Teclado",
                new Date(), "10 dias", "Logitech",
                 "2 meses", "Teclado preto");
        ItemDeInformatica item2 = new ItemDeInformatica("2040", "Teclado GAMER",
                new Date(), "10 dias", "Logitech",
                 "2 meses", "Teclado preto gamer");

        arrayItens[0] = item1;
        contadorDeItens++;
        arrayItens[contadorDeItens] = item2;
        contadorDeItens++;

        deletar(arrayItens, contadorDeItens, "2040");

        listar(arrayItens, contadorDeItens);
    }

    public static void deletar(ItemDeInformatica[] arrayItens, int contadorDeItens, String codigo) {
        for (int i = 0; i < contadorDeItens; i++) {
            if (arrayItens[i].codigo.equals(codigo)) {
                arrayItens[i] = null;
            }
        }
    }

    public static void editar(ItemDeInformatica[] arrayItens, int contadorDeItens, String codigo) {
        for (int i = 0; i < contadorDeItens; i++) {
            if (arrayItens[i].codigo.equals(codigo)) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Informe o código do produto: ");
                arrayItens[i].codigo = sc.nextLine();

                System.out.println("Informe o nome do produto: ");
                arrayItens[i].nome = sc.nextLine();

                System.out.println("Informe o prazo de devolução do produto: ");
                arrayItens[i].prazoDevolucao = sc.nextLine();

                System.out.println("Informe a marca do produto: ");
                arrayItens[i].marca = sc.nextLine();

                System.out.println("Informe a garantia do produto: ");
                arrayItens[i].garantia = sc.nextLine();

                System.out.println("Informe a descrição do produto: ");
                arrayItens[i].descricao = sc.nextLine();

                System.out.println("---------------------- ITEM EDITADO ! -------------------");

                System.out.println("Código: " + arrayItens[i].codigo);
                System.out.println("Nome: " + arrayItens[i].nome);
                System.out.println("Data de entrada: " + arrayItens[i].dataEntrada);
                System.out.println("Prazo de devolução: " + arrayItens[i].prazoDevolucao);
                System.out.println("Marca: " + arrayItens[i].marca);
                System.out.println("Garantia: " + arrayItens[i].garantia);
                System.out.println("Descrição: " + arrayItens[i].descricao);

            }
        }

    }

    public static ItemDeInformatica consultar(ItemDeInformatica[] arrayItens, int contadorDeItens, String codigo) {
        for (int i = 0; i < contadorDeItens; i++) {
            if (arrayItens[i].codigo.equals(codigo)) {
                System.out.println("---------------------- ITEM CONSULTADO ! -------------------");
                System.out.println("Código: " + arrayItens[i].codigo);
                System.out.println("Nome: " + arrayItens[i].nome);
                System.out.println("Data de entrada: " + arrayItens[i].dataEntrada);
                System.out.println("Prazo de devolução: " + arrayItens[i].prazoDevolucao);
                System.out.println("Marca: " + arrayItens[i].marca);
                System.out.println("Garantia: " + arrayItens[i].garantia);
                System.out.println("Descrição: " + arrayItens[i].descricao);
                return arrayItens[i];
            }
        }
        return null;
    }

    public static void listar(ItemDeInformatica[] arrayItens, int contadorDeItens) {
        for (int i = 0; i < contadorDeItens; i++) {
            if (arrayItens[i] != null) {
                System.out.println("Código: " + arrayItens[i].codigo);
                System.out.println("Nome: " + arrayItens[i].nome);
                System.out.println("Data de entrada: " + arrayItens[i].dataEntrada);
                System.out.println("Prazo de devolução: " + arrayItens[i].prazoDevolucao);
                System.out.println("Marca: " + arrayItens[i].marca);
                System.out.println("Garantia: " + arrayItens[i].garantia);
                System.out.println("Descrição: " + arrayItens[i].descricao);
            }

        }
    }

    public static void cadastrar(ItemDeInformatica[] arrayItens, int contadorDeItens) {
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
        arrayItens[contadorDeItens] = item;
        contadorDeItens++;
    }

}
