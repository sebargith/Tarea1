public class Main {
    public static void main(String[] args){
        Expendedor exp = new Expendedor(1,1000);
        Moneda m = null;
        Comprador c=null;

        try {
            m = new Moneda1500();
            c = new Comprador(m, 1, exp);
            System.out.println(c.queBebiste() + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 2, exp);
            System.out.println(c.queBebiste() + c.cuantoVuelto());
            m = new Moneda1000();
            c = new Comprador(m, 3, exp);
            System.out.println(c.queBebiste() + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 4, exp);
            System.out.println(c.queBebiste() + c.cuantoVuelto());
            m = new Moneda1500();
            c = new Comprador(m, 2, exp);
            System.out.println(c.queBebiste() + c.cuantoVuelto());
        }
        catch(PagoIncorrectoException pinc){
            System.out.println("Pago Invalido");
        }
        catch(PagoInsuficienteException pins){
            int devolucion = m.getValor();
            System.out.println("Pago Insuficiente\n" + devolucion);
        }
        catch(NoHayProductoException nhpe){
            int devolucion = m.getValor();
            System.out.println("No hay producto seleccionado\n" + devolucion);
        }

    }

}
