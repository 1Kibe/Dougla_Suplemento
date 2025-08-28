package util;

import java.util.concurrent.ThreadLocalRandom;

import dominio.Lotes;

public class Producao {
    private static Integer custoDeTrabalho;
    private static Integer pesoAtualLote;
    private static Integer resultadoDeGastoTrabalho;

    public static Integer getCustoDeTrabalho() {
        return custoDeTrabalho;
    }
    public static Integer getPesoAtualLote() {
        return pesoAtualLote;
    }
    public static Integer getResultadoDeGastoTrabalho() {
        return resultadoDeGastoTrabalho;
    }

    public static void trabalhadoresTrabalhando(Lotes lote) {

        if(lote.getStatus()){
            System.out.println("\n TRABALHADORES TRABALHANDO :) ...");
            custoDeTrabalho = ThreadLocalRandom.current().nextInt(1, lote.getPesoTotal());
            pesoAtualLote = LotesUtil.pesagemDeLote(lote);
            resultadoDeGastoTrabalho = pesoAtualLote - custoDeTrabalho;
            lote.setPesoTotal(resultadoDeGastoTrabalho);

        }else{
            lote.setStatus(false);
            System.out.println("\n LOTE ZERADO/FINALIZADO");
         
        }

    }
}
