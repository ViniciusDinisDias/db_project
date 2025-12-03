package br.com.hospital.dto;
import java.time.LocalDate;

import br.com.hospital.model.Paciente;
import jakarta.persistence.Column;
import lombok.Getter;

public class PacienteDTO {
    @Getter
    private Integer idPaciente;
    @Getter
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

    public void setIdPaciente(Integer i){this.idPaciente=i;}
    public String getNome(){return nome;} public void setNome(String n){this.nome=n;}
    public String getSexo(){return sexo;} public void setSexo(String s){this.sexo=s;}
    public String getTelefone(){return telefone;} public void setTelefone(String t){this.telefone=t;}
    public LocalDate getDataNascimento(){return dataNascimento;} public void setDataNascimento(LocalDate d){this.dataNascimento=d;}
    public String getCpf(){return Paciente.formatarCpf(cpf);} public void setCpf(String c){this.cpf=c;}
    public String getRg(){return rg;} public void setRg(String r){this.rg=r;}
    public String getEndereco(){return endereco;} public void setEndereco(String e){this.endereco=e;}
    public String getCep(){return cep;} public void setCep(String c){this.cep=c;}
    public String getUf(){return uf;} public void setUf(String u){this.uf=u;}
}