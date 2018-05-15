package br.strategy;

import br.exceptions.TipoEntregaInvalido;
import br.problema3.Pedido;

/**
 * @author vinic
 */
public class EncomendaPAC implements FormaDeEntrega {

    private static EncomendaPAC objeto;
    
    private EncomendaPAC() {}
    
    public static EncomendaPAC getInstance() {
        if(objeto == null) {
            objeto = new EncomendaPAC();
        }
        return objeto;
    }
    
    @Override
    public double getPrecoFrete(Pedido pedido) throws TipoEntregaInvalido {
        int peso = pedido.getPesoTotalPedido();
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
