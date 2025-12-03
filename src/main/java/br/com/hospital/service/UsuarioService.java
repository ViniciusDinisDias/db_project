package br.com.hospital.service;

import br.com.hospital.model.Usuario;
import br.com.hospital.repository.UsuarioRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository repo;
    private final PasswordEncoder encoder;

    public UsuarioService(UsuarioRepository repo, PasswordEncoder encoder){
        this.repo = repo;
        this.encoder = encoder;
    }

    public Optional<Usuario> findByUsername(String username){
        return repo.findByUsername(username);
    }

    // Método para salvar usuário criptografando a senha "raw"
    public Usuario saveRawPasswordS(Usuario usuario) {
        // Criptografa a senha que está em texto plano
        usuario.setSenha(encoder.encode(usuario.getSenha()));
        // Define usuário ativo
        usuario.setEnabled(true);
        // Salva no banco
        return repo.save(usuario);
    }
}
