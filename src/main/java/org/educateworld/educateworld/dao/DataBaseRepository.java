package org.educateworld.educateworld.dao;

import org.educateworld.educateworld.model.CoreJava;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface DataBaseRepository extends JpaRepository<CoreJava, String>{
	@Query(value = "SELECT * FROM `educateworld`.`core_java` WHERE id = ?1", nativeQuery = true)
	CoreJava getById(String id);
}
