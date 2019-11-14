/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Desconto;

import Orcamento.Orcamento;

/**
 *
 * @author Sirles Júnio
 */
public class DescontoPorMaisDeQuientos implements Desconto{
    
    private Desconto proximo;
    
    @Override
    public double desconto(Orcamento orcamento) {
        if(orcamento.getValor() > 500.0){
            return orcamento.getValor() * 0.08;
        }else{
            return this.proximo.desconto(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

    /*@Override
    public double semDesconto(Orcamento orcamento) {
        return 0;
    }*/
}
