package org.example;

public class NotaFiscalEstadoCancelada implements NotaFiscalEstado {

    private NotaFiscalEstadoCancelada() {};
    private static NotaFiscalEstadoCancelada instance = new NotaFiscalEstadoCancelada();
    public static NotaFiscalEstadoCancelada getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Cancelada";
    }

}