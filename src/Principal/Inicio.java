package Principal;
import Salud.Empleado;
import Salud.Persona;

public class Inicio 
{  
    public static void main(String[] args) 
    {
        Persona sapo = new Persona("CC",15892801,"charles","ocoro",70,180,22,"Masculino");
        sapo.mostrarPersona();
        sapo.mayorEdad();

        int imc=sapo.calcularImc();
        
        if (imc<20)
        {
            System.out.println("el peso está por debajo de lo ideal");
        }

        else if (imc>=20 || imc<=25)
        {
            System.out.println("el peso es ideal");
        }

        else if (imc<25)
        {
            System.out.println("usted tiene sobrepeso");
        }

        Empleado jhoseph = new Empleado("CC",15892822,"jose","gomez",100,175,36,"Masculino","Abogado",100.33,9,"Administrativo");
        jhoseph.calcularHonorarios();
    }
}