package gestortareas;
public class nodo {
    private String  data;
    private nodo link;
    private static nodo tierra=null;
    
    public nodo(){
        data=" ";
        link= tierra;
    }
    
    public nodo(String data, nodo link){
        this.data=data;
        this.link=link;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public nodo getLink() {
        return link;
    }

    public void setLink(nodo link) {
        this.link = link;
    }
    //comparar nodos
    public boolean igual(String tarea) {
        return (this.data == null ? tarea == null : this.data.equals(tarea));
    }
    // AGREGAR TAREA
    public void agregarTarea(String tarea) {
        nodo nuevo = new nodo(tarea, null); 
        if (nodo.tierra == null) {
            nodo.tierra = nuevo;   
        } else {
            nodo aux = nodo.tierra;
            while (aux.link != null) {
                aux = aux.link;
            }
            aux.link = nuevo;
        }
    }
    //  ELIMINAR TAREA
    public void eliminarTarea(String tarea) {
        if (nodo.tierra == null) {
            return;
        }else{
            if (nodo.tierra.igual(tarea)) {
                nodo.tierra = nodo.tierra.link;
                return;
            }
            nodo aux = nodo.tierra;
            while(aux.link != null) {
                if(aux.link.igual(tarea)) {
                    aux.link = aux.link.link;
                    return;
                }
                aux = aux.link;
            }
        }
    }
    // OBTENER TAREA
    public String obtenerTareas() {
        String tareas = "";
        nodo cabeza = nodo.tierra;
        while (cabeza != null) {
            tareas += cabeza.data + "\n";
            cabeza = cabeza.link;
        }
        return tareas;
    }
}