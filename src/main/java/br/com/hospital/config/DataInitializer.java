package br.com.hospital.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import br.com.hospital.model.Usuario;
import br.com.hospital.service.UsuarioService;

@Component
public class DataInitializer implements CommandLineRunner {

    private final UsuarioService usuarioService;

    public DataInitializer(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public void run(String... args) throws Exception {
        criarUsuarioSeNaoExistir("admin", "admin", "ROLE_ADMIN");
        criarUsuarioSeNaoExistir("medico1", "123456", "ROLE_MEDICO");
        criarUsuarioSeNaoExistir("recep1", "123456", "ROLE_RECEP");
    }

    private void criarUsuarioSeNaoExistir(String username, String senha, String role) {
        if (usuarioService.findByUsername(username).isEmpty()) {
            Usuario usuario = new Usuario();
            usuario.setUsername(username);
            usuario.setSenha(senha);
            usuario.setRole(role);
            usuarioService.saveRawPasswordS(usuario);
        }
    }
}
