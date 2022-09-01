package at.spengergasse.mis.testgithubclassroom;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.client.MockMvcWebTestClient;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

// DO NOT EDIT
@SpringBootTest
public class GradingTests {

    WebTestClient client;

    @BeforeEach
    public void setup(WebApplicationContext wac) {
        client = MockMvcWebTestClient
                .bindTo(MockMvcBuilders.webAppContextSetup(wac).build())
                .build();
    }

    @Test
    public void testGet() {
        client.post().uri("/i-expect")
                .exchange()
                .expectStatus().is2xxSuccessful()
                .expectBody().jsonPath("$.test").isEqualTo("i-expect");
    }
}
