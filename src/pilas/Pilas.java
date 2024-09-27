package pilas;

import java.util.Scanner;
import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();
    Stack<String> pila1 = new Stack<String>();
    String registro;
    
    int nregistros;
    int numeros=-1;
    
    
    Scanner scan = new Scanner(System.in);
    System.out.println("cuantos registros habra: ");
    nregistros=scan.nextInt();
    for (int i=0;i<=nregistros; i++){
        System.out.println("Nombre del libro: ");
        registro=scan.nextLine();
        
        numeros=numeros+1;
        System.out.println("Nombre del libro: "+"["+registro+"]"+"["+numeros+"]");
        
        pila.push(numeros);
        pila1.push(registro);
    }
        System.out.println("-------------------------------------");
        System.out.println("Se ordenara del registro mas receinte al mas viejo ");
        
            //System.out.print("[");
        while (!pila1.isEmpty()) { 
            while (!pila.isEmpty()) {            
            System.out.print("["+pila1.pop()+"] ");
            System.out.println("["+ pila.pop()+"]");
            
        }}
        
    }
    
}
