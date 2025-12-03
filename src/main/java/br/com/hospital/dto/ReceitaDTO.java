package br.com.hospital.dto;
import java.time.LocalDate;
public class ReceitaDTO {
    private Integer idReceita;
    private Integer idPaciente;
    private Integer idFuncionario;
    private LocalDate dataEmissao;
    private String observacoes;
    public Integer getIdReceita(){return idReceita;} public void setIdReceita(Integer i){this.idReceita=i;}
    public Integer getIdPaciente(){return idPaciente;} public void setIdPaciente(Integer i){this.idPaciente=i;}
    public Integer getIdFuncionario(){return idFuncionario;} public void setIdFuncionario(Integer i){this.idFuncionario=i;}
    public LocalDate getDataEmissao(){return dataEmissao;} public void setDataEmissao(LocalDate d){this.dataEmissao=d;}
    public String getObservacoes(){return observacoes;} public void setObservacoes(String o){this.observacoes=o;}
}
