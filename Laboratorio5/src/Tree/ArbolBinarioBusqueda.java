/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

/**
 *
 * @author sofig
 */
public class ArbolBinarioBusqueda {

    nodeTree raiz;

    ArbolBinarioBusqueda() {
        raiz = null;
    }

    public void insertarNodo(int ID, String name, String lastname, String address) {
        raiz = insertarRecursivo(raiz, ID, name, lastname, address);
    }

    nodeTree insertarRecursivo(nodeTree raiz, int ID, String name, String lastname, String address) {
        if (raiz == null) {
            raiz = new nodeTree(ID, name, lastname, address);
            return raiz;
        }

        if (ID < raiz.ID) {
            raiz.left = insertarRecursivo(raiz.left, ID, name, lastname, address);
        } else if (ID > raiz.ID) {
            raiz.right = insertarRecursivo(raiz.right, ID, name, lastname, address);
        } else {
            System.out.println("No se permiten valores duplicados.");
        }

        return raiz;
    }

    public void imprimirArbol(nodeTree nodo) {
        if (nodo != null) {
            imprimirArbol(nodo.left);
            System.out.println("\n Datos de las personas ingresadas:");
            System.out.println(nodo.ID + "\n" + nodo.name + "\n" + nodo.lastname + "\n" + nodo.address);
            imprimirArbol(nodo.right);
        }
    }
/////////METODOS DE LOS RECORRIDOS/////////

    //ENORDEN
    //Se imprime el arbol en orden ascendente
    public void imprimirEnOrden() {
        enOrden(raiz);
    }

    public void enOrden(nodeTree nodo) {
        if (nodo != null) {
            enOrden(nodo.left);
            System.out.println(nodo.ID + "-" + nodo.name + "-" + nodo.lastname + "-" + nodo.address);
            enOrden(nodo.right);
        }
    }

    ///POST ORDEN
    public void recorridoPostOrden() {
        recorridoPostOrdenRec(raiz);
    }
    
        private void recorridoPostOrdenRec(nodeTree nodo) {
        if (nodo == null) {
            return;
        }

        // Recorremos el subárbol izquierdo
        recorridoPostOrdenRec(nodo.left);

        // Recorremos el subárbol derecho
        recorridoPostOrdenRec(nodo.right);

        // Imprimimos el valor del nodo
        System.out.println(nodo.ID + "-" + nodo.name + "-" + nodo.lastname + "-" + nodo.address);
    }
/////////////////////////////////////////////////////////////////////////////////////////////////////
    public void printPreOrden() {
        
        preOrden(raiz);

    }

    public void preOrden(nodeTree nodo) {
        if (nodo != null) { //debe existir al menos un nodo 
            //se imprime el nodo raíz
            System.out.println(nodo.ID + "-" + nodo.name + "-" + nodo.lastname + "-" + nodo.address);
          
            //se imprime el subarbol izquierdo 
            preOrden(nodo.left);
        
            //se imprime el subarbol derecho
            preOrden(nodo.right);
        }

    }
    
////////////////////////////////////////////////////////////////////////////////////////////////////7//


    public void borrarNodo(int idBorrar) {
        raiz = borrarRecursivo(raiz, idBorrar);
    }

    nodeTree borrarRecursivo(nodeTree raiz, int ID) {
        if (raiz == null) {
            return raiz;
        }

        if (ID < raiz.ID) {
            raiz.left = borrarRecursivo(raiz.left, ID);
        } else if (ID > raiz.ID) {
            raiz.right = borrarRecursivo(raiz.right, ID);
        } else {
            // Caso 1: El nodo a borrar es una hoja
            if (raiz.left == null && raiz.right == null) {
                raiz = null;
            } // Caso 2: El nodo a borrar tiene solo un hijo
            else if (raiz.left == null) {
                raiz = raiz.right;
            } else if (raiz.right == null) {
                raiz = raiz.left;
            } // Caso 3: El nodo a borrar tiene dos hijos
            else {
                nodeTree sucesor = obtenerSucesor(raiz.right);
                raiz.ID = sucesor.ID;
                raiz.name = sucesor.name;
                raiz.lastname = sucesor.lastname;
                raiz.address = sucesor.address;
                raiz.right = borrarRecursivo(raiz.right, sucesor.ID);
            }
        }

        return raiz;
    }

    nodeTree obtenerSucesor(nodeTree nodo) {
        nodeTree actual = nodo;
        while (actual.left != null) {
            actual = actual.left;
        }
        return actual;
    }

// Método para imprimir la estructura del árbol
    public void printStructureTree(nodeTree nodo, String level) {
        if (nodo == null) {
            return;
        }

        // Imprimir el nodo actual
        System.out.println(level + "|--" + nodo.ID + "-" + nodo.name + "-" + nodo.lastname + "-" + nodo.address);

        // Generar el prefijo para los nodos izquierdo y derecho
        String subTreeLeft = level + "   |";
        String subTreeRight = level + "    ";

        // Imprimir el subárbol derecho
        
        printStructureTree( nodo.right, subTreeRight + "|" );

        // Imprimir el subárbol izquierdo
        
        printStructureTree(nodo.left, subTreeLeft);
    }

}
