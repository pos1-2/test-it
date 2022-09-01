package at.spengergasse.mis.testgithubclassroom.http;

import at.spengergasse.mis.testgithubclassroom.db.TestRepository;
import at.spengergasse.mis.testgithubclassroom.db.model.Test;
import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class TestController {
    @Autowired
    private TestRepository testRepository;

    @PostMapping("/{test}")
    public ResponseEntity<Test> getTest(@PathVariable String test) {
        return ResponseEntity.internalServerError().build();

//        val java = Test.builder().test(test).build();
//        log.info("To be stored: {}", java);
//        val db = testRepository.save(java);
//        log.info("Stored: {}", db);
//
//        return ResponseEntity.ok().body(db);
    }

}
