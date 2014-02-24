/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GonzaloSV
 */
public class Nodo {
    // Atributos

    private Matriz elem;
    private Nodo prox;

    // Constructor
    public Nodo(Matriz e, Nodo p) {
        elem = e;
        prox = p;
    }

    // Funciones insertoras (Set Get)
    public void setElem(Matriz e) {
        elem = e;
    }

    public Matriz getElem() {
        return elem;
    }

    public void setProx(Nodo p) {
        prox = p;
    }

    public Nodo getProx() {
        return prox;
    }
}
