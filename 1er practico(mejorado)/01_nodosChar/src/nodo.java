public class nodo {
    private char data;
    private nodo link;//referencia 
    public static final nodo tierra=null;
    
    public nodo(){
        data =' ';
        link =tierra;
    }
    public nodo(char data, nodo link) {
        this.data = data;
        this.link = link;
    }

    //get: Se usa para obtener el valor almacenado en un nodo o en una posición específica de la lista.
    //set: Se usa para actualizar el valor de un nodo en una posición específica de la lista.
    public void setData(char data) {
        this.data = data;
    }
    public void setLink(nodo link) {
        this.link = link;
    }
    public char getData() {         
        return data;
    }
    public nodo getLink() {         
        return link;
    }

    @Override
    public String toString() {
        return "nodo {data:"+data+", link:"+link+"}";
    }
}