public class PagoIncorrectoException extends NullPointerException {
    public PagoIncorrectoException(String monedanull) {
        super(monedanull);
    }
}