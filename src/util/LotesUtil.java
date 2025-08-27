package util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import dominio.Lotes;

public class LotesUtil {

    // datas aleatorias
    public static void gerarDatasAleatorias(Lotes lote) {
        // Hoje
        LocalDate hoje = LocalDate.now();

        // Data de fabricação: entre 0 e 730 dias atrás (2 anos)
        long diasFabricacao = ThreadLocalRandom.current().nextLong(0, 730);
        LocalDate dataFabricacao = hoje.minusDays(diasFabricacao);

        // Validade: entre 30 e 730 dias após a fabricação
        long diasValidade = ThreadLocalRandom.current().nextLong(30, 730);
        LocalDate dataValidade = dataFabricacao.plusDays(diasValidade);

        // Atribui as datas ao objeto
        lote.setDataFabricacao(dataFabricacao);
        lote.setDataValidade(dataValidade);
    }


    // dados aleatorios
    public static Lotes gerarDadosAleatorios() {
        //// Número aleatório entre 1 e 1000
        int numeracao = ThreadLocalRandom.current().nextInt(1, 1_000);

        // Status aleatório
        boolean status = ThreadLocalRandom.current().nextBoolean();

        Lotes lote = new Lotes(numeracao, status);

        gerarDatasAleatorias(lote);

        return lote;
    }


    // cria uma lista de lotes aleatorios
    public static List<Lotes> criarVariosLotesAleatorios(int quantidade) {
        // criacao da lista de obj "Lotes"
        List<Lotes> lotes = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            lotes.add(gerarDadosAleatorios());
        }
        return lotes;
    }

    //exibe todos os lotes da lista criada anteriormente
    public static void printALL(List<Lotes> listaLote) {
        // Loop que percorre cada objeto Lotes da lista
        for (Lotes lote : listaLote) {
            lote.printStatus(); // Chama o método da classe Lotes que imprime os dados no console
        }
    }

}
