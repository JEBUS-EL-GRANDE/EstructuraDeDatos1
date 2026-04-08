public class nodo {
    private int data;
    private nodo link;
    public static final nodo tierra=null;

    public nodo() {
        this.data =0;
        this.link = tierra;
    }
    public nodo(int data, nodo link) {
        this.data = data;
        this.link = link;
    }

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public nodo getLink() {
        return link;
    }
    public void setLink(nodo link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "nodo{" + "data=" + data + ", link=" + link + "}";
    }
}