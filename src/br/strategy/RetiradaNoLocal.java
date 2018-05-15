package br.strategy;

import br.problema3.Pedido;

/**
 * @author vinic
 */
public class RetiradaNoLocal implements FormaDeEntrega {

    private static RetiradaNoLocal objeto;
    
    private RetiradaNoLocal() {}
    
    public static RetiradaNoLocal getInstance() {
        if(objeto == null) {
            objeto = new RetiradaNoLocal();
        }
        return objeto;
    }
    
    @Override
    public double getPrecoFrete(Pedido pedido) {
        return 0.0;
    }
    
}
