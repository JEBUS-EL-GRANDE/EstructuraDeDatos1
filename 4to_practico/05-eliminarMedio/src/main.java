/*5)Escribe una función para eliminar el nodo medio de una lista enlazada, si la longitud de la
lista es impar. Si la longitud es par, elimina el nodo que se encuentra después del nodo
medio.*/
public class main {
    public static nodo eliminarMedio(nodo l){
        nodo aux=l;
        int c=0;
        while(aux!=nodo.tierra){
            c++;
            aux=aux.getLink();
        }
        aux=l;
        if(0==c%2){//par
            c=c/2;
            int i=1;
            while(i<=c){
                if(i==c){
                    aux.setLink(aux.getLink().getLink());
                }
                i++;
                aux=aux.getLink();
            }
        }else{//inpar
            c=(c/2)+1;
            int i=1;
            while(i<=c){
                i++;
                if(i==c){
                    aux.setLink(aux.getLink().getLink());
                }
                aux=aux.getLink();
            }
        }
        return l;
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,  cola=nodo.tierra;
        l=new nodo(8,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(2, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(4, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(6, nodo.tierra));
        cola=cola.getLink();
        
        System.out.println(l);
        
        System.out.println(eliminarMedio(l));
        
    }
}