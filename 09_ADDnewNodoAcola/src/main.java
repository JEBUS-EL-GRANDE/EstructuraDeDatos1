/*9)Implementa un nuevo método estático para la clase Nodo con un parámetro que sea una referencia a la
cabeza de una lista enlazada. La función añade un nuevo nodo a la cola de la lista con el dato igual a 23.*/
public class main {
    public static nodo addUltimo23(nodo l){
        nodo aux=l;
        while(aux.getLink()!=nodo.tierra){
            aux=aux.getLink();
        }
        aux.setLink(new nodo(23,nodo.tierra));
        return l;
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
        
        System.out.println(addUltimo23(l));
    }   
}