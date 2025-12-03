package br.com.hospital.dto;
import java.time.LocalDate;
import jakarta.persistence.Column;
public class FuncionarioDTO {
    private Integer idFuncionario;
    private Integer idCargo;
    private String nome;
    @Column(name = "sexo", nullable = true)
    private String sexo;
    private String telefone;
    private LocalDate dataNascimento;
    private String cpf;
    @Column(name = "rg", nullable = true)
    private String rg;
    private String endereco;
    private String cep;
    private String uf;
    private String crm;
    private String coren;
    public Integer getIdFuncionario(){return idFuncionario;} public void setIdFuncionario(Integer i){this.idFuncionario=i;}
    public Integer getIdCargo(){return idCargo;} public void setIdCargo(Integer i){this.idCargo=i;}
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