package chainofresponsibility;

import Desconto.CalculadorDeDescontos;
import Orcamento.Item;
import Orcamento.Orcamento;

/**
 *
 * @author Sirles Júnio
 */
public class ChainOfResponsibility {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CalculadorDeDescontos descontos = new CalculadorDeDescontos();
        
        Orcamento orcamento = new Orcamento(500.1);
        
        orcamento.addItem(new Item("SSD 128GB", 250.32));
        orcamento.addItem(new Item("SSD 240GB", 400.0));
        
        double descontoFinal = descontos.calcula(orcamento);
        
        System.out.println("Desconto: R$" + descontoFinal);
        
    }
    
}
