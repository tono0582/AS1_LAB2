package figuras;

import java.util.*;

/**
 * 
 */
public abstract class Operaciones {

    /**
     * Default constructor
     */
    public Operaciones() {
    }

    /**
     * @return
     */
    public void imprimir() {
        System.out.println("\nImprimiendo Figura");
        return;
    }

    /**
     * @return
     */
    public void exportar() {        
        int x = 50;
        int y = 87;
        System.out.println("\nExportando Coordenadas: Posicion X = " + x + " Posicion Y = " + y);
        return;
    }

}