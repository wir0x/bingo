
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GonzaloSV
 */
public class Lista {
    // Atributos

    private Nodo p; // p=Primero
    private int c; // c=Cantidad

    //Constructor
    public Lista() {
        p = null;
        c = 1;
    }

    public void setCant(int d) {
        c = d;
    }

    public int getCant() {
        return c;
    }

    public Matriz getElem(int pos) {
        Nodo px = p;
        for (int i = 1; i < pos; i++) {
            px = px.getProx();
        }
        return px.getElem();
    }
    //Métodos

    public boolean vacio() {
        return p == null;
    }

    public void insertarPrimero(Matriz x) {
        Nodo n = new Nodo(x, p);
        p = n;
        c++;
    }

    public void insertarUltimo(Matriz x) {
        if (vacio()) {
            insertarPrimero(x);
        } else {
            Nodo px = p;
            while (px.getProx() != null) {
                px = px.getProx();
            }
            Nodo n = new Nodo(x, null);
            px.setProx(n);
            c++;
        }
    }

    public void insertarPosicion(Matriz x, int pos) {
        if (pos < 1 || pos > c) {
            JOptionPane.showMessageDialog(null, "La posición que insertor no es valida", "Error de posición", 1);
        }
        if (pos == 1) {
            insertarPrimero(x);
        } else {
            Nodo px = p;
            Nodo ap = null;
            for (int i = 1; i < pos; i++) {
                ap = px;
                px = px.getProx();
            }
            Nodo n = new Nodo(x, px);
            ap.setProx(n);
            c++;
        }
    }

    public void Limpiar(){
        p=null;
        c=1;
    }

}

