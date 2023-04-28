import java.util.ArrayList;

class Deposito<T>{ 
    private ArrayList<T> al ;
    
    public Deposito(){
        al = new ArrayList<T>();
    }
    
    public void addProducto(T producto){
        al.add(producto);
    }
    
    public T getProducto(){
         if( al.size() != 0){
            return al.remove(0);
         }else{
             return null;
         }   
    }
}