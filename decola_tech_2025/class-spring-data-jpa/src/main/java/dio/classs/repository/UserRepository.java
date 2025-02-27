package main.java.dio.classs.repository;

import dio.classs.model.User;
import org.springframwork.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
