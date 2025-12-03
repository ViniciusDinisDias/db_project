package br.com.hospital.dto;

public class RemedioDTO {
    private Integer idRemedio;
    private String nome;
    private String descricao;

    public Integer getIdRemedio() {
        return idRemedio;
    }

    public void setIdRemedio(Integer idRemedio) {
        this.idRemedio = idRemedio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
