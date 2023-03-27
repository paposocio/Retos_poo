package Polimorfismo;

public class Cuadrado extends Figura
{
    private float lado;

    public float getlado()
    {
        return lado;
    }

    public void setlado(float lado)
    {
        this.lado = lado;
    }
    
    @Override
    public void calcularArea() 
    {
        float area=lado*lado;
        System.out.println("El area del cuadrado es de "+area);
    }
    
}
