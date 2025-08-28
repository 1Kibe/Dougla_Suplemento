package dominio;

import java.time.LocalDate;

public class Lotes {
    private Integer numeracao;
    private Integer pesoTotal;
    private LocalDate dataFabricacao;//YYYY-MM-DD
    private LocalDate dataValidade;
    private Boolean status;

    //GETS SETS
    public Integer getNumeracao() {
        return numeracao;
    }
    public void setNumeracao(Integer numeracao) {
        this.numeracao = numeracao;
    }
    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }
    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
    public LocalDate getDataValidade() {
        return dataValidade;
    }
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    public Integer getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(Integer pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    
    //CONSCRUCTOR
    public Lotes(Integer numeracao, Integer pesoTotal, LocalDate dataFabricacao, LocalDate dataValidade,
            Boolean status) {
        this.numeracao = numeracao;
        this.pesoTotal = pesoTotal;
        this.dataFabricacao = dataFabricacao;
        this.dataValidade = dataValidade;
        this.status = status;
    }

    //EXIBICAO NO CONSOLE
    public void printStatus() {
        System.out.println(
            "\n NUMERAÇÂO: " + numeracao +
            "\n PESO TOTAL: " + pesoTotal + "Kg" +
            "\n DATA DE FABRICAÇÂO: " + dataFabricacao +
            "\n DATA DE VALIDADE: " + dataValidade +
            "\n STATUS: " + status
        );
    }
}
