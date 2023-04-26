package com.mycompany.arrayclass;

public class ArrayClass {

    public static void main(String[] args) {
        //Definir array, Tipo+[]+Variable+=+(Los elementos del array o new+Tipo+[n] donde n es la cantidad de elemtos)
        String[] a={"Elemento 1","Elemento 2"};
        //Se puede decir que cada [] es una columna y el n es la cantidad de filas
        Double[][] b=new Double[2][3];
        /*Esto se veria de forma similar a esto
        [][][]
        [][][]
        */
        /*Al principio vimos como definir un array y tambien si observa bien esta una forma de asignarle valores a este; ahora veremos otra forma de asignar valor
        Primero se pone la variable, luego[i] donde i es la posicion, = para asignar valor y posteriormente el valor a asignar
        Una matriz en algebra lineal empieza en la posicion 11 ya que la posicion inicial es 1 pero en programacion la posicion inicial es 0
        */
        b[0][0]=9.2;
        b[0][1]=9.;
        b[0][2]=.2;
        
        b[1][0]=0.2;
        b[1][1]=0.0;
        b[1][2]=57.134;
        //Para mostrar un elemento, obtenerlo o editarlo se debe obtener la posicion de este
        System.out.println(b[0][1]);
        System.out.println(b[0][2]);
        //Ejemplos de uso
        b[0][1]=18.0;
        Double c=b[1][2];
        System.out.println(c*9);
        System.out.println(c/b[1][1]);
        Double m=c+b[0][0],n;
        n=b[0][2];
        System.out.println(m-n);
        //Un objeto se puede definir como todo aquello que puede ser pensado como un auto, un numero, una clase
        lapiz[] la=new lapiz[1];
        /*Una instancia es la creacion de una variable de una clase, crear un objeto
        Pero en una matriz no es necesario pasarle una variable, sino que se puede instanciar directamente directamente en la posicion del arreglo
        */
        la[0]=new lapiz("Amarillo","Madera","Exagonal");
        System.out.println(la[0].getColor());
        //Un arreglo de lapiz solo almacena lapiz, uno de texto solo texto pero uno de objeto almacena todo ya que un objeto es todo lo que puede ser pensado
        Object[] ob=new Object[2];
        lapiz laa=new lapiz();
        //laa.setForma("Triangular");
        ob[1]="Elemento";
        ob[0]=laa;
        System.out.println(ob[1]);
        System.out.println(((lapiz)ob[0]).getForma());
    }
}
class lapiz{
    String color, material, forma;

    public lapiz(String color, String material, String forma) {
        this.color = color;
        this.material = material;
        this.forma = forma;
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public lapiz() {
    }
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }
    
}
class carrera{
    String[] clases;
    Double Duracion;

    public String[] getClases() {
        return clases;
    }

    public void setClases(String[] clases) {
        this.clases = clases;
    }

    public Double getDuracion() {
        return Duracion;
    }

    public void setDuracion(Double Duracion) {
        this.Duracion = Duracion;
    }
    
}
