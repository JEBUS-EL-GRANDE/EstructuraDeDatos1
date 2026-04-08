/*11).-Escriba un código que podría aparecer en un programa principal (void main ). El código debería declarar
referencias de cabeza y cola para una lista enlazada de enteros y luego crear una lista de nodos cuyos datos
sean los enteros del 1 al 100 (en ese orden). Después de que cada uno de los nodos se añade, la cabeza y la
cola deben seguir siendo referencias válidas a los nodos cabeza y cola de la lista actual.*/
public class main {
    public static void main(String[] args) {
        nodo l=nodo.tierra, cola=nodo.tierra;
        for (int i = 1; i <=100; i++) {
            if(l==nodo.tierra){
                l=new nodo(i ,nodo.tierra);
                cola=l;
            }else{
                cola.setLink(new nodo(i,nodo.tierra));
                cola=cola.getLink();
            }
        }
        System.out.println(l);
    }   
}