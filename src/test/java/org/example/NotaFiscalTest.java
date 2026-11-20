package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotaFiscalTest {

    @Test
    void deveArmazenarEstados() {
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setEstado(NotaFiscalEstadoEmDigitacao.getInstance());
        notaFiscal.setEstado(NotaFiscalEstadoAutorizada.getInstance());
        assertEquals(2, notaFiscal.getEstados().size());
    }

    @Test
    void deveRetornarEstadoInicial() {
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setEstado(NotaFiscalEstadoEmDigitacao.getInstance());
        notaFiscal.setEstado(NotaFiscalEstadoAutorizada.getInstance());
        notaFiscal.restauraEstado(0);
        assertEquals(NotaFiscalEstadoEmDigitacao.getInstance(), notaFiscal.getEstado());
    }

    @Test
    void deveRetornarEstadoAnterior() {
        NotaFiscal notaFiscal = new NotaFiscal();
        notaFiscal.setEstado(NotaFiscalEstadoEmDigitacao.getInstance());
        notaFiscal.setEstado(NotaFiscalEstadoContingencia.getInstance());
        notaFiscal.setEstado(NotaFiscalEstadoEmDigitacao.getInstance());
        notaFiscal.setEstado(NotaFiscalEstadoAutorizada.getInstance());
        notaFiscal.restauraEstado(2);
        assertEquals(NotaFiscalEstadoEmDigitacao.getInstance(), notaFiscal.getEstado());
    }

    @Test
    void deveRetornarExcecaoIndiceInvalido() {
        try {
            NotaFiscal notaFiscal = new NotaFiscal();
            notaFiscal.restauraEstado(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Índice inválido", e.getMessage());
        }
    }

}