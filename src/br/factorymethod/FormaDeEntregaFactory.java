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
                return Sedex.getInstance();
            case ENCOMENDA_PAC:
                return EncomendaPAC.getInstance();
            case RETIRADA_NO_LOCAL:
                return RetiradaNoLocal.getInstance();
            case MOTOBOY:
                return Motoboy.getInstance();
            default:
                throw new TipoEntregaInvalido();
        }
    }
    
}
