package br.com.hospital.model;
import jakarta.persistence.*;
import java.time.LocalDate;
@Entity @Table(name="Estoque")
public class Estoque {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="id_estoque", nullable = true) private Integer idEstoque;
    @ManyToOne @JoinColumn(name="id_remedio", nullable=false) private Remedio remedio;
    @Column(name="quantidade", nullable=false) private Integer quantidade;
    @Column(name="data_entrada", nullable = true) private LocalDate dataEntrada;
    @Column(name="data_validade", nullable = true) private LocalDate dataValidade;
    public Estoque(){} public Integer getIdEstoque(){return idEstoque;} public void setIdEstoque(Integer i){this.idEstoque=i;}
    public Remedio getRemedio(){return remedio;} public void setRemedio(Remedio r){this.remedio=r;}
    public Integer getQuantidade(){return quantidade;} public void setQuantidade(Integer q){this.quantidade=q;}
    public LocalDate getDataEntrada(){return dataEntrada;} public void setDataEntrada(LocalDate d){this.dataEntrada=d;}
    public LocalDate getDataValidade(){return dataValidade;} public void setDataValidade(LocalDate d){this.dataValidade=d;}
}
