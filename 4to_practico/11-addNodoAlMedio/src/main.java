/*examen 1ro*/
public class main {
    public static void insertarEnPocision(nodo l,int dato,int pos){//dao 32 e pos  3
        nodo aux=l,nw= new nodo(dato,nodo.tierra);
        int i=1;
        while(aux!=nodo.tierra){     
            if(pos==i){
                nw.setLink(aux.getLink()); // Enlaza el nuevo nodo al siguiente de aux
                aux.setLink(nw);           // Enlaza aux al nuevo nodo
            }
            i++;
            aux=aux.getLink();
        }
    }
    public static void main(String[] args) {
        nodo l=nodo.tierra,  cola=nodo.tierra;
        
        l=new nodo(65,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(12, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(8, nodo.tierra));
        cola=cola.getLink();
                                                //add  
        cola.setLink(new nodo(23, nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(3, nodo.tierra));
        cola=cola.getLink();
        
        System.out.println(l);
        insertarEnPocision(l,42,3);
        System.out.println(l);

        
    }   
}