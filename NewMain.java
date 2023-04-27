package com.mycompany.arrayclass;

import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        /*
         0   1  2 3
        0[A1][][][]
        1[A2][][][]
        */
        String[][] Estudiante;
        Scanner Scan=new Scanner(System.in);
        System.out.println("Ingrese cuantas asignaturas va a agregar");
        int n=Scan.nextInt();
        System.out.println("Ingrese la cantidad de estudiantes matriculados en las asignaturas");
        int m=Scan.nextInt();
        Estudiante=new String[n][m+1];
        for(int i=0;i<n;i++){
            
        for(int j=0;j<m+1;j++){
            if(j==0){
            System.out.println("Ingrese la asignatura");
            Estudiante[i][j]=Scan.next();
            }else{
                System.out.println("Ingrese el estudiante en la posicion "+(i+1));
                Estudiante[i][j]=Scan.next();
            }
        }
        
        }
        for(int i=0;i<n;i++){
            
        for(int j=0;j<m+1;j++){
            System.out.print(Estudiante[i][j]+" ");
        }
            System.out.println("");
        }
    }
}
