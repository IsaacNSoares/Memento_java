package org.example;

public class NotaFiscalEstadoTransmitida implements NotaFiscalEstado {

    private NotaFiscalEstadoTransmitida() {};
    private static NotaFiscalEstadoTransmitida instance = new NotaFiscalEstadoTransmitida();
    public static NotaFiscalEstadoTransmitida getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Transmitida";
    }

}