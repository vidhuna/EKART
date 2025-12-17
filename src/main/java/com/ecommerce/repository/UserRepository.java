package com.ecommerce.repository;
import java.lang.foreign.Linker.Option;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ecommerce.entity.User;
public class UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
    boolean existsByUsername(String username);
    boolean existsByEmail(String email);

   @Query("SELECT u FROM User u WHERE u.username = ?1 OR u.email = ?2")
   Optional<User> findByUsernameOrEmail(@Param("username") String username, @Param("email") String email);
}
