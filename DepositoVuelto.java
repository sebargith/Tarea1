import java.util.ArrayList;

class DepositoVuelto<T>{ 
    private ArrayList<T> alm ;
    
    public DepositoVuelto(){
        alm = new ArrayList<T>();
    }
    
    public void addMoneda(T moneda){
        alm.add(moneda);
    }
    
    public T getMoneda(){
         if( alm.size() != 0){
            return alm.remove(0);
         }else{
             return null;
         }   
    }
}