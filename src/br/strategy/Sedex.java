package br.strategy;

import br.problema3.Pedido;

/**
 * @author vinic
 */
public class Sedex implements FormaDeEntrega {

    private static Sedex objeto;
    
    private Sedex() {}
    
    public static Sedex getInstance() {
        if(objeto == null) {
            objeto = new Sedex();
        }
        return objeto;
    }
    
    @Override
    public double getPrecoFrete(Pedido pedido) {
        int peso = pedido.getPesoTotalPedido();
        if(peso < 500) {
            return 12.5;
        } else if(peso < 750) {
            return 20;
        } else if(peso < 1200) {
            return 30;
        } else if(peso < 2000) {
            return 45;
        } else {
            return 45 + (((peso - 2000) / 100) * 1.5);
        }
    }
    
}
