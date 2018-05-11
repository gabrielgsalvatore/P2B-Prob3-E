package br.strategy;

import br.exceptions.TipoEntregaInvalido;

/**
 * @author vinic
 */
public class EncomendaPAC implements FormaDeEntrega {

    @Override
    public double getPrecoFrete(int peso) throws TipoEntregaInvalido {
        if(peso < 1000) {
            return 10;
        } else if(peso < 2000) {
            return 15;
        } else if(peso < 3000) {
            return 20;
        } else if(peso < 5000) {
            return 30;
        } else {
            throw new TipoEntregaInvalido("O peso excede o limite deste tipo de entrega: " + peso);
        }
    }

}
