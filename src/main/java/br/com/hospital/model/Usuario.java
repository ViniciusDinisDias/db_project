package br.com.hospital.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true, nullable = false)
    @NotBlank
    private String username;

    @Column(nullable = false)
    @NotBlank
    private String senha;

    @Column(nullable = false)
    private String role; // e.g. ROLE_ADMIN, ROLE_MEDICO, ROLE_RECEP

    @Column(nullable = false)
    private boolean enabled;

    public Usuario() {}

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String u) { this.username = u; }

    public String getSenha() { return senha; }
    public void setSenha(String s) { this.senha = s; }

    public String getRole() { return role; }
    public void setRole(String r) { this.role = r; }

    public boolean isEnabled() { return enabled; }
    public void setEnabled(boolean enabled) { this.enabled = enabled; }
}
