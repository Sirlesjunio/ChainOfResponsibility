package Orcamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
    
    private double valor;
    
    private final List<Item> itens;
    
    public Orcamento(double valor){
        this.valor = valor;
        
        //inicializa o atributo como arrayList
        this.itens = new ArrayList<>();
    }
    
    public double getValor(){
        return this.valor;
    }
    
    public void setValor(double valor){
        this.valor = valor;
    }
    
    public List<Item> getItens(){
        // propiedade UNMODIFIABLELIST --> não deixa modificar a
        //lista fora da classe
        return Collections.unmodifiableList(this.itens);
    }
    
    public void addItem(Item item){
        this.itens.add(item);
        //metodo responsavel para adicionar itens a lista
    }
    
    
}
