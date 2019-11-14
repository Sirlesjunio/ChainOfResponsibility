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
public interface Desconto {
    
    public double desconto(Orcamento orcamento);
    public void setProximo (Desconto proximo);
    
}
