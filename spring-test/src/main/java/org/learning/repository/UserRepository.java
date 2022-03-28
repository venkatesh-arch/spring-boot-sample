package org.learning.repository;

 
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.learning.model.*;
 
@Repository
public interface UserRepository extends JpaRepository<User, Long> {}
