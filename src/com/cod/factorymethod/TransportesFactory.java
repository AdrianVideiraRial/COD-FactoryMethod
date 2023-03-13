package com.cod.factorymethod;

public class TransportesFactory {

    /**
     * En la clase factory se crea un método el cual instancia objetos derivados de la interface Transportes.
     * @param TipoTransporte
     * @return nuevo Transporte (Camion, bicicleta o desconocido)
     */

    public Transportes crearTransporte (String TipoTransporte){
        if (TipoTransporte == null || TipoTransporte.isEmpty())
            return null;
        switch (TipoTransporte){
            case "Camion":
                return new Camion();
            case "Bicicleta":
                return new Bicicleta();
            default:
                throw new IllegalArgumentException("Transporte desconocido "+ TipoTransporte);
        }

    }

}
