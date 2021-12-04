package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.app.pojo.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query(value = "SELECT * FROM User where email=?1 and password= ?2", nativeQuery = true)
	public User getUserByEmailIdAndPassword(@Param("emailId")String emailId, @Param("password")String password);
}