/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Scanner;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */

class AdivinaAnimal {
    private static NodoArbol raiz;
    private Scanner entrada;

    /* Constructor - crea el nodo raíz con una perro. */
    public AdivinaAnimal(){
	raiz = new NodoArbol("Perro");
	entrada = new Scanner(System.in);
    }

   
    /* Método para jugar a adivinar animales. */
    public void jugar() {
      NodoArbol nodo = raiz;
      
      while(nodo != null) {   
        if (nodo.getHijoIzquierdoSi() != null) {   //Hay una pregunta.
          System.out.println(nodo.getPregunta());
          nodo = (respuesta()) ? nodo.getHijoIzquierdoSi() : nodo.getHijoDerechoNo();
        } else {  // Se tiene un animal.
          System.out.println("¿Estás pensando en un(a) " + nodo.getPregunta() + "?");
          if (respuesta())
            System.out.println("¡Gane! :)");
          else {
              animalNuevo(nodo);    
          }
            
          //nodo = null;
          return;
        }
      }
    }

  /*
    Para leer una respuesta del usuario, puede ser si o no.
    boolean -- true si la respuesta es si y false en otro caso.
  */
  public boolean respuesta() {

      while(true) {
	  String resp = entrada.nextLine().toLowerCase().trim();
	  if (resp.equals("si")) return true;
	  if (resp.equals("no")) return false;
	  System.out.println("La respuesta debe ser si o no.");
      }
  }

  /*
    Para dar de alta un nuevo animal.
    nodo -- nodo del cual se va a colgar el animal.
  */
  private void animalNuevo(NodoArbol nodo) {
    String animalNodo = (String) nodo.getPregunta();
    System.out.println("¿Cuál es tu animal en el que estás pensando?");
    String nuevoA = entrada.nextLine();
    System.out.println("¿Qué pregunta con respuesta si/no puedo hacer?" +
             " para poder decir que es un(a) " + nuevoA);
    String pregunta = entrada.nextLine();
    NodoArbol nodo1 = new NodoArbol(animalNodo);
    NodoArbol nodo2 = new NodoArbol(nuevoA);
    System.out.println("Para un(a) " + nuevoA + " ¿la respuesta es si/no?");
    nodo.setPregunta("¿"+pregunta+"?");
    if (respuesta()) {
	nodo.setHijoIzquierdoSi(nodo2);
	nodo.setHijoDerechoNo(nodo1);
    } else {
	nodo.setHijoIzquierdoSi(nodo1);
	nodo.setHijoDerechoNo(nodo2);
    }
  }
}
