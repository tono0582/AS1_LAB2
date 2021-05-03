/*
 * Cuadrado
 */
package figuras;


public class Cuadrado extends Operaciones implements IGeometria
{
    private double lado;
    private double areaCuadrado;
    private double perimetroCuadrado;
    

    public Cuadrado(double lado) 
    {
        this.lado = lado;
    }
    
    public double getLado() 
    {
        return lado;
    }

    public void setLado(double lado) 
    {
        this.lado = lado;
    }

    public double getareaCuadrado() 
    {
        return areaCuadrado;
    }

    public double getperimetroCuadrado() 
    {
        return perimetroCuadrado;
    }
    
    @Override
    public void area() 
    {
        areaCuadrado = lado * lado;
        
   
    }  
    
    @Override
    public void perimetro() 
    {
        perimetroCuadrado = lado * 4;
        String[] unidades = {"cm", "m", "km"};
        String[] colores = {"rojo", "azul", "amarillo"};    
        Operaciones imprimir = new Operaciones() {};
        imprimir.imprimir();
        System.out.println("Cuadrado de " + getperimetroCuadrado() + " " + unidades[0] + " de perimetro " + " borde color " + colores [0] + " y fondo color " + colores[1]);
        
    }    
}
