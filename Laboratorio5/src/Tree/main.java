
/*En esta clase se encuentran los métodos para realizar la insersión y borrado*/
package Tree;
import java.util.Scanner;
/**
 *
 * @author sofig
 */


public class main {
    public static void main(String[] args) {
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        Scanner scanner = new Scanner(System.in);

         boolean continuar = true;
        while (continuar) {
//         Solicitar los datos al usuario
        System.out.print("Ingrese el Id: ");
        int ID = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer de entrada
        System.out.print("Ingrese el nombre: ");
        String name = scanner.nextLine();
        System.out.print("Ingrese el apellido: ");
        String lastname = scanner.nextLine();
        System.out.print("Ingrese la direccion: ");
        String address = scanner.nextLine();

        // Insertar el nodo en el árbol
        arbol.insertarNodo(ID, name, lastname, address);

        System.out.print("\nDesea ingresar mas datos? (S/N): ");
            String respuesta = scanner.nextLine();
            if (!respuesta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }
        
        // Imprimir los datos del árbol en orden
        System.out.println("\n Arbol actual:");
        
        System.out.println("////////////////////// Gráficación Textual de la estructura del Árbol ////////////////////////////");
        
        
        
        System.out.println("\nEstructura del árbol:");
        arbol.printStructureTree(arbol.raiz, "");
        
        
        System.out.println("////////////////////// Fin de la gráficación ////////////////////////////");
        arbol.imprimirArbol(arbol.raiz);
        
        
        // Imprimir los datos del árbol en orden
        System.out.println("\nArbol ENORDEN:");
        arbol.imprimirEnOrden();

        // Imprimir los datos del árbol en orden
        System.out.println("\nArbol POSTORDEN:");
        arbol.recorridoPostOrden();
        
        // Imprimir los datos del árbol en preorden
        System.out.println("\nArbol PREORDEN:");
        arbol.printPreOrden();
        
        // Solicitar el Id del nodo a borrar
        System.out.print("\n Ingrese el Id del nodo a borrar: ");
        int idBorrar = scanner.nextInt();

        // Borrar el nodo del árbol
        arbol.borrarNodo(idBorrar);

        // Imprimir los datos actualizados del árbol en orden
        System.out.println("\n Arbol actualizado:");
        arbol.imprimirArbol(arbol.raiz);
        
        // Imprimir los datos del árbol en orden
        System.out.println("\nArbol ENORDEN:");
        arbol.imprimirEnOrden();

        // Imprimir los datos del árbol en orden
        System.out.println("\nArbol POSTORDEN:");
        arbol.recorridoPostOrden();
        
    }
}


