
package Main;

import Modelo.Equipo_Deportivo;
import Modelo.Jugador;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian S
 */
public class MainClass {
    
    public static void main(String[] args) {
                 
         Equipo_Deportivo objEquipo=new Equipo_Deportivo("Atlas F.C","Juan Sebastian Suarez");
         Jugador Jugadores=new Jugador();

          if(objEquipo.nombreEquipo!="" && objEquipo.dueñoEquipo!=""){
  
              objEquipo.setPortero(100);
              objEquipo.setTecnico(100);

               System.err.println("Nombre Del equipo: "+objEquipo.nombreEquipo);
              System.err.println("Nombre Del Dueño "+objEquipo.dueñoEquipo);
              Jugadores.setTipodeJugadores(Jugadores.Defensas,"Defensas");
               Jugadores.setTipodeJugadores(Jugadores.MedioCampistas,"MedioCampistas");
              Jugadores.setTipodeJugadores(Jugadores.Delanteros,"Delanteros");
              objEquipo.ValorDelEquipo=Jugadores.getSumaTotal()+objEquipo.getPortero()+objEquipo.getTecnico();
              
              System.out.println("La Suma total del equipo es: "+objEquipo.getValorEquipo());         

          }else{
                  System.err.println("Valores vacios por asignacion al objeto.");
          }
    }
    
}
