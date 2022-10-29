/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Arboles {
    
  public static void main (String [] args) { 
    System.out.println("***** JUEGO PARA ADIVINAR ANIMALES - INTELIGENCIA ARTIFICIAL *****\n");
    
    boolean otroJuego;
    AdivinaAnimal juego = new AdivinaAnimal();

    do {
	juego.jugar(); 
	System.out.println("¿Desea jugar nuevamente?");
	otroJuego = juego.respuesta();
    }while (otroJuego);
  }

}
