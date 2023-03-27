package Polimorfismo;

public class Triangulo extends Figura 
{
    private float base,altura;

    public float getbase()
    {
        return base;
    }
    public void setbase(float base)
    {
        this.base=base;
    }

    public float getaltura()
    {
        return altura;
    }
    public void setaltura(float altura)
    {
        this.altura=altura;
    }

    @Override
    public void calcularArea()
    {
        float area=(base*altura)/2;
        System.out.println("El area del triangulo es de "+area);
    }
}
