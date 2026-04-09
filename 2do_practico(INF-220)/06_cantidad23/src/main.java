/*6)Implementa un nuevo método estático para la clase Nodo con un parámetro que sea una referencia a la
cabeza de una lista enlazada. El valor de retorno del método es el número de veces que aparece el número
23 en la lista.*/
public class main {
    public static int cant_23(nodo l){//retornamos un entero asi que ponemos int 
        nodo aux=l;
        int c = 0;
        while(aux!=nodo.tierra){
            if (aux.getNum()==23) {
                c++;
            }
            aux=aux.getLink();
        }
        return c;
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,  cola=nodo.tierra;
        
        l=new nodo(8,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(4, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(23, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(2, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(23, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(23, nodo.tierra));
        cola=cola.getLink();
        
        System.out.println("La cantidad de veces que sse repite el 23 es:"+cant_23(l));
    }   
}