package at.spengergasse.mis.testgithubclassroom.db;

import at.spengergasse.mis.testgithubclassroom.db.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TestRepository extends JpaRepository<Test, Long> {
}
