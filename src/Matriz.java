
import java.util.Random;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**s
 *
 * @author GonzaloSV
 */
public class Matriz {

    private int[][] m;
    private int fil;
    private int col;

    public Matriz() {
        m = new int[20][20];
        fil = 2;
        col = 5;
    }

    public void setFil(int f) {
        fil = f;
    }

    public int getFil() {
        return fil;
    }

    public void setCol(int c) {
        col = c;
    }

    public int getCol() {
        return col;
    }

    public void setElem(int f, int c, int x) {
        m[f][c] = x;
    }

    public int getElem(int f, int c) {
        return m[f][c];
    }

    public boolean noExiste(int x) {
        if(x==0)
            return false;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (m[i][j]==x) {
                    return false;
                }
            }
        }
        return true;
    }

    public void cargarBingo() {
        Random r = new Random();
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                int x = r.nextInt(100);
                if (noExiste(x)) {
                    m[i][j] = x;
                } else {
                    j--;
                }
            }
        }
    }

    public boolean buscarNumero(int x) {
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                if (x==m[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }  
}
