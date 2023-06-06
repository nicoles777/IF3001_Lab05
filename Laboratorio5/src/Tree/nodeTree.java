package Tree;

/**
 *
 * @author C03274
 */

/* TEMÁTICA:
El presente árbol de búsqueda almacenará los registros de números de cédula
de Costa Rica, para aumentar la eficiencia en cuanto a las consultas que se 
realizan en la página del TSE.
*/
public class nodeTree {

    public int key; //llave solicitada por en las instrucciones
    
    //Datos para a agregar en el árbol
    public int data1;
    public int data2;
    public int data3;
    
    public nodeTree left; //nodo izquierdo del árbol
    public nodeTree right; //nodo derechos del árbol

    public nodeTree(int key, int data1, int data2, int data3) {
        this.key = key;
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;
        this.left = null;
        this.right = null;
    }


}
