package com.htc.user.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.htc.user.entity.UserRegistration;



public interface UserRegistrationInterface extends JpaRepository<UserRegistration, Long> {
	@Query(value="select * from UserRegistration where Id=?1",nativeQuery = true)
	public UserRegistration findById(String Id);

}
