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

    public int ID; //llave solicitada por en las instrucciones
    
    //Datos para a agregar en el árbol
    public String name;
    public String lastname;
    public String address;
    
    public nodeTree left; //nodo izquierdo del árbol
    public nodeTree right; //nodo derechos del árbol

    public nodeTree(int ID, String name, String lastname, String address) {
        this.ID = ID;
        this.name = name;
        this.lastname = lastname;
        this.address = address;
        left = right = null;
    }
}//end class
