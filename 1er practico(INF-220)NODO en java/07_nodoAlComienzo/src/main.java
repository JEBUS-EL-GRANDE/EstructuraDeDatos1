public class main {
    public static void main(String[] args) {
        nodo l=nodo.tierra,aux=nodo.tierra,ult=nodo.tierra;
        
        l=new nodo(21,nodo.tierra);
        ult=l;
        
        aux = new nodo(6,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux = new nodo(51,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        System.out.println(l);
        // solucion
        aux=new nodo(4, nodo.tierra);
        aux.setLink(l);//nos enlazaos al nodo l
        l=aux;//actualizamos para que l apunte al nodo aux*/
        
        System.out.println(l);
        //System.out.println(ult);
        //System.out.println(aux);
        
        
    }   
}