/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author EMICLUC
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            short a=10000;            
            char lett='p';
            System.out.println(lett);
            System.out.println(a);           
            System.out.println("suca");            
       // Gestione Array
            //primo metodo di inizializzazione
            int[] provavettore; 
            provavettore = new int[3];
            provavettore[0]=10;
            provavettore[1]=12;
            provavettore[2]=14;
            //il .length serve per conoscere la lunghezza del vettore
            System.out.print("la dimensione del vettore è ");
            System.out.println(provavettore.length);            
            
            //secondo metodo per creazione e inizializzazione
            int[] secondovettore = {10,11,12,44};
            //il .length serve per conoscere la lunghezza del vettore
            System.out.print("la dimensione del vettore è ");
            System.out.println(secondovettore.length);
         
             //esempio di utilizzo di un array-vettore
            int i=0;
            int somma=0;
            int media;            
            while(i<provavettore.length){
                somma=somma+provavettore[i];
                i++;
            }
             media=somma/provavettore.length;
             System.out.print("la media è ");
             System.out.println(media);
             
            //Esempio di popolazione Array - vettore
             int b=0;
             int[] array=new int[10];
             while (b<array.length){
             array[b]= (int)(1000*Math.random());
             System.out.println(array[b]);
             b++;             
             }
             //esempio di lettura valore array
             System.out.println(array[5]);
             
             
            // strutture di controllo
             int x=0;
              if(x<=10)
                 System.out.println("limite");
            // utilizzo con else
              int y=1;
              if(y==1)
                  System.out.println("il valore di y è 1 ");
              else
                  System.out.println("Il valore di y è diverso da 1");
              //èpossibile concatenare operazioni con else if
              int g=3;
              if(g==2)
                  System.out.println("il valore di G è 2 ");
              else if(g>=2)
                  System.out.println("Il valore di G è maggiore di 2");
              else
                  System.out.println("Il valore di G è minore di 2");
              
              //Costrutto Switch - Case
              int f=2;
              switch(f){
                  case 1:
                      System.out.println("f è uguale a 1");
                      break;
                  case 2:
                      System.out.println("f è uguale a 2");
                      break;
                  default:
                      System.out.print("f è diverso da 1 e 2");
                      break;
              }
              //espressione condizionale
              
             int s=2;
             int k=0;
             k=s<2?-s:s;
             System.out.println(k);
             
    }
}
