package br.strategy;

import br.exceptions.TipoEntregaInvalido;
import br.problema3.ItemPedido;
import br.problema3.Pedido;

/**
 * @author vinic
 */
public class Motoboy implements FormaDeEntrega {

    private static Motoboy objeto;
    
    private Motoboy() {}
    
    public static Motoboy getInstance() {
        if(objeto == null) {
            objeto = new Motoboy();
        }
        return objeto;
    }

    @Override
    public double getPrecoFrete(Pedido pedido) {
        //item.getProduto().getPeso() * item.getQuantidade()
        
        if(pedido.getPesoTotalPedido() > 25000 || pedido.getItens().size() > 30) {
            throw new TipoEntregaInvalido("Deu merda ai jovem");
        }
        return 7;
    }
    
}
