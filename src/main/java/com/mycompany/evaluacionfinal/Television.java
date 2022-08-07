
package com.mycompany.evaluacionfinal;

public class Television extends Electrodomestico
{
    private int pulgadas;
    private boolean sintonizador;
    
    final int pulgadas_Defecto=20;
    final boolean sintonizador_Defecto=false;
    
    public Television()
    {
        super();
        this.pulgadas = pulgadas_Defecto;
        this.sintonizador = sintonizador_Defecto;
    }

    public Television(int pulgadas, boolean sintonizador, double precio_base, String color, char consumo_energetico, int peso) {
        super(precio_base, color, consumo_energetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    } 

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }    
    
    @Override
    public double precioFinal()
    {
        double precio_final= super.precioFinal();
        int resolucion=getPulgadas();
        boolean señal=getSintonizador();
        //System.out.println("valor entrante "+ precio_final);
        if(resolucion>40)
            {
                precio_final=precio_final+(precio_final*0.30);
                //System.out.println("division "+ precio_final);
            }
        if(señal==true)
            {
                precio_final=precio_final+50;
                //System.out.println("sintonizador  "+ precio_final);

            }
        return precio_final;
    }
    
    
    
}
