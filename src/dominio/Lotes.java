package dominio;

import java.util.Date;
import java.util.Scanner;

public class Lotes {
    private Integer numeracao;
    private Integer quantidade;
    private Date dataFabricacao; //DIA SEMANDA, mes dia, h m s , fuso horario, ano
    private Date dataValidade;
    private Boolean status;

    //GETS SETS
    public Integer getNumeracao() {
        return numeracao;
    }
    public void setNumeracao(Integer numeracao) {
        this.numeracao = numeracao;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Date getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    public Date getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }

    //CONSCRUCTOR
    public Lotes(Integer numeracao, Integer quantidade, Boolean status) {
        this.numeracao = numeracao;
        this.quantidade = quantidade;
        this.status = status;
    };

    //public void InsertValoresConsole() {
    //    Scanner scanner = new Scanner(null);
//
    //    Integer a;
    //    Integer b;
    //    int c;
    //    Boolean ativo;
//
    //    for(int i = 0; i < 4; i++){
    //        if(i== 0){
    //            System.out.println("DIGITE A NUMERAÇÂO DO LOTE: ");
    //            a = scanner.nextInt();
    //        }
    //        if(i== 1){
    //            System.out.println("DIGITE A QUANTIDADE DO LOTE: ");
    //            b = scanner.nextInt();
    //        }
    //        if(i== 2){
    //            System.out.println("DIGITE O ESTATUS ATUAL DO LOTE[1-ATIVO,  2-FINALIZADO]: ");
    //            c = scanner.nextInt();
    //        }
    //    }
//
    //    if(c == 1){
    //        ativo = true;
    //    }else{
    //        ativo = false;
    //    }
//
    //    Lotes(a,b,ativo);
    //}

    public void printStatus() {
        System.out.println(
            "NUMERAÇÂO: " + numeracao +
            "QUANTIDADE: " + quantidade +
            "DATA DE FABRICAÇÂO: " + dataFabricacao +
            "DATA DE VALIDADE: " + dataValidade +
            "STATUS: " + status
        );
    }
}
