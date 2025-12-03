package br.com.hospital.model;
import jakarta.persistence.*;

@Entity @Table(name="Receita_Remedio")
@IdClass(ReceitaRemedioId.class)
public class ReceitaRemedio {
    @Id @Column(name="id_receita", nullable = true) private Integer idReceita;
    @Id @Column(name="id_remedio", nullable = true) private Integer idRemedio;
    @ManyToOne @JoinColumn(name="id_receita", insertable=false, updatable=false) private Receita receita;
    @ManyToOne @JoinColumn(name="id_remedio", insertable=false, updatable=false) private Remedio remedio;
    @Column(name="quantidade", nullable = true) private String quantidade;
    @Column(name="dosagem", nullable = true) private String dosagem;
    @Column(name="periodo", nullable = true) private String periodo;
    public ReceitaRemedio(){} public Integer getIdReceita(){return idReceita;} public void setIdReceita(Integer i){this.idReceita=i;}
    public Integer getIdRemedio(){return idRemedio;} public void setIdRemedio(Integer i){this.idRemedio=i;}
    public String getQuantidade(){return quantidade;} public void setQuantidade(String q){this.quantidade=q;}
    public String getDosagem(){return dosagem;} public void setDosagem(String d){this.dosagem=d;}
    public String getPeriodo(){return periodo;} public void setPeriodo(String p){this.periodo=p;}
}
