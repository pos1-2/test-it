package at.spengergasse.mis.testgithubclassroom;

import at.spengergasse.mis.testgithubclassroom.db.TestRepository;
import at.spengergasse.mis.testgithubclassroom.db.model.Test;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
@EnableJpaRepositories
@EnableTransactionManagement
@Slf4j
public class TestGithubClassroomApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestGithubClassroomApplication.class, args);
	}

	@Autowired
	private TestRepository testRepository;

	@PostConstruct
	@Transactional
	public void helloDbWorld() {
		val java = Test.builder().test("test").build();
		log.info("To be stored: {}", java);
		val db = testRepository.save(java);
		log.info("Stored: {}", db);
	}
}
