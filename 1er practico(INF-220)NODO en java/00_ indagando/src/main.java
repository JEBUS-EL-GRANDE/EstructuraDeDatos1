public class main {
    public static void main(String[] args) {
        nodo l=nodo.tierra, aux=nodo.tierra, ult=nodo.tierra;
        l=new nodo(9, nodo.tierra);
        ult=l;
        
        aux=new nodo(66,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        aux=new nodo(88,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        aux=new nodo(99,nodo.tierra);
        ult.setLink(aux);
        ult=aux;
        
        System.out.println(l);
        System.out.println(ult);
        System.out.println(aux);
        //jugando con los get  y set
        System.out.println("----------------GET-------");
        System.out.println(l.getData());
        System.out.println(l.getLink());
        System.out.println(aux.getData());
        System.out.println(aux.getLink());
        System.out.println(ult.getData());
        System.out.println(ult.getLink());
        System.out.println("-----------------SET------");
        
        
    }   
}