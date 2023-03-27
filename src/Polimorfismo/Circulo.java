package Polimorfismo;

public class Circulo extends Figura
{
    public float radio;
    static double PI=3.1416;

    public float getradio()
    {
        return radio;
    }
    public void setradio(float radio)
    {
        this.radio=radio;
    }

    @Override
    public void calcularArea()
    {
        double resultado = (PI*radio);
        double area = Math.pow(resultado, 2);
        System.out.println("El area del circulo es de "+area);
    }
}
