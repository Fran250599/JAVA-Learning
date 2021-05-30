package listas_tipo_pila;

import javax.swing.JOptionPane;

public class Pila {

    //Parametros y constructor
    Node top;
    int tamanio;

    public Pila() {
        this.top = null;
        this.tamanio = 0;
    }

    //Añade un dato a la pila
    void add(int n) {
        if (this.top == null) {
            this.top = new Node(null, n);
            this.tamanio++;
        } else {
            Node aux = new Node(null, n);

            aux.setNext(top);
            this.top = aux;
            this.tamanio++;

        }
    }

    //Extrae el ultimo dato que se ingresó a la pila
    void extract() {
        if (tamanio >= 1) {
            this.top = this.top.getNext();
            this.tamanio--;
        } else {
            this.top = null;
            this.tamanio--;
        }

    }

    //Devuelve true si la lista está vacia
    public Boolean estaVacia() {
        return top != null;
    }

    //Devuelve el dato que está en el top
    public int peek() {
            return this.top.getData();
    }

    //Devuelve el valor qie está en el top
    public int getTopData() {
        return this.top.getData();
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void vaciarPila() {
        while (this.tamanio >= 1) {
            this.top = this.top.getNext();
            tamanio--;
        }
    }

    public void mostrarContenido() {

       

        if (this.top == null) {
            JOptionPane.showMessageDialog(null, "Pila vacia");
        } else {
             Node aux = top;
            String lista = new String();

            while (aux != null) {
                lista += aux.getData() + "\n";
                aux = aux.getNext();
            }
            JOptionPane.showMessageDialog(null, lista);
            lista = "";
        }
    }

}
