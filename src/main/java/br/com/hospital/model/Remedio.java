package br.com.hospital.model;
import jakarta.persistence.*;
@Entity @Table(name="Remedio")
public class Remedio {
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY) @Column(name="id_remedio", nullable = true) private Integer idRemedio;
    @Column(name="nome", length=100, nullable=false) private String nome;
    @Column(name="descricao", length=200, nullable = true) private String descricao;
    public Remedio(){} public Integer getIdRemedio(){return idRemedio;} public void setIdRemedio(Integer i){this.idRemedio=i;}
    public String getNome(){return nome;} public void setNome(String n){this.nome=n;}
    public String getDescricao(){return descricao;} public void setDescricao(String d){this.descricao=d;}
}
