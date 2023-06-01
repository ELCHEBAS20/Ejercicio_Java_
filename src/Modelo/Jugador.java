
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian S
 */
public class Jugador extends Persona{

    boolean isTitular;
    public String[] Defensas = new String[2];
    public String[] MedioCampistas = new String[4];
    public String[] Delanteros = new String[2];
    public int ValorJugador;
    public String TipoPlayer;
    public int count=0;
    
    public Jugador() {
        super();
        this.ValorJugador=0;
        this.TipoPlayer="";
    }
    
    
       public void setTipodeJugadores(String[] setTipoJugador,String Tipo){
           
                     
          for(int index=0;index<setTipoJugador.length;++index){
              setAttributePlayer("", "", 0,0,false);
              this.nombre=JOptionPane.showInputDialog("Ingresa por favor el nombre del: "+Tipo);
              this.apellido=JOptionPane.showInputDialog("Ingresa el apellido del: "+Tipo);
              this.Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad:"+Tipo));
             ValorJugador=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del "+Tipo));
              setTipoJugador[index]=setAttributePlayer(this.nombre, apellido, Edad, ValorJugador, true);
              count++;
          }
        
            if(count==setTipoJugador.length){
                 System.out.println("************ "+Tipo+"***************************");
                 count=0;
            }
       
              for(int index=0;index<setTipoJugador.length;++index){
              System.out.println("JUGADOR "+(index+1));
             System.out.println("===============================================");
                 System.out.println(setTipoJugador[index]);
                 System.out.println("===============================================");
          }
    }
       
       public String setAttributePlayer(String nombre,String apellido,int edad,int valorPlayer,boolean isFlag){
             String isTitular=String.valueOf(isFlag)=="true" ? "Si es titular el morocho " : "En estos momentos no es titular.";
           return "\nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+String.valueOf(edad)+"\n$ValorJugador: "+String.valueOf(valorPlayer)+"\n Es Titutar:"+isTitular;
       }
    
}
