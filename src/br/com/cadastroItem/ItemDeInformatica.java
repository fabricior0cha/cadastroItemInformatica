package br.com.cadastroItem;

import java.util.Date;


public class ItemDeInformatica {
    public String codigo;
    public String nome;
    public Date dataEntrada;
    public String prazoDevolucao;
    public String marca;
    public String garantia;
    public String descricao;

    public ItemDeInformatica(String codigo, String nome, Date dataEntrada, String prazoDevolucao, String marca, String garantia, String descricao) {
        this.codigo = codigo;
        this.nome = nome;
        this.dataEntrada = dataEntrada;
        this.prazoDevolucao = prazoDevolucao;
        this.marca = marca;
        this.garantia = garantia;
        this.descricao = descricao;
    }
    
    
    
    
}
