/*1).-Suponga que localizar es una referencia a un nodo de una lista enlazada (y no es una referencia nula). Escriba
una sentencia de asignación que haga que localizar se mueva al siguiente nodo de la lista. Debe escribir dos
versiones de la asignación, una que pueda aparecer en la propia clase Nodo y otra que pueda aparecer fuera
de la clase. ¿Qué harían tus sentencias de asignación si localizar se estuviera refiriendo al último nodo de la
lista?*/
public class main {
    public static nodo localizarSigNodo(nodo l){
        nodo localizar=l;
        if(localizar!=nodo.tierra){
            return localizar=localizar.getLink();
        }else{
            return null;
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
        
        System.out.println(l);
        
        //aplicando solucion 
        System.out.println(localizarSigNodo(l));
        
        //Si estubiera en el ultimo  nodo 
        nodo aux =new nodo(99,nodo.tierra);
        System.out.println(localizarSigNodo(aux));
    }
}