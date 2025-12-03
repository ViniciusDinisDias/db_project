package br.com.hospital;

import br.com.hospital.model.Usuario;
import br.com.hospital.repository.UsuarioRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@ActiveProfiles("test")
class UsuarioIntegrationTest {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Test
    void deveEncontrarUsuarioAdmin() {
        Optional<Usuario> admin = usuarioRepository.findByUsername("admin");
        assertTrue(admin.isPresent(), "Usuário 'admin' deveria existir no banco de testes");
    }
}
