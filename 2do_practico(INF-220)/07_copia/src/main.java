/*7)Implemente un nuevo método estático para la clase Nodo con un parámetro que sea una referencia a la
cabeza de una lista enlazada. El valor de retorno del método es un valor booleano que es verdadero si la
lista contiene al menos una copia de 23; en caso contrario, es falso.*/
public class main {
    public static boolean copia(nodo l){
        nodo aux=l;
        int c=0;
        while(aux!=nodo.tierra){
            if(aux.getNum()==23){
                c++;
            }
            aux=aux.getLink();
        }
        if(c>=2){
            return true;
        }else{
            return false;
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
        
        cola.setLink(new nodo(23, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(2, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(23, nodo.tierra));
        cola=cola.getLink();
    
        System.out.println(copia(l));
    }   
}