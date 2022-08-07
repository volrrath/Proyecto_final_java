
package com.mycompany.evaluacionfinal;

import java.util.Scanner;

public class EvaluacionFinal
{
    public static void main(String[] args)
    {  
       double suma_lavadora=0;
       double suma_televisores=0;
       double suma_electrodomesticos=0;
       
       Electrodomestico[] electrodomesticos = new Electrodomestico[]
       {
            new Electrodomestico(),
            new Electrodomestico(200000,"rosado",'k',45 ),// double precio_base, String color, char consumo_energetico, int peso;
                                  
            new Television(),
            new Television(20, true, 150000, "negro", 'e', 20),//int pulgadas, boolean sintonizador, double precio_base, String color, char consumo_energetico, int peso
            new Television(45, false, 100000, "blanco", 'c', 50),
            new Television(45, true, 120000, "negro", 'd', 75),
				
            new Lavadora(),
            new Lavadora(35, 100, "blanco", 'f', 25),//int carga, double precio_base, String color, char consumo_energetico, int peso*
            new Lavadora(20, 120000, "blanco", 'a', 50),
            new Lavadora(40, 140000, "negro", 'b', 75),
	}; 
       
		for (int i = 0; i < electrodomesticos.length; i++) 
                {
                    int h=0;
                    if(electrodomesticos[i] instanceof Lavadora)
                        {
                          System.out.println(i+"-. electrodomestico de tipo LAVADORA y su valor total es: "+electrodomesticos[i].precioFinal());  
                          suma_lavadora = suma_lavadora+ electrodomesticos[i].precioFinal();
                          h=1;
                        }
                     if(electrodomesticos[i] instanceof Television)
                        {
                          System.out.println(i+"-. electrodomestico de tipo TELEVISOR y su valor total es: "+electrodomesticos[i].precioFinal());   
                          suma_televisores = suma_televisores+electrodomesticos[i].precioFinal();
                           h=1;
                        } 
                     if(h==0)// esto fue hecho ya que el instanceof no me sirve para electrodomestico  y me lo mostraba dos veces cada objeto
                        {
                           System.out.println(i+"-. ELECTRODOMESTICO y su valor total es: "+electrodomesticos[i].precioFinal()); 
                        }
                      h=0;
                      suma_electrodomesticos= suma_electrodomesticos + +electrodomesticos[i].precioFinal();                  
                }
                System.out.println("");                
                System.out.println("El precio total de las Lavadoras es: "+suma_lavadora);
                System.out.println("El precio total de los televisores es: "+suma_televisores);
                System.out.println("*** El precio total de todos los electrodomesticos es: "+suma_electrodomesticos+" ***");
    }
      
}
