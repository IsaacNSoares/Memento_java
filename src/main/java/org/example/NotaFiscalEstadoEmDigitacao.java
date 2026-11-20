package org.example;

public class NotaFiscalEstadoEmDigitacao implements NotaFiscalEstado {

    private NotaFiscalEstadoEmDigitacao() {};
    private static NotaFiscalEstadoEmDigitacao instance = new NotaFiscalEstadoEmDigitacao();
    public static NotaFiscalEstadoEmDigitacao getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Em Digitação";
    }

}