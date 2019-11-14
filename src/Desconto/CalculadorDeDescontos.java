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
public class CalculadorDeDescontos {
    
    public double calcula(Orcamento orcamento){
        
        //responsavel por fazer a cadeia de descontos
        
        Desconto desconto1 = new DescontoPorCincoItem();
        Desconto desconto2 = new DescontoPorMaisDeQuientos();
        Desconto semDesconto =   (Desconto) new SemDesconto();
        
        desconto1.setProximo(desconto2);
        desconto2.setProximo(semDesconto);
        
        return desconto1.desconto(orcamento);
    }
    
}
