package org.example;

public class NotaFiscalEstadoContingencia implements NotaFiscalEstado {

    private NotaFiscalEstadoContingencia() {};
    private static NotaFiscalEstadoContingencia instance = new NotaFiscalEstadoContingencia();
    public static NotaFiscalEstadoContingencia getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Em Contingência";
    }

}