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
            int media=0;
            
            while(i<provavettore.length){
                somma=somma+provavettore[i];
                i++;
            }
             media=somma/provavettore.length;
             System.out.println(media);
             
             
    }
}
