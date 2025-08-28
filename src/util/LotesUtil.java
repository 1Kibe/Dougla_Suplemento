package util;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import dominio.Lotes;

//* CRIACAO POR CONSOLE */
//CRIA UM OBJ DA CLASSE LotesUtil com o metodo de criacao manual
//Lotes lote = LotesUtil.LoteBuilderConsole();
//lote.printStatus();

/* CRICAO POR METODO AUTOMATICO RADOMICO */
//CRIA UMA LISTA DE LOTES COM O METODO 
//List<Lotes> lotes = LotesUtil.criarVariosLotesAleatorios(6);
//LotesUtil.printALL(lotes);   

public class LotesUtil {

    // dados aleatorios
    public static Lotes gerarDadosDeLotesAleatorios() {
        // Hoje
        LocalDate hoje = LocalDate.now();

        //// Número aleatório entre 1 e 1000
        int numeracao = ThreadLocalRandom.current().nextInt(1, 1_000);

        // PesoAleatorio
        Integer peso = ThreadLocalRandom.current().nextInt(1, 1_000);

        // Data de fabricação: entre 0 e 730 dias atrás (2 anos)
        long diasFabricacao0 = ThreadLocalRandom.current().nextLong(0, 730);
        LocalDate dataFabricacao = hoje.minusDays(diasFabricacao0);

        // Validade: entre 30 e 730 dias após a fabricação
        long diasValidade0 = ThreadLocalRandom.current().nextLong(30, 730);
        LocalDate dataValidade = dataFabricacao.plusDays(diasValidade0);

        // Status verdadeiro se ouver no lote
        boolean status = numeracao > 0;

        // criação de obj
        Lotes lote = new Lotes(numeracao, peso, dataFabricacao, dataValidade, status);

        return lote;
    }

    // cria uma lista de lotes aleatorios
    public static List<Lotes> criarVariosLotesAleatorios(int quantidade) {
        // criacao da lista de obj "Lotes"
        List<Lotes> lotes = new ArrayList<>();

        for (int i = 0; i < quantidade; i++) {
            lotes.add(gerarDadosDeLotesAleatorios());
        }
        return lotes;
    }

    // exibe todos os lotes da lista criada anteriormente
    public static void printALL(List<Lotes> listaLote) {
        // Loop que percorre cada objeto Lotes da lista
        for (Lotes lote : listaLote) {
            lote.printStatus(); // Chama o método da classe Lotes que imprime os dados no console
        }
    }

    // Criador de lotes pelo console
    public static Lotes LoteBuilderConsole() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("DIGITE A NUMERAÇÃO DO LOTE: ");
        Integer numeracao = scanner.nextInt();

        System.out.print("DIGITE A PESO TOTAL DO LOTE(Kg): ");
        Integer peso = scanner.nextInt();
        // CONSUMIDOR DE LINHA: depois de nextInt ou nextDoble colocar para nao dar erro
        scanner.nextLine();

        System.out.print("DIGITE A DATA DE FABRICAÇÂO DO LOTE(YYYY-MM-DD): ");
        String dataF = scanner.nextLine();
        // formatador de string para YYYY-MM-DD
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        LocalDate dataFabricacao = LocalDate.parse(dataF);

        System.out.print("DIGITE A DATA DE VALIDADE DO LOTE(YYYY-MM-DD): ");
        String dataV = scanner.nextLine();
        // formatador de string para YYYY-MM-DD
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        LocalDate dataValidade = LocalDate.parse(dataV);

        System.out.print("DIGITE O STATUS ATUAL DO LOTE [1-ATIVO, 2-FINALIZADO]: ");
        int c = scanner.nextInt();
        scanner.nextLine();
        Boolean status = (c == 1);

        Lotes lote = new Lotes(numeracao, peso, dataFabricacao, dataValidade, status);
        return lote;

        // Opcional: método para fechar scanner ao final do programa
    }


    /* - BALANÇA - */
    // Pega o peso atual
    public static Integer pesagemDeLote(Lotes lote) {
        Integer pesoAtualBalanca = 0;
        pesoAtualBalanca = lote.getPesoTotal();

        return pesoAtualBalanca;
    };

    //exibicao
    public static void balanca(Lotes lotes) {
        Integer gasto = Producao.getCustoDeTrabalho();
        Integer finall = pesagemDeLote(lotes);
        
        System.out.println("\n PESAGEM: ");
        System.out.println(" PRODUÇÂO GASTOU: " + gasto + "Kg");
        System.out.println(" RESTANTE: " + finall + "Kg");

    }
}
