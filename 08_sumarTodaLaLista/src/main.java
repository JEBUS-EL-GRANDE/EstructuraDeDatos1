/*8)Implemente un nuevo método estático para la clase Nodo con un parámetro que sea una referencia a la
cabeza de una lista enlazada. El valor de retorno del método es la suma de todos los números de la lista.*/
public class main {
    public static int sumarLista(nodo l){
        nodo aux =l;
        int sumL=0;
        while(aux!=nodo.tierra){
            sumL=sumL+aux.getNum();
            aux=aux.getLink();
        }
        return sumL;
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
        
        cola.setLink(new nodo(23, nodo.tierra));
        cola=cola.getLink();
        
        System.out.println("La  suma de todos los  nodos es:"+sumarLista(l));
    }   
}