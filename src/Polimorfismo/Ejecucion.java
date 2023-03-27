package Polimorfismo;

import java.util.Scanner;

public class Ejecucion 
{
    public static void main(String[] args) 
    {
        Scanner lectura = new Scanner(System.in);

            System.out.println("Seleccione una opcion de figura para calcular su area 1=cuadrado 2=triangulo 3=circulo");
            int seleccion = lectura.nextInt();

            switch (seleccion)
            {
                case 1:
                Cuadrado prueba1 = new Cuadrado();
                {
                    System.out.println("Ingrese el valor de un lado del cuadrado");
                    float lado = lectura.nextInt();

                    prueba1.setlado(lado);
                    prueba1.calcularArea();

                }
                break;

                case 2:
                Triangulo prueba2 = new Triangulo();
                {
                    System.out.println("Ingrese el valor de la altura del triangulo");
                    float altura = lectura.nextInt();

                    System.out.println("Ingrese el valor de la base del triangulo");
                    float base = lectura.nextInt();

                    prueba2.setaltura(altura);
                    prueba2.setbase(base);

                    prueba2.calcularArea();
                }
                break;

                case 3:
                Circulo prueba3 = new Circulo();
                {
                    System.out.println("Ingrese el valor del radio del circulo");
                    float radio = lectura.nextInt();

                    prueba3.setradio(radio);
                    prueba3.calcularArea();
                }
                break;
            

            }
        lectura.close();


    }
    
}
