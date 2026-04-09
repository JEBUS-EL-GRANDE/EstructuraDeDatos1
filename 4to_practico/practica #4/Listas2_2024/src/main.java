import javax.swing.JOptionPane;
public class main {
    public class Listas2_2024{
    public static void imprimir(Nodo L) {
        String cad = "Lista-->[";
        while (L != Nodo.TIERRA) {
            cad += L.getDataInt() + ", ";
            L = L.getLink();
        }
        cad += "]";
        System.out.println(cad);
    }

    public static Nodo crearLista() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N: "));

        Nodo Cabeza = Nodo.TIERRA;
        Nodo Cola = Nodo.TIERRA;
        for (int i = 1; i <= n; i++) {
            int val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor: "));
            if (i == 1) {
                Cabeza = new Nodo(val, Nodo.TIERRA);
                Cola = Cabeza;
            } else {
                Cola.setLink(new Nodo(val, Nodo.TIERRA));
                Cola = Cola.getLink();
            }
        }
        return Cabeza;
    }

    public static Nodo crearLista15() {

        Nodo Cabeza = Nodo.TIERRA;
        Nodo Cola = Nodo.TIERRA;
        for (int i = 1; i <= 15; i++) {

            if (i == 1) {
                Cabeza = new Nodo(i, Nodo.TIERRA);
                Cola = Cabeza;
            } else {
                Cola.setLink(new Nodo(i, Nodo.TIERRA));
                Cola = Cola.getLink();
            }
        }
        return Cabeza;
    }

    public static Nodo crearListaInvertida() {
        Nodo Cabeza = Nodo.TIERRA;
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N: "));

        for (int i = 1; i <= n; i++) {
            int val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor: "));
            Cabeza = new Nodo(val, Cabeza);
        }
        return Cabeza;
    }
    //PRACTICA #4
    /*1)Implementa una función para fusionar dos listas enlazadas ordenadas en una sola lista ordenada.*/
    public static nodo fucionar(nodo l){
        return null;
    }
    
    public static void main(String[] args) {
        nodo l = nodo.tierra,L2=nodo.tierra;
        nodo cola = nodo.tierra;
        l = crearLista();
        imprimir(l);
        /*imprimir(L2);
        imprimir(cola);*/
    }
}