package br.exceptions;

/**
 * @author vinic
 */
public class TipoEntregaInvalido extends RuntimeException {

    public TipoEntregaInvalido() {
    }

    public TipoEntregaInvalido(String message) {
        super(message);
    }

    public TipoEntregaInvalido(String message, Throwable cause) {
        super(message, cause);
    }

    public TipoEntregaInvalido(Throwable cause) {
        super(cause);
    }

    public TipoEntregaInvalido(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
