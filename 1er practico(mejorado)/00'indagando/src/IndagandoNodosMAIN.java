class nodo {
    private int num;
    private nodo link;
    public static nodo tierra=null;

    public nodo() {
        this.num =0;
        this.link =tierra;
    }
    public nodo(int num, nodo link) {
        this.num = num;
        this.link = link;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void setLink(nodo link) {
        this.link = link;
    }
    public int getNum() {
        return num;
    }
    public nodo getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "nodo{" + "num=" + num + ", link=" + link + '}';
    }
}
public class IndagandoNodosMAIN {
    public static void main(String[] args) {
        nodo l=nodo.tierra,cola=nodo.tierra;
        
        l=new nodo(8,nodo.tierra);
        cola=l;
        
        cola.setLink(new nodo(2,nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(6,nodo.tierra));
        cola=cola.getLink();
        
        cola.setLink(new nodo(4,nodo.tierra));
        cola=cola.getLink();
        
        
        
        System.out.println("Nodos: L-->8-->6-->4-->10-_");
        System.out.println("Nodo l:"+l);
        System.out.println("Nodo cola:"+cola);
        System.out.println("=========================");
        
        System.out.println("l.getData\t :"+l.getNum());
        System.out.println("l.getlink\t :"+l.getLink());
        System.out.println("cola.getData\t :"+cola.getNum());
        System.out.println("cola.getlink\t :"+cola.getLink());
        
    }
}