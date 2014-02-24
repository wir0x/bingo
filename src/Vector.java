
import java.util.Random;
import javax.swing.JOptionPane;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author GonzaloSV
 */
public class Vector {

    private int[] v;
    private int n;

    public Vector() {
        v = new int[100];
        n = 0;
    }

    public void setDim(int d) {
        n = d;
    }

    public int getDim() {
        return n;
    }

    public void setElem(int p, int x) {
        v[p] = x;
    }

    public int getElem(int p) {
        return v[p];
    }

    public boolean vacio() {
        return n == 0;
    }

    public boolean lleno() {
        return n == 100;
    }

    public void insertarPrimero(int x) {
        insertarPosicion(x, 0);
    }

    public void insertarUltimo(int x) {
        insertarPosicion(x, n - 1);
    }

    public void insertarPosicion(int x, int pos) {
        if (lleno()) {
            JOptionPane.showMessageDialog(null, "El vector se encuentra lleno");
        }
        if (pos < 0 && pos > n) {
            JOptionPane.showMessageDialog(null, "Posicion no valida");
        } else {
            for (int i = n - 1; i >= pos; i--) {
                v[i + 1] = v[i];
            }
            v[pos] = x;
            n++;
        }
    }

    public boolean verificar(int x) {
        if(x==0)
            return false;
        for (int i = 0; i < 99; i++) 
            if (v[i] == x) 
                return false;
        return true;
    }

    public void cargarTombola() {
        Random rd = new Random();
        for(int i=0;i<99;i++){
            int x=rd.nextInt(100);
            if(verificar(x))
                v[i]=x;
            else
                i--;
        }
    }

    public boolean buscarRepetido(){
        for(int i=0;i<99;i++){
            for(int j=i+1;j<99;j++)
                if(v[i]==v[j]){
                    return true;
                }
        }
        return false;
    }
}
