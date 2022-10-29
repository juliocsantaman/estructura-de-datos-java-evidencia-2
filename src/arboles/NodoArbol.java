/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 *
 */
public class NodoArbol {
    
    private String pregunta;
    private NodoArbol hijoIzquierdoSi;
    private NodoArbol hijoDerechoNo;
    
    //Método equivalente al create();
    public NodoArbol(String pregunta) {
        this.pregunta=pregunta;
        this.hijoIzquierdoSi=null;
        this.hijoDerechoNo=null;
    }
    
    //Getters y Setters.
    
    public String getPregunta() {
        return this.pregunta;
    }
    
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    public NodoArbol getHijoIzquierdoSi() {
        return this.hijoIzquierdoSi;
    }
    
    public void setHijoIzquierdoSi(NodoArbol hijoIzquierdoSi) {
        this.hijoIzquierdoSi = hijoIzquierdoSi;
    }
    
    public NodoArbol getHijoDerechoNo() {
        return this.hijoDerechoNo;
    }
    
    public void setHijoDerechoNo(NodoArbol hijoDerechoNo) {
        this.hijoDerechoNo = hijoDerechoNo;
    }
}
