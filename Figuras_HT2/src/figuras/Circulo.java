/*
 * Circulo
 */
package figuras;


public class Circulo implements IGeometria
{
    private double radio;
    private double areaRadio;
    private double perimetroRadio;
    static final double pi = 3.1415;

    public Circulo(double radio) 
    {
        this.radio = radio;
    }

    public double getRadio() 
    {
        return radio;
    }

    public void setRadio(double radio) 
    {
        this.radio = radio;
    }

    public double getareaRadio() 
    {
        return areaRadio;
    }
    
    public double getperimetroRadio() 
    {
        return perimetroRadio;
    }    

    @Override
    public void area() 
    {
        areaRadio = pi * radio * radio;
        String[] unidades = {"cm cuadrados", "m cuadrados", "km cuadrados"};
        String[] colores = {"rojo", "verde", "amarillo"};
        System.out.println("Dibujando Area Circulo Radio 25cm: ");
        System.out.println(getareaRadio() + " " + unidades[0]);
                  
    }
    @Override
    public void perimetro() 
    {
        perimetroRadio = 2 * pi * radio;
    }    
    
}
