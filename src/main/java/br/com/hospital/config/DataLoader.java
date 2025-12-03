package br.com.hospital.config;

import br.com.hospital.model.User;
import br.com.hospital.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class DataLoader implements CommandLineRunner {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder passwordEncoder;

    public DataLoader(UserRepository userRepository, BCryptPasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void run(String... args) throws Exception {

        criarUsuarioSeNaoExistir("admin", "123", "ROLE_ADMIN");
        criarUsuarioSeNaoExistir("medico", "123", "ROLE_MEDICO");
        criarUsuarioSeNaoExistir("enfermeiro", "123", "ROLE_ENFERMEIRO");
        criarUsuarioSeNaoExistir("recepcionista", "123", "ROLE_RECEPCIONISTA");
        criarUsuarioSeNaoExistir("paciente", "123", "ROLE_PACIENTE");

        System.out.println("✅ Usuários padrão verificados/criados com sucesso!");
    }

    private void criarUsuarioSeNaoExistir(String username, String senha, String role) {
        if (userRepository.findByUsername(username).isEmpty()) {
            User user = User.builder()
                    .username(username)
                    .senha(passwordEncoder.encode(senha))
                    .role(role)
                    .enabled(true)
                    .build();
            userRepository.save(user);
        }
    }
}
