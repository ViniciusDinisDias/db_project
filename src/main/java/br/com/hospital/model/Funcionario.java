package br.com.hospital.model;
import jakarta.persistence.*;
import java.time.LocalDate;
import jakarta.validation.constraints.*;
@Entity
@Table(name = "Funcionario")
public class Funcionario {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name="id_funcionario", nullable = true)
    private Integer idFuncionario;
    @ManyToOne @JoinColumn(name="id_cargo", nullable=false)
    private Cargo cargo;
    @Column(name="nome", length=100, nullable=false) @NotBlank(message = "Nome é obrigatório")
    private String nome;
    @Column(name="sexo", length=20, nullable=false) private String sexo;
    @Column(name="telefone", length=15, nullable = true) private String telefone;
    @Column(name="data_nascimento", nullable = true) private LocalDate dataNascimento;
    @Column(name="cpf", length=11, unique=true, nullable = true) @NotBlank(message = "CPF é obrigatório")
    @Size(min=11,max=11,message="CPF deve ter 11 dígitos")
    private String cpf;
    @Column(name="rg", length=9, nullable = true) private String rg;
    @Column(name="endereco", length=120, nullable = true) private String endereco;
    @Column(name="cep", length=8, nullable = true) private String cep;
    @Column(name="uf", length=2, nullable = true) private String uf;
    @Column(name="crm", length=6, nullable = true) private String crm;
    @Column(name="coren", length=20, nullable = true) private String coren;
    public Funcionario() {}
    public Integer getIdFuncionario(){return idFuncionario;} public void setIdFuncionario(Integer i){this.idFuncionario=i;}
    public Cargo getCargo(){return cargo;} public void setCargo(Cargo c){this.cargo=c;}
    public String getNome(){return nome;} public void setNome(String n){this.nome=n;}
    public String getSexo(){return sexo;} public void setSexo(String s){this.sexo=s;}
    public String getTelefone(){return telefone;} public void setTelefone(String t){this.telefone=t;}
    public LocalDate getDataNascimento(){return dataNascimento;} public void setDataNascimento(LocalDate d){this.dataNascimento=d;}
    public String getCpf(){return cpf;} public void setCpf(String c){this.cpf=c;}
    public String getRg(){return rg;} public void setRg(String r){this.rg=r;}
    public String getEndereco(){return endereco;} public void setEndereco(String e){this.endereco=e;}
    public String getCep(){return cep;} public void setCep(String c){this.cep=c;}
    public String getUf(){return uf;} public void setUf(String u){this.uf=u;}
    public String getCrm(){return crm;} public void setCrm(String crm){this.crm=crm;}
    public String getCoren(){return coren;} public void setCoren(String coren){this.coren=coren;}
}
