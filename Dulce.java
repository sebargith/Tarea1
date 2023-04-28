abstract class Dulce extends Producto{
    
    public Dulce(int serie){
        super(serie);
    }
}

class Snickers extends Dulce{
    
    public Snickers(int serie){
        super(serie);
    }
    
    public String getName(){
        return "Snickers";
    }
}

class Super8 extends Dulce{
    
    public Super8(int serie){
        super(serie);  
    }
    
    public String getName(){
        return "Super 8";
    }
}