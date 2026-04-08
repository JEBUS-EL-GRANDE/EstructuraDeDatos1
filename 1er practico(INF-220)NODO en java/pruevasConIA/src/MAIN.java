public class MAIN {
    public static void main(String[] args) {
        // Crear la lista enlazada de ejemplo
        nodo cabeza = new nodo(57, null);
        cabeza.setLink(new nodo(66, null));
        cabeza.getLink().setLink(new nodo(88, null));
        cabeza.getLink().setLink(new nodo(99, null));

        // Eliminar el segundo nodo
        if (cabeza == null) {
            // Caso: La lista está vacía, no hay nada que hacer
            System.out.println("La lista ya está vacía");
        } else if (cabeza.getLink() == null) {
            // Caso: La lista tiene un solo nodo, lo eliminamos
            cabeza = null;
        } else {
            // Caso: La lista tiene al menos dos nodos, eliminar el segundo
            cabeza.setLink(cabeza.getLink().getLink());
        }

        // Imprimir la lista resultante
        nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getData() + " -> ");
            actual = actual.getLink();
        }
        System.out.println("null");
    }
}

// Clase nodo
class nodo {
    private int data;
    private nodo link;

    public nodo(int data, nodo link) {
        this.data = data;
        this.link = link;
    }

    public int getData() {
        return data;
    }

    public nodo getLink() {
        return link;
    }

    public void setLink(nodo link) {
        this.link = link;
    }
}
