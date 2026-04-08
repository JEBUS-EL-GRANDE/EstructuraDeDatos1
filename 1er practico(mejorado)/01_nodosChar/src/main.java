public class main {
    public static void main(String[] args) {
        nodo l=nodo.tierra,cola=nodo.tierra;
        
        l=new nodo('a',nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo('e',nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo('i',nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo('o',nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo('u',nodo.tierra));
        cola=cola.getLink();//*/
        
        System.out.println(l);
        System.out.println(cola);
        
        //experimentos 
        /*l.setLink(l.getLink().getLink());
        System.out.println(l);*/
    }
}