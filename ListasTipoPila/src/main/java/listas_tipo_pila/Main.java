package listas_tipo_pila;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        int opcion = 0;
        Pila p = new Pila();

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menu de pila\n\n"
                        + "1. Insertar un nodo.\n"
                        + "2. Eliminar un nodo.\n"
                        + "3. ¿La pila está vacía?\n"
                        + "4. Mostrar el ultimo valor ingresado.\n"
                        + "5. ¿Cuántos nodos tiene la pila? \n"
                        + "6. Vaciar pila.\n"
                        + "7. Mostrar contenido de la pila. \n"
                        + "8. Salir."));

                switch (opcion) {
                    case 1: {
                        //Insertar un nodo
                        int auxData;
                        auxData = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Por favor ingrese el valor a guardar en el nodo:"));

                        p.add(auxData);
                    }
                    break;

                    case 2: {
                        //Eliminar un nodo

                        if (!p.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.");
                        } else {
                            JOptionPane.showMessageDialog(null, "Se ha elminado un nodo con el valor: "
                                    + p.getTopData());
                            p.extract();
                        }

                    }
                    break;
                    case 3: {
                        //Pila vacia
                        if (!p.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "La pila no está vacía.");
                        }
                    }
                    break;
                    case 4: {
                        //Ultimo valor ingresado
                        if (!p.estaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila está vacía.");
                        }else{
                        JOptionPane.showMessageDialog(null, "El ultimo valor ingresado es: "
                                    + p.getTopData());
                        }
                    }
                    break;
                    case 5: {
                        //Cantidad de nodos en la pila
                        if(p.getTamanio() == 1){
                        JOptionPane.showMessageDialog(null, "Esta pila tiene "+ p.getTamanio() + " nodo.");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Esta pila tiene "+ p.getTamanio() + " nodos.");
                        }
                    }
                    break;
                    case 6: {
                        //Vaciar pila
                        p.vaciarPila();
                        JOptionPane.showMessageDialog(null, "Se ha vaciado la pila.");
                    }
                    break;
                    case 7: {
                        //Mostrar contenido de la pila
                        
                        p.mostrarContenido();
                                
                    }
                    break;
                    default: {
                    }
                    break;
                }

            } catch (Exception e) {
                System.out.println(e);
            }

        } while (opcion != 8);

    }

}
