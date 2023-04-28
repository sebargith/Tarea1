abstract class Bebida extends Producto{
    
    public Bebida(int serie){
        super(serie);
    }
}

class Sprite extends Bebida{
    
    public Sprite(int serie){
        super(serie);
    }
    
    public String getName(){
        return "Sprite";
    }
}

class CocaCola extends Bebida{
    
    public CocaCola(int serie){
        super(serie);  
    }
    
    public String getName(){
        return "Coca-Cola";
    }
}