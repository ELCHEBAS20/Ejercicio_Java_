
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian S
 */
public class Jugador extends Persona{

    private boolean isTitular;
    public String[] Defensas = new String[1];
    public String[] MedioCampistas = new String[4];
    public String[] Delanteros = new String[1];
    public int ValorJugador;
    private int count=0,SumaTotal=0;
    
    public static int MessageCountTotal=0;
    
    public Jugador() {
        super();
        this.ValorJugador=0;
        this.isTitular=true;
    }

    public int getSumaTotal() {
        return SumaTotal;
    }

    public void setSumaTotal(int SumaTotal) {
        this.SumaTotal += SumaTotal;
    }
    
       public void setTipodeJugadores(String[] setTipoJugador,String Tipo){
          
          for(int index=0;index<setTipoJugador.length;++index){
              setAttributePlayer("", "", 0,0,!this.isTitular);
              this.nombre=JOptionPane.showInputDialog("Ingresa por favor el nombre del: "+Tipo);
              this.apellido=JOptionPane.showInputDialog("Ingresa el apellido del: "+Tipo);
              this.Edad=Integer.parseInt(JOptionPane.showInputDialog("Ingresar edad:"+Tipo));
             ValorJugador=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor del "+Tipo));
             this.setSumaTotal(ValorJugador);
              setTipoJugador[index]=setAttributePlayer(this.nombre, apellido, Edad, ValorJugador, this.isTitular);
              count++;
          }
        
           count=CountTipoPlayer(count, setTipoJugador, Tipo);
       
              for(int index=0;index<setTipoJugador.length;++index){
              System.out.println("JUGADOR "+(index+1));
             System.out.println("===============================================");
                 System.out.println(setTipoJugador[index]);
                 System.out.println("===============================================");
          }
                         MessageCountTotal++;
    }
       
       public String setAttributePlayer(String nombre,String apellido,int edad,int valorPlayer,boolean isFlag){
             String isTitular=String.valueOf(isFlag)=="true" ? "Si es titular el morocho " : "En estos momentos no es titular.";
           return "\nNombre: "+nombre+"\nApellido: "+apellido+"\nEdad: "+String.valueOf(edad)+"\n$ValorJugador: "+String.valueOf(valorPlayer)+"\n Es Titutar:"+isTitular;
       }
       
       public int CountTipoPlayer(int count,String[] PlayerArray,String tipo){
                if(count==PlayerArray.length){
                      System.out.println("************ "+tipo+"***************************");
                      return 0;
                }
                return -1;
       }
       
       public  boolean MessageTotalEquipo(){
             if(MessageCountTotal==2){
                 return true;
             }
             return false;
       }
    
}
