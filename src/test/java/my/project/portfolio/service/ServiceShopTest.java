package my.project.portfolio.service;


import my.project.portfolio.entity.Brand;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.bean.override.mockito.MockitoBean;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class ServiceShopTest {
    @MockitoBean
    private Brand brand;

    @LocalServerPort
    private int port;
    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    void list() {
        final ResponseEntity<String> actual = this.restTemplate.exchange("http://localhost:" + port + "/shop",
                HttpMethod.GET, null, String.class);
        Assertions.assertThat(actual.getStatusCode()).isEqualTo(HttpStatus.OK);
    }
}