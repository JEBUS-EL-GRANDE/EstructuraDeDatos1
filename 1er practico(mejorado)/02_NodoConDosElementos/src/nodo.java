/*2)Escribe otra declaración de la clase Nodo, pero esta vez los datos de cada nodo deben incluir tanto un
número double como un entero. (Un nodo puede tener muchas variables de instancia para los datos, pero
cada variable de instancia debe tener un nombre distinto).*/
public class nodo {
    /*Una variable de instancia es una variable que se
    declara en una clase pero fuera de los constructores, métodos o bloques*/
    private double dou;
    private int num;
    private nodo link;
    public static nodo tierra=null;

    public nodo() {
        this.dou =0.0;
        this.num = 0;
        this.link =tierra;
    }
    public nodo(double dou, int num, nodo link) {
        this.dou = dou;
        this.num = num;
        this.link = link;
    }

    public void setDou(double dou) {
        this.dou = dou;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public void setLink(nodo link) {
        this.link = link;
    }
    public double getDou() {
        return dou;
    }
        public int getNum() {
        return num;
    }
    public nodo getLink() {
        return link;
    }

    @Override
    public String toString() {
        return "nodo{double:"+ dou +", numero:"+ num +", link:"+ link +"}";
    }
    
    
}