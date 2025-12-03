package br.com.hospital.model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;
@Entity @Table(name="Receita")
public class Receita {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="id_receita", nullable = true) private Integer idReceita;
    @ManyToOne @JoinColumn(name="id_paciente", nullable=false) private Paciente paciente;
    @ManyToOne @JoinColumn(name="id_funcionario", nullable=false) private Funcionario funcionario;
    @Column(name="data_emissao", nullable = true) private LocalDate dataEmissao;
    @Column(name="observacoes", length=200, nullable = true) private String observacoes;
    @OneToMany(mappedBy="receita") private List<ReceitaRemedio> remedios;
    public Receita(){} public Integer getIdReceita(){return idReceita;} public void setIdReceita(Integer i){this.idReceita=i;}
    public Paciente getPaciente(){return paciente;} public void setPaciente(Paciente p){this.paciente=p;}
    public Funcionario getFuncionario(){return funcionario;} public void setFuncionario(Funcionario f){this.funcionario=f;}
    public LocalDate getDataEmissao(){return dataEmissao;} public void setDataEmissao(LocalDate d){this.dataEmissao=d;}
    public String getObservacoes(){return observacoes;} public void setObservacoes(String o){this.observacoes=o;}
    public List<ReceitaRemedio> getRemedios(){return remedios;} public void setRemedios(List<ReceitaRemedio> r){this.remedios=r;}
}
