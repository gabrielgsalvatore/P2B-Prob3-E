package br.factorymethod;

import br.enumeradores.TipoDeEntregas;
import br.exceptions.TipoEntregaInvalido;
import br.strategy.*;
import br.strategy.Sedex;

/**
 * @author vinic
 */
public class FormaDeEntregaFactory {
    
    public static FormaDeEntrega get(TipoDeEntregas tipo) throws TipoEntregaInvalido {
        switch(tipo) {
            case SEDEX:
                return new Sedex();
            case ENCOMENDA_PAC:
                return new EncomendaPAC();
            case RETIRADA_NO_LOCAL:
                return new RetiradaNoLocal();
            default:
                throw new TipoEntregaInvalido();
        }
    }
    
}
