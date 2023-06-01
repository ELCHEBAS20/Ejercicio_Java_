/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Sebastian S
 */
public class Equipo_Deportivo {

  
    public String nombreEquipo;
    public String dueñoEquipo;
    public String tecnicoEquipo;
    public String V_Equipo;
    public int GolesFavor;
    public int Portero,tecnico;
    public  int ValorDelEquipo=0;

    public Equipo_Deportivo() {
   
    }

    public Equipo_Deportivo(String nombreEquipo, String dueñoEquipo) {
        this.nombreEquipo = nombreEquipo;
        this.dueñoEquipo = dueñoEquipo;
        this.Portero=0;
         this.tecnico=0;
    }
    
    public int getPortero() {
        return this.Portero;
    }

    public void setPortero(int Portero) {
        this.Portero = Portero;
    }
    
       public void setTecnico(int Tecnico) {
        this.tecnico = Tecnico;
    }
       
       public int getTecnico() {
        return this.tecnico;
    }
       
       public void setValorEquipo(int Valor){
            this.ValorDelEquipo=Valor;
       }
       
       public int getValorEquipo(){
           return this.ValorDelEquipo;
       }
       

    
 

}
