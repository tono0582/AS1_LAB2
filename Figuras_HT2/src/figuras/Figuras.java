/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Antonio
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Circulo circulo = new Circulo(25);          
        circulo.area();
        
        Cuadrado cuadrado = new Cuadrado (3);
        cuadrado.perimetro();
        
        Triangulo triangulo = new Triangulo(100,76,25);
        triangulo.perimetro();
        
        

    }
    
}
