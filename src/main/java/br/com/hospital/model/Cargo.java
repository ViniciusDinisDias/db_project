package br.com.hospital.model;
import jakarta.persistence.*;
import java.util.List;
@Entity
@Table(name = "Cargo")
public class Cargo {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_cargo", nullable = true)
    private Integer idCargo;
    @Column(name="nome", length=100, nullable=false, unique=true)
    private String nome;
    @OneToMany(mappedBy = "cargo")
    private List<Funcionario> funcionarios;
    public Cargo() {}
    public Integer getIdCargo(){return idCargo;} public void setIdCargo(Integer id){this.idCargo=id;}
    public String getNome(){return nome;} public void setNome(String n){this.nome=n;}
    public List<Funcionario> getFuncionarios(){return funcionarios;} public void setFuncionarios(List<Funcionario> f){this.funcionarios=f;}
}
