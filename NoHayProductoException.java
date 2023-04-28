public class NoHayProductoException extends Exception{
    public NoHayProductoException(String productoinvalido){
        super(productoinvalido);
    }
}