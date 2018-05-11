package br.strategy;

/**
 * @author vinic
 */
public class RetiradaNoLocal implements FormaDeEntrega {

    @Override
    public double getPrecoFrete(int peso) {
        return 0;
    }
    
}
