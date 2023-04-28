class Expendedor{
    private DepositoVuelto dv;
    private Deposito cocacola;
    private Deposito sprite;
    private Deposito snickers;
    private Deposito super8;
    
    public int precioProducto;
    public static final int  COCA=1;
    public static final int  SPRITE=2;
    public static final int  SNICKERS=3;
    public static final int  SUPER8=4;
    

    
    public Expendedor(int numProducto,int precioProducto){
        
        this.precioProducto=precioProducto;
        dv = new DepositoVuelto();
        cocacola = new Deposito();
        sprite = new Deposito();
        snickers = new Deposito();
        super8 = new Deposito();
        
        for(int i=0; i<numProducto; i++){
            cocacola.addProducto(new CocaCola(100+i));
            sprite.addProducto(new Sprite(200 +i));
            snickers.addProducto(new Snickers(300 +i));
            super8.addProducto(new Super8(400 +i));           
        }
    }
    
    
    
    public Producto comprarProducto(Moneda m, int sabor)throws NullPointerException, NoHayProductoException, PagoInsuficienteException{
        if (m == null) throw new PagoIncorrectoException("moneda es null");

        int vuelto = m.getValor();
        Bebida cocaColaBebida = null;
        Bebida spriteBebida = null;
        Dulce snickersDulce = null;
        Dulce super8Dulce = null;


        if (sabor == 1 && m.getValor() >= precioProducto) {
            cocaColaBebida = (Bebida) cocacola.getProducto();
            if (cocaColaBebida != null) {
                vuelto = m.getValor() - precioProducto;
            }
            else if(cocaColaBebida == null){
                throw new NoHayProductoException("No quedan bebidas");
            }
        }
        else if(sabor == 1 && m.getValor() < precioProducto){
            throw new PagoInsuficienteException("Pago Insuficiente");
        }

        if (sabor == 2 && m.getValor() >= precioProducto) {
            spriteBebida = (Bebida) sprite.getProducto();
            if (spriteBebida != null) {
                vuelto = m.getValor() - precioProducto;
            }
            else if(cocaColaBebida == null){
                throw new NoHayProductoException("No quedan bebidas");
            }
        }
        else if(sabor == 2 && m.getValor() < precioProducto){
            throw new PagoInsuficienteException("Pago Insuficiente");
        }

        if (sabor == 3 && m.getValor() >= precioProducto) {
            snickersDulce = (Dulce) snickers.getProducto();
            if (snickersDulce != null) {
                vuelto = m.getValor() - precioProducto;
            }
            else if(cocaColaBebida == null){
                throw new NoHayProductoException("No quedan dulces");
            }
        }
        else if(sabor == 3 && m.getValor() < precioProducto){
            throw new PagoInsuficienteException("Pago Insuficiente");
        }

        if (sabor == 4 && m.getValor() >= precioProducto) {
            super8Dulce = (Dulce) super8.getProducto();
            if (super8Dulce != null) {
                vuelto = m.getValor() - precioProducto;
            }
            else if(cocaColaBebida == null){
                throw new NoHayProductoException("No quedan dulces");
            }
        }
        else if(sabor == 4 && m.getValor() < precioProducto){
            throw new PagoInsuficienteException("Pago Insuficiente");
        }

        if (sabor < 1 || sabor > 4) {
            throw new NoHayProductoException("Producto Invalido");
        }

        
        while (vuelto > 0) {
            dv.addMoneda(new Moneda100());
            vuelto = vuelto - 100;
        }

        switch (sabor) {
            case 1:
                return cocaColaBebida;
            case 2:
                return spriteBebida;
            case 3:
                return snickersDulce;
            case 4:
                return super8Dulce;
            default:
                return null;
        }
        
    }
    
    public Moneda getVuelto(){
        return (Moneda) dv.getMoneda();
    }
}