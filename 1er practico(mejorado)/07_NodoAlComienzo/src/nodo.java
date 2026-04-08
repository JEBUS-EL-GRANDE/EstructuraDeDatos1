public class nodo {
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