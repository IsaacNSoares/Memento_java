package org.example;

public class NotaFiscalEstadoRejeitada implements NotaFiscalEstado {

    private NotaFiscalEstadoRejeitada() {};
    private static NotaFiscalEstadoRejeitada instance = new NotaFiscalEstadoRejeitada();
    public static NotaFiscalEstadoRejeitada getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Rejeitada";
    }

}