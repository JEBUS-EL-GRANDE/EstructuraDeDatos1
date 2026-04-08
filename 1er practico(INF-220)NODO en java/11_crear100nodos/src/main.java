/*11).-Escriba un código que podría aparecer en un programa principal (void main ). El código debería declarar
referencias de cabeza y cola para una lista enlazada de enteros y luego crear una lista de nodos cuyos datos
sean los enteros del 1 al 100 (en ese orden). Después de que cada uno de los nodos se añade, la cabeza y la
cola deben seguir siendo referencias válidas a los nodos cabeza y cola de la lista actual.*/
public class main {
    public static  void del_1_al_100(){
    nodo l=nodo.tierra, ult=nodo.tierra;
        for (int i = 1; i <= 10; i++) {
            if(l!=nodo.tierra){
                l=new nodo(i,nodo.tierra);
                ult=l;
                System.out.print(l+", ");
            }else{
                nodo  aux=new nodo(i,nodo.tierra);
                ult.setLink(aux);
                ult=aux;
                System.out.print(l+", ");
            }
            System.out.print(l+", ");
        }
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra, ult=nodo.tierra;
        //System.out.println(del_1_al_100(l));
    }    
}