package dominio;

import java.time.LocalDate;

public class Lotes {
    private Integer numeracao;
    private LocalDate dataFabricacao;
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

    //CONSCRUCTOR
    public Lotes(Integer numeracao, Boolean status) {
        this.numeracao = numeracao;
        this.status = status;
    };

    //EXIBICAO NO CONSOLE
    public void printStatus() {
        System.out.println(
            "\n NUMERAÇÂO: " + numeracao +
            "\n DATA DE FABRICAÇÂO: " + dataFabricacao +
            "\n DATA DE VALIDADE: " + dataValidade +
            "\n STATUS: " + status
        );
    }
}
