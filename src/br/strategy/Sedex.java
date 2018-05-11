package br.strategy;

/**
 * @author vinic
 */
public class Sedex implements FormaDeEntrega {

    @Override
    public double getPrecoFrete(int peso) {
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
