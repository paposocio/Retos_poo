package Salud;

import java.util.Scanner;

public class Persona {

    public String tipoDoc;
    public int documento;
    public String nombre;
    public String apellido; 
    public int peso;
    public int estatura;
    public int edad;
    public String sexo;

    Scanner lectura=new Scanner(System.in);

    public void pedirDatos()
    {
        System.out.println("Ingrese su tipo de documento:");
        tipoDoc=lectura.nextLine();

        System.out.println("Ingrese su numero de documento:");
        documento=lectura.nextInt();

        System.out.println("Ingrese sus nombres:");
        nombre=lectura.nextLine();

        System.out.println("Ingrese sus apellidos:");
        apellido=lectura.nextLine();

        System.out.println("Ingrese su peso:");
        peso=lectura.nextInt();

        System.out.println("Ingrese su estatura:");
        estatura=lectura.nextInt();

        System.out.println("Ingrese su edad:");
        edad=lectura.nextInt();

        System.out.println("Ingrese su sexo:");
        sexo=lectura.nextLine();
    }

    public void mostrarPersona()
    {
        System.out.println(tipoDoc);
        System.out.println(documento);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(peso);
        System.out.println(estatura);
        System.out.println(edad);
        System.out.println(sexo);
    }
/* version 1
    public void calcularImc()
    {
        int pesoActual=(peso/(estatura^2));

        if (pesoActual<20)
        {
            System.out.println("el peso está por debajo de lo ideal");
        }

        else if (pesoActual>=20 || pesoActual<=25)
        {
            System.out.println("el peso es ideal");
        }

        else if (pesoActual<25)
        {
            System.out.println("usted tiene sobrepeso");
        }
    }
*/
    public int calcularImc()
    {
        int imc=(peso/(estatura^2));
        return imc;
    }

    public void mayorEdad()
    {
        if (edad>18)
        {
            System.out.println("usted es mayor de edad");
        } 
        else
        {
            System.out.println("usted es menor de edad");
        }
    }

    public Persona (String _tipoDoc,int _documento,String _nombre,String _apellido,int _peso,int _estatura,int _edad,String _sexo)
    {
        tipoDoc=_tipoDoc;
        documento=_documento;
        nombre=_nombre;
        apellido= _apellido;
        peso=_peso;
        estatura=_estatura;
        edad=_edad;
        sexo=_sexo;
    }
}