import java.util.List;

import dominio.Lotes;
import util.LotesUtil;
import util.Producao;

public class App {
    public static void main(String[] args) throws Exception {
        //chama o criador randomico
        List<Lotes> listaDeLotes = LotesUtil.criarVariosLotesAleatorios(1);
        //exibicao
        LotesUtil.printALL(listaDeLotes);
        //pega o primeiro obj
        Lotes lote1 = listaDeLotes.get(0);
        //trabaia vagabundo
        Producao.trabalhadoresTrabalhando(lote1);
        //depois da trabaiada pesa tudo
        LotesUtil.balanca(lote1);
        //exibicao
        LotesUtil.printALL(listaDeLotes);
    }
}
