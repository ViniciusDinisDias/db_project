package br.com.hospital.dto;
import java.time.LocalDateTime;
import java.math.BigDecimal;
public class ConsultaDTO {
    private Integer idConsulta;
    private Integer idPaciente;
    private Integer idFuncionario;
    private Integer idSala;
    private Integer idReceita;
    private String diagnostico;
    private LocalDateTime dataHora;
    private BigDecimal temperatura;
    private String pressao;
    private Integer frequenciaCardiaca;
    public Integer getIdConsulta(){return idConsulta;} public void setIdConsulta(Integer i){this.idConsulta=i;}
    public Integer getIdPaciente(){return idPaciente;} public void setIdPaciente(Integer i){this.idPaciente=i;}
    public Integer getIdFuncionario(){return idFuncionario;} public void setIdFuncionario(Integer i){this.idFuncionario=i;}
    public Integer getIdSala(){return idSala;} public void setIdSala(Integer i){this.idSala=i;}
    public Integer getIdReceita(){return idReceita;} public void setIdReceita(Integer i){this.idReceita=i;}
    public String getDiagnostico(){return diagnostico;} public void setDiagnostico(String d){this.diagnostico=d;}
    public LocalDateTime getDataHora(){return dataHora;} public void setDataHora(LocalDateTime dt){this.dataHora=dt;}
    public BigDecimal getTemperatura(){return temperatura;} public void setTemperatura(BigDecimal b){this.temperatura=b;}
    public String getPressao(){return pressao;} public void setPressao(String p){this.pressao=p;}
    public Integer getFrequenciaCardiaca(){return frequenciaCardiaca;} public void setFrequenciaCardiaca(Integer f){this.frequenciaCardiaca=f;}
}
