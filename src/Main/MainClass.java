
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
              
             
              objEquipo.setPortero(400);
              objEquipo.setTecnico(500);
              
              Jugadores.ValorJugador+=objEquipo.getPortero()+objEquipo.getTecnico();
               System.err.println("Nombre Del equipo: "+objEquipo.nombreEquipo);
              System.err.println("Nombre Del Dueño "+objEquipo.dueñoEquipo);
              Jugadores.setTipodeJugadores(Jugadores.Defensas,"Defensa");
               Jugadores.setTipodeJugadores(Jugadores.MedioCampistas,"MedioCampista");
              Jugadores.setTipodeJugadores(Jugadores.Delanteros,"Delanteros");
  
              if(Jugadores.MessageTotalEquipo()){
                    objEquipo.setValorEquipo(Jugadores.getSumaTotal());
                    System.err.println("La suma del equipo seria la siguiente: "+objEquipo.getValorEquipo());
              }

          }else{
                  System.err.println("Valores vacios por asignacion al objeto.");
          }
         
       
   
       
         
      
       
    }
    
}
