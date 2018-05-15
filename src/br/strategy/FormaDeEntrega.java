package br.strategy;

import br.problema3.Pedido;

/**
 * @author vinic
 */
public interface FormaDeEntrega {
    
    public double getPrecoFrete(Pedido pedido);
    
}
