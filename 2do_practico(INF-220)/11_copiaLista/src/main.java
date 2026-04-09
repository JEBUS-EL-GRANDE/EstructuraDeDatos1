/*11)Supongamos que p, q y r son referencias a nodos de una lista enlazada de 15 nodos. La variable p se refiere
al primer nodo, q al octavo nodo y r al último nodo. Escribe unas líneas de código que hagan una nueva
copia de la lista. Tu código debe establecer tres nuevas variables llamadas x, y, y z de forma que x se refiera
al primer nodo de la copia, y se refiera al 8º nodo de la copia, y z se refiera al último nodo de la copia. Tu
código no puede contener ningún bucle, pero puede utilizar los otros métodos de Nodo*/
public class main {
    public static void main(String[] args) {
        nodo p=nodo.tierra,q=nodo.tierra,r=nodo.tierra,              l=nodo.tierra, cola=nodo.tierra;
        
        l=new nodo(1,nodo.tierra);
        cola=l;
       
        cola.setLink(new nodo(2,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(3,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(4,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(5,nodo.tierra));
        cola=cola.getLink();
       
        cola.setLink(new nodo(6,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(7,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(8,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(9,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(10,nodo.tierra));
        cola=cola.getLink();
       
        cola.setLink(new nodo(11,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(12,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(13,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(14,nodo.tierra));
        cola=cola.getLink();
        cola.setLink(new nodo(15,nodo.tierra));
        cola=cola.getLink();
        System.out.println("Nodo original:"+l);
        p=l;
        q=l;
        r=l;
       
        q=q.getLink().getLink().getLink().getLink().getLink().getLink().getLink();
        r=r.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink();
              
        System.out.println("nodo P;"+p.getNum());
        System.out.println("nodo Q;"+q.getNum());
        System.out.println("nodo R;"+r.getNum());
        //nodos copia (copiar nodo por nodo la  annterior lista)
        nodo x=nodo.tierra,y=nodo.tierra,z=nodo.tierra;
        
        x=new nodo(p.getNum(),
            new nodo(p.getLink().getNum(),
                new nodo(p.getLink().getLink().getNum(),
                    new nodo(p.getLink().getLink().getLink().getNum(),
                        new nodo(p.getLink().getLink().getLink().getLink().getNum(),
                            new nodo(p.getLink().getLink().getLink().getLink().getLink().getNum(),
                                new nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getNum(),
                                    new nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getNum(),
                                        new nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getNum(),
                                            new nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getNum(),
                                                new nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getNum(),
                                                    new nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getNum(),
                                                        new nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getNum(),
                                                            new nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getNum(),
                                                                new nodo(p.getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getLink().getNum(),nodo.tierra)))))))))))))));
        y=x.getLink().getLink().getLink().getLink().getLink().getLink().getLink();
        z=y.getLink().getLink().getLink().getLink().getLink().getLink().getLink();
        
        System.out.println("Referencia x de la copia: " + x.getNum());
        System.out.println("Referencia y de la copia: " + y.getNum());
        System.out.println("Referencia z de la copia: " + z.getNum());
    }
}