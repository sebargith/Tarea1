abstract class Moneda{
    protected int valor;

    public Moneda(){
    }
    public Moneda getSerie(){
        return this;
    }
    public abstract int getValor();
}


class Moneda1500 extends Moneda{
    public Moneda1500(){
        valor=1500;
    }
    public int getValor(){
        return valor;
    }
}

class Moneda1000 extends Moneda{
    public Moneda1000(){
        valor=1000;
    }
    public int getValor(){
        return valor;
    }
}
class Moneda500 extends Moneda{
    public Moneda500(){
        valor=500;
    }
    public int getValor(){
        return valor;
    }
}
class Moneda100 extends Moneda{
    public Moneda100(){
        valor=100;
    }

    public int getValor(){
        return valor;
    }
}