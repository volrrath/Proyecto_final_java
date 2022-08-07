
package com.mycompany.evaluacionfinal;

public class Electrodomestico
{
    protected  double precio_base;
    protected  String color;
    protected  char consumo_energetico;
    protected  int peso;  
    
    //constructor por defecto
    public Electrodomestico(double precio_base, String color, char consumo_energetico, int peso)
    {       
        this.precio_base = precio_base;
        this.color = color;
        this.consumo_energetico = consumo_energetico;
        this.peso = peso;
    }      
    
    //constantes
    final int precio_Base_Defecto=100000;
    final String color_Defecto="Blanco";
    final char consumo_Energetico_Defecto='F';   
    final int peso_Defecto=5;

    
    public Electrodomestico(double precio_base, int peso) {
        this.precio_base = precio_base;
        this.color = color_Defecto;
        this.consumo_energetico = consumo_Energetico_Defecto;
        this.peso = peso;
    }
    
    public Electrodomestico() {
        this.precio_base = precio_Base_Defecto;
        this.color = color_Defecto;
        this.consumo_energetico = consumo_Energetico_Defecto;
        this.peso = peso_Defecto;
    }    

    public double getPrecio_base() {
        return precio_base;
    }

    public void setPrecio_base(double precio_base) {
        this.precio_base = precio_base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo_energetico() {
        return consumo_energetico;
    }

    public void setConsumo_energetico(char consumo_energetico) {
        this.consumo_energetico = consumo_energetico;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    //metodo compruba color valido
    public void comprobarColor(String color)
    {
        if(!"blanco".equalsIgnoreCase(color) && !"negro".equalsIgnoreCase(color) && !"rojo".equalsIgnoreCase(color) && !"azul".equalsIgnoreCase(color) && !"gris".equalsIgnoreCase(color))
        {
            setColor(color_Defecto);
        }else
        {
            setColor(color);
        }       
    }   
    
    //metodo comprueba letra valida
    public void comprobarConsumoEnergetico(char letra)
    {
       String letra2 = String.valueOf(letra); 
       if(!"a".equalsIgnoreCase(letra2) && !"b".equalsIgnoreCase(letra2) && !"c".equalsIgnoreCase(letra2) && !"d".equalsIgnoreCase(letra2) && !"e".equalsIgnoreCase(letra2) && !"f".equalsIgnoreCase(letra2))
       {
           setConsumo_energetico(consumo_Energetico_Defecto);
       }else
       {
           setConsumo_energetico(letra);
       }
    }
    
    public double precioFinal()
    {
        double total=getPrecio_base();
	String letra2= String.valueOf(getConsumo_energetico());	
	int kilos= getPeso();        
                     
        if(letra2.equalsIgnoreCase("a"))
            {
                total=total+100;
            }
        if(letra2.equalsIgnoreCase("b"))
            {
                total=total+80;
            }
        if(letra2.equalsIgnoreCase("c"))
            {
                total=total+60;
            }
        if(letra2.equalsIgnoreCase("d"))
            {
                total=total+50;
            }
        if(letra2.equalsIgnoreCase("e"))
            {
                total=total+30;
            }
        if(letra2.equalsIgnoreCase("f"))
            {
                total=total+10;
            }
        
        if(kilos>=0 && kilos<=19)
            {
                total=total+10;
            }
        if(kilos>=20 && kilos<=49)
            {
                total=total+50;
            }
        if(kilos>=50 && kilos<=79)
            {
                total=total+80;
            }
        if(kilos>=80)
            {
                total=total+100;
            }        
        return total;
    }
}
