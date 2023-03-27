package Salud;
import java.util.Scanner;

public class Empleado extends Persona 
{
    Scanner lectura=new Scanner(System.in);

    public String cargo ;
    public Double valorHora;
    public int horasTrabajadas;
    public String departamento;

    public void calcularHonorarios()
    {
        Double honorario = valorHora * horasTrabajadas;
        Double subtotal = (honorario * 0.966)/100;
        Double total = honorario - subtotal;
        System.out.println("El empleado con documento "+ tipoDoc + documento + nombre + apellido + " en el cargo de "+ cargo +" trabajo un total de "+ horasTrabajadas+" horas cada hora con un valor de "+ valorHora +" y tiene un honorario total (reteica incluido) de :"+total);
    } 

    public Empleado(String _tipoDoc, int _documento, String _nombre, String _apellido, int _peso, int _estatura,
        int _edad, String _sexo , String _cargo ,Double _valorHora , int _horasTrabajadas , String _departamento) 
    {
        super(_tipoDoc, _documento, _nombre, _apellido, _peso, _estatura, _edad, _sexo);

        cargo=_cargo;
        valorHora=_valorHora;
        horasTrabajadas=_horasTrabajadas;
        departamento= _departamento;
    }

}
