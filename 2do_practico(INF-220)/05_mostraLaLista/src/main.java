/*5)Suponga que un programa establece una lista enlazada con una variable Nodo llamada cabeza para referirse
al primer nodo de la lista (cabeza es null si la lista está vacía). Escribe unas líneas de código Java que
impriman todos los números.*/
public class main {
    public static void imprimirLista(nodo cabeza) {
        nodo aux = cabeza;
        while (aux!=nodo.tierra) {
            System.out.print(aux.getNum()+", ");
            aux = aux.getLink();
        }
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,  cola=nodo.tierra;
        
        l=new nodo(8,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(4, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(6, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(2, nodo.tierra));
        cola=cola.getLink();
        
        imprimirLista(l);
    }
}