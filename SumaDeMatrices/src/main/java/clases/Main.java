package clases;

public class Main {

    public static void main(String[] args) {

        int matriz_uno[][] = new int[3][3];
        int matriz_dos[][] = new int[3][3];

        int matriz_tres[][] = new int[3][3];

        //Llenado primer matriz
        for (int i = 0; i < matriz_uno.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {
                matriz_uno[i][j] = (int) (Math.random() * 5);
            }
        }

        //Llenado de la segunda matriz
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_dos.length; j++) {
                matriz_dos[i][j] = (int) (Math.random() * 5);
            }
        }

        //Suma o resta de matrices
        //No importa que matriz usemos en la iteracion
        for (int i = 0; i < matriz_dos.length; i++) {
            for (int j = 0; j < matriz_uno.length; j++) {

                //Suma
                matriz_tres[i][j] = matriz_uno[i][j] + matriz_dos[i][j];

                //resta
                //matriz_tres[i][j] = matriz_uno[i][j] + matriz_dos[i][j];
            }
        }

        //Imprimir matrices
        //For para filas de las tres matrices
        for (int i = 0; i < matriz_uno.length; i++) {

            //For columnas matriz_uno
            for (int m1 = 0; m1 < matriz_uno.length; m1++) {
                System.out.print("[ " + matriz_uno[i][m1] + " ]");
            }

            if (i == 1) {
                System.out.print("  +  ");
            } else {
                System.out.print("     ");
            }

            //For columnas matriz_dos
            for (int m2 = 0; m2 < matriz_dos.length; m2++) {
                System.out.print("[ " + matriz_dos[i][m2] + " ]");
            }
            
            
            if (i == 1) {
                System.out.print("  =  ");
            } else {
                System.out.print("     ");
            }
            
           for (int mr = 0; mr < matriz_dos.length; mr++) {
                System.out.print("[ " + matriz_tres[i][mr] + " ]");
            }

            System.out.println("");
        }

    }

}
