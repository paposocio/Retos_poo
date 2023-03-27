package Interfaces;

import java.util.Scanner;

public class ppt implements Juego
{
    Scanner lectura = new Scanner(System.in);
    private int oponente,seleccion;

    @Override
    public void iniciar()
    {
        System.out.println("Seleccione una opcion para jugar 'piedra papel o tijeras' 1=piedra 2=papel 3=tijeras");
        seleccion=lectura.nextInt();
    }

    @Override
    public void jugar()
    {
        oponente = (int)(Math. random()*3+1);
    }

    @Override
    public void finalizar()
    {
        if (seleccion==1 && oponente==3)
        {
            System.out.println("Tu oponente saco tijeras. Haz ganado");
        }

        else if (seleccion==2 && oponente==1)
        {
            System.out.println("Tu oponente saco piedra. Haz ganado");
        }

        else if (seleccion==3 && oponente==2)
        {
            System.out.println("Tu oponente saco papel. Haz ganado");
        }
    }
}
