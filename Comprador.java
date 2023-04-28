class Comprador{
    private String sabor;
    private int vuelto;
    private Expendedor exp;
    
    public Comprador(Moneda m, int cual, Expendedor exp) throws NoHayProductoException, PagoInsuficienteException{
          this.exp=exp;
          
          if (exp.comprarProducto(m, cual) != null) {
              switch (cual) {
                  case 1:
                      sabor = "cocacola";
                      break;
                  case 2:
                      sabor = "sprite";
                      break;
                  case 3:
                      sabor = "snickers";
                      break;
                  case 4:
                      sabor = "super8";
                      break;
                  default:
                      break;
              }
        }
        Moneda moneda = null;
        
        moneda = exp.getVuelto();
        while (moneda != null) {
            vuelto = vuelto + moneda.getValor();
            moneda = exp.getVuelto();
        }
    }
    public  String queBebiste(){
        return sabor;
    }
    
    public int cuantoVuelto() {
        return vuelto;
    }
}