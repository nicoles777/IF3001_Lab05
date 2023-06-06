package Tree;

/**
 *
 * @author C03274
 */
public class node {

    Object element;
    node left;
    node right;

    public node(Object element) {
        this.element = element;
        this.left = this.right = null;
    }
}
