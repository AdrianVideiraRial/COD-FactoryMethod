package com.cod.factorymethod;

public class TransportesFactory {

    /**
     * En la clase factory se crea un método el cual instancia objetos derivados de la interface Transportes.
     * @param TipoTransporte
     * @return nuevo Transporte (Camion, bicicleta o desconocido)
     */

        public Transportes crearTransporte (String TipoTransporte){ //METODO publico que devuelve objetos según patron recibido
        if (TipoTransporte == null || TipoTransporte.isEmpty())
            return null;
        switch (TipoTransporte){
            case "Camion":
                return new Camion();
            case "Bicicleta":
                return new Bicicleta();
            case "Barco"://Añadimos a la fabrica de transportes la opcion barco para poder instanciarla.
                return  new Barco();
            default:
                throw new IllegalArgumentException("Transporte desconocido "+ TipoTransporte);
        }



    }

}
