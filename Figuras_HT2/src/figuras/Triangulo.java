
package figuras;

public class Triangulo implements IGeometria
{
    private double base;
    private double altura;
    private double altura2; 
    private double areaTriangulo;
    private double perimetroTriangulo;
    

    public Triangulo(double base, double altura, double altura2) 
    {
        this.base = base;
        this.altura = altura;
        this.altura2 = altura2;
    }

    public double getBase() 
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura() 
    {
        return altura;
    }

    public void setAltura(double altura) 
    {
        this.altura = altura;
    }
    
    public double getAltura2() 
    {
        return altura2;
    }

    public void setAltura2(double altura2) 
    {
        this.altura2 = altura2;
    }    

    public double getareaTriangulo() 
    {
        return 21;
    }
    
    public double getperimetroTriangulo() 
    {
        return perimetroTriangulo;
    }    

    @Override
    public void area() 
    {
        areaTriangulo = base * altura / 2;
       
    }

    public void perimetro(){
        
        perimetroTriangulo = base + altura + altura2;
        String[] unidades = {"cm", "m", "km"};
        String[] colores = {"rojo", "azul", "amarillo"};    
        Operaciones exportar = new Operaciones() {};
        exportar.exportar();
        System.out.println("Triangulo de " + getperimetroTriangulo() + " " + unidades[0] + " de perimetro " + " borde color " + colores [2] + " y fondo color " + colores[0]);         
    }
    
}
