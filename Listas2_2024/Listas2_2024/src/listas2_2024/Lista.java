/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package listas2_2024;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class Lista {
    
    private Nodo cabeza; //this
    private Nodo cola;

    public Nodo getCabeza() {
        return cabeza;
    }

    public Nodo getCola() {
        return cola;
    }

    public Lista(Nodo cabeza, Nodo cola) {
        this.cabeza = cabeza;
        this.cola = cola;
    }
    
    public void adicionar(int x){
        if(cabeza==Nodo.TIERRA){
            cabeza = new Nodo(x,Nodo.TIERRA);
            cola = cabeza;
        }
        else{
            cola.setLink( new Nodo(x,Nodo.TIERRA));
            cola = cola.getLink();
        }            
    }

    public Lista() {
        this.cabeza = Nodo.TIERRA;
        this.cola = Nodo.TIERRA;        
    }
    public boolean vacia(){
        return cabeza == Nodo.TIERRA;
    }
    public void setCabeza(Nodo cabeza) {
        this.cabeza = cabeza;
    }

    public void setCola(Nodo cola) {
        this.cola = cola;
    }
    
    public  Nodo crearLista() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N: "));
        for (int i = 1; i <= n; i++) {
            int val = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor: "));
            if (i == 1) {
                cabeza = new Nodo(val, Nodo.TIERRA);
                cola = cabeza;
            } else {
                cola.setLink(new Nodo(val, Nodo.TIERRA));
                cola = cola.getLink();
            }
        }
        return cabeza;
    }
 
    @Override
    public String toString() {
        String cad = "Lista-->[";
        Nodo p = cabeza;
        while ( p!= Nodo.TIERRA) {
            cad += p.getDataInt() + ", ";
            p = p.getLink();
        }
        cad += "]";
       return cad;
    }
    
    public int cant(){
        Nodo p =cabeza;
        int cont=0;
        while(p!=Nodo.TIERRA){
            cont++;
            p=p.getLink();
        }
        return cont;
    }
    
    public void eliminarMedio(){
        if(vacia()){
            throw new NullPointerException("Error Lista vacia");
        }
        int medio = (cant()/2)+1;
        Nodo ant=Nodo.TIERRA;
        Nodo p = cabeza;
        for (int i = 1; i < medio; i++) {
            ant = p;
            p = p.getLink();
        }
        
        ant.setLink(p.getLink());
        
    }
    
    public Lista intercalar(Lista L2){
        Lista LR = new Lista();
        Nodo p = this.cabeza;
        Nodo q = L2.cabeza;
        while((p!=Nodo.TIERRA)&&(q!=Nodo.TIERRA)){
            LR.adicionar(p.getDataInt());
            LR.adicionar(q.getDataInt());
            p = p.getLink();
            q = q.getLink();
        }
        while(p!=Nodo.TIERRA){
          LR.adicionar(p.getDataInt());  
            p = p.getLink(); 
        }
        while(q!=Nodo.TIERRA){
          LR.adicionar(q.getDataInt());  
            q = q.getLink(); 
        }
        return LR;
    }
        
}
