package com.muthu.ecommerce.repository;

import com.muthu.ecommerce.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
