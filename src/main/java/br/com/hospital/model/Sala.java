package br.com.hospital.model;
import jakarta.persistence.*;
@Entity @Table(name="Sala")
public class Sala {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="id_sala", nullable = true) private Integer idSala;
    @Column(name="numero", length=10, nullable=false) private String numero;
    @ManyToOne @JoinColumn(name="id_funcionario") private Funcionario responsavel;
    public Sala(){} public Integer getIdSala(){return idSala;} public void setIdSala(Integer i){this.idSala=i;}
    public String getNumero(){return numero;} public void setNumero(String n){this.numero=n;}
    public Funcionario getResponsavel(){return responsavel;} public void setResponsavel(Funcionario f){this.responsavel=f;}
}
