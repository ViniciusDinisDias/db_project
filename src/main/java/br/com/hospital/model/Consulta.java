package br.com.hospital.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity @Table(name="Consulta")
public class Consulta {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="id_consulta", nullable = true) private Integer idConsulta;
    @ManyToOne @JoinColumn(name="id_paciente", nullable=false) private Paciente paciente;
    @ManyToOne @JoinColumn(name="id_funcionario", nullable=false) private Funcionario funcionario;
    @ManyToOne @JoinColumn(name="id_sala") private Sala sala;
    @ManyToOne @JoinColumn(name="id_receita") private Receita receita;
    @Column(name="diagnostico", length=200, nullable = true) private String diagnostico;
    @Column(name="data_hora", nullable = true) private LocalDateTime dataHora;
    @Column(name="temperatura", precision=4, scale=1, nullable = true) private BigDecimal temperatura;
    @Column(name="pressao", length=7, nullable = true) private String pressao;
    @Column(name="frequencia_cardiaca", nullable = true) private Integer frequenciaCardiaca;
    public Consulta(){} public Integer getIdConsulta(){return idConsulta;} public void setIdConsulta(Integer i){this.idConsulta=i;}
    public Paciente getPaciente(){return paciente;} public void setPaciente(Paciente p){this.paciente=p;}
    public Funcionario getFuncionario(){return funcionario;} public void setFuncionario(Funcionario f){this.funcionario=f;}
    public Sala getSala(){return sala;} public void setSala(Sala s){this.sala=s;}
    public Receita getReceita(){return receita;} public void setReceita(Receita r){this.receita=r;}
    public String getDiagnostico(){return diagnostico;} public void setDiagnostico(String d){this.diagnostico=d;}
    public LocalDateTime getDataHora(){return dataHora;} public void setDataHora(LocalDateTime dt){this.dataHora=dt;}
    public BigDecimal getTemperatura(){return temperatura;} public void setTemperatura(BigDecimal b){this.temperatura=b;}
    public String getPressao(){return pressao;} public void setPressao(String p){this.pressao=p;}
    public Integer getFrequenciaCardiaca(){return frequenciaCardiaca;} public void setFrequenciaCardiaca(Integer f){this.frequenciaCardiaca=f;}
}
