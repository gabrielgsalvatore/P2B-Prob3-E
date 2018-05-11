package br.main;

import br.enumeradores.TipoDeEntregas;
import br.factorymethod.FormaDeEntregaFactory;
import br.problema3.Pedido;
import br.problema3.Produto;

/**
 * @author vinic
 */
public class Main {

    public static void main(String[] args) {
        
        Pedido pedido = new Pedido();
        pedido.incluirItem(new Produto("Lápis", 2.00, 50), 20);
        pedido.setFormaDePagamento(FormaDeEntregaFactory.get(TipoDeEntregas.SEDEX));
        System.out.println(pedido.getValorEntrega());
        System.out.println(pedido.getValorTotal());
        
        
    }
    
}
