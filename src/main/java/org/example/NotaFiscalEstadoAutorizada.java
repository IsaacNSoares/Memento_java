package org.example;

public class NotaFiscalEstadoAutorizada implements NotaFiscalEstado {

    private NotaFiscalEstadoAutorizada() {};
    private static NotaFiscalEstadoAutorizada instance = new NotaFiscalEstadoAutorizada();
    public static NotaFiscalEstadoAutorizada getInstance() {
        return instance;
    }

    @Override
    public String getNomeEstado() {
        return "Autorizada";
    }

}