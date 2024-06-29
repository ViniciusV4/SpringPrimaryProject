package com.marcos.primaryProject.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.marcos.primaryProject.models.User;

// aqui estamos criando uma interface que extende o JpaRepository, que é uma interface que já tem métodos prontos para fazer o CRUD;
// ela se relaciona com a model e faz a busca no banco de dados;
@Repository
public interface UserRepositories extends JpaRepository<User, Long> {
    
}
