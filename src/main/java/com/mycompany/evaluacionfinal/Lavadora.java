package com.mycompany.evaluacionfinal;

public class Lavadora extends Electrodomestico
{
    private int carga;

    final int carga_Defecto=5;
    
    public Lavadora(int carga) {
        this.carga = carga;
    }
    
    public Lavadora()
    {
        super();
        this.carga = carga_Defecto;
    }

    public Lavadora(int carga, double precio_base, String color, char consumo_energetico, int peso) {
        super(precio_base, color, consumo_energetico, peso);
        this.carga = carga;
    }

    public Lavadora(int carga, double precio_base, int peso) {
        super(precio_base, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public double precioFinal()            
    {
        double precio_final= super.precioFinal();
        int kilos=getCarga();
        if(kilos>30)
        {
            precio_final=precio_final+50;
        }   
        //System.out.println("hola "+precio_final);
        return precio_final;
    }
}
