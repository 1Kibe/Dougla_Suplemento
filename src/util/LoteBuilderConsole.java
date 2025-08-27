package util;

import java.util.Scanner;

import dominio.Lotes;


public class LoteBuilderConsole {

    private Scanner scanner;

    public LoteBuilderConsole() {
        this.scanner = new Scanner(System.in);
    }

    public Lotes criarLote() {
        System.out.print("DIGITE A NUMERAÇÃO DO LOTE: ");
        Integer numeracao = scanner.nextInt();

        System.out.print("DIGITE O STATUS ATUAL DO LOTE [1-ATIVO, 2-FINALIZADO]: ");
        int c = scanner.nextInt();
        Boolean ativo = (c == 1);

        Lotes lote = new Lotes(numeracao, ativo);

        // Gera datas aleatórias
        LotesUtil.gerarDatasAleatorias(lote);

        return lote;
    }

    // Opcional: método para fechar scanner ao final do programa
    public void fecharScanner() {
        scanner.close();
    }
}