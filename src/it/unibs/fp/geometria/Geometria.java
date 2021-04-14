package it.unibs.fp.geometria;

import java.util.Scanner;

public class Geometria {
    
    public static void main(String[] args){
        
        int flag = 0;
        double x1, y1;
        double x2, y2;
        double x3, y3;
        Punto p1, p2, p3;
        Retta r;   
       
        Scanner s = new Scanner(System.in);
         
        System.out.println("RETTA PER DUE PUNTI");
        System.out.println("\nInserisci le coordinate del primo punto:");
        System.out.print("x = ");
        x1 = s.nextDouble();
        System.out.print("y = ");
        y1 = s.nextDouble();
        
        System.out.println("\nInserisci le coordinate del secondo punto:");
        System.out.print("x = ");
        x2 = s.nextDouble();
        System.out.print("y = ");
        y2 = s.nextDouble();
    
        p1 = new Punto(x1, y1);
        p2 = new Punto(x2, y2);
        try{
            r = new Retta(p1, p2);
            
            System.out.println( "La retta ha equazione: " + r.toString() + "\n" );
        
            System.out.println("\nInserisci le coordinate di un punto per sapere se appartiene alla retta:");
            System.out.print("x = ");
            x3 = s.nextDouble();
            System.out.print("y = ");
            y3 = s.nextDouble();

            p3 = new Punto(x3, y3);

            System.out.print( "Il punto " + p3.toString() );

            if( r.appartiene(p3) ){

                System.out.println( " appartiene alla retta");
            }
            else{

                System.out.println( " non appartiene alla retta");
            }
        } 
        catch(CoincidentiException e){
            System.out.println(e.getMessage());
        }
    }
}
