/*10)Implemente un nuevo método estático para la clase Nodo con un parámetro que sea una referencia a la
cabeza de una lista enlazada. El método elimina el primer nodo después de la cabeza que contiene el número
23 (si existe tal nodo). No llames a ningún otro método para hacer nada del trabajo.*/
public class main {
    public static nodo eliminarPrimer23(nodo l){
        nodo aux=l;
        while(aux!=nodo.tierra){
            if(aux.getLink().getData()==23){
                aux.setLink(aux.getLink().getLink());
                break; // Sale del bucle después de eliminar el primer 23 encontrado
            }
            aux=aux.getLink();
        }
        return l;
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,  cola=nodo.tierra;
        
        l=new nodo(23,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(4, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(23, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(2, nodo.tierra));
        cola=cola.getLink();
        
        System.out.println(eliminarPrimer23(l));
                
    }
}