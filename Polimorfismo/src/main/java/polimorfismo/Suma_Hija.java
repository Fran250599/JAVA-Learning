package polimorfismo;


public class Suma_Hija extends Operaciones_Padre {
    
    @Override
    public void operaciones(){
        resultado = v1 + v2;
    }
}
