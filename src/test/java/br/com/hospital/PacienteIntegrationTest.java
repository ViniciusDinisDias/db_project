package br.com.hospital;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
public class PacienteIntegrationTest {
    @Autowired private TestRestTemplate rest;
    @Test
    public void listReturns200() {
        ResponseEntity<String> res = rest.getForEntity("/pacientes", String.class);
        assert(res.getStatusCode().is2xxSuccessful());
    }
}
