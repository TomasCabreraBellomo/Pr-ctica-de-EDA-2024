package fila.tp6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomascabrerabellomo
 */
public class ADTFILA {
//////    Para realizar el punto 1 del tp6, vamos a utilizar una lista simplemente enlazada con un puntero apuntando al principio y al final de la lista
//////de esa forma vamos a hacer que nuestro algoritmo sea mas eficiente 

    private Nodo primero;
//    seria el primer elemento de la fila
    private Nodo ultimo;
//     seria el ultimo elemento de la fila

    private Integer cantidadeelementos;

    private class Nodo {

        private Integer elemento;
        /*los elementos de la fila deben ser numeros enteros*/
        private Nodo siguiente;

        /*obtiene el elemento que sigue al apuntado*/

        public Nodo(Integer elemento) {
            this.elemento = elemento;
        }

        public Integer getElemento() {
            return elemento;
        }

        public void setElemento(Integer elemento) {
            this.elemento = elemento;
        }

        public Nodo getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(Nodo siguiente) {
            this.siguiente = siguiente;
        }

    }
    //pasamos a definir las operaciones de FILA
    //primero generamos los metodos get y set, y el constructor privado}

    private ADTFILA() { //el ultimo elemento y el primero deben apuntar a null, no lo voy a agregar aca
        this.cantidadeelementos = 0;
        this.primero = null;
        this.ultimo = null;
    }

    public static ADTFILA FilaVacia() {

        ADTFILA nuevaFila = new ADTFILA();
//        crea la fila vacia
        return nuevaFila; //retorna la fila vacia

    }

    public boolean EsVacia() { //metodo que verifica si es vacia la fila
        return ((this.primero == null) && (this.ultimo == null));

    }

    public Integer Frente() {
        if (this.EsVacia()) {
            System.out.println("No tiene ningún elemento!");
            return null;
        } else {
            return this.primero.getElemento();
//        this.primero.getSiguiente();

        }
    }

    public void MostrarFila() {
        Nodo nodoaux = this.primero;

        if (this.EsVacia()) {
            System.out.println("No tiene ningún elemento!");
            
        } else {
            while (nodoaux != null) {
                System.out.println(nodoaux.getElemento());
                nodoaux = nodoaux.getSiguiente();
            }
        }
    }

    public void enfila(Integer item) { //agrega un elemento al final de la fila
        Nodo nodoaux = new Nodo(item); //agrego un nodo, que sera el que tendra mi elemnto

        if (this.EsVacia()) {
//            this.primero.setElemento(item); //estaria bien esto?
            this.primero = nodoaux; //la primer y ultimo item seria el agregado
            this.ultimo = nodoaux;
            //aumento la cantidad de elementos
        } else {
            this.ultimo.setSiguiente(nodoaux); //le asigno un lugar al nuevo ultimo elemento
            this.ultimo = nodoaux; // finalment el ultimo elemento es el pasado por parametro

        }
        cantidadeelementos++;
    }

    public void defila() { //quita el elemento del frente de la fila

        if (this.EsVacia()) {
            System.out.println("No tiene ningún elemento!");
        } else {
            this.primero = this.primero.getSiguiente();
            cantidadeelementos--;

        }
    }
}
