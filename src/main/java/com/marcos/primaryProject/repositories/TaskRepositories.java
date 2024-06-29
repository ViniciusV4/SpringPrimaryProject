package com.marcos.primaryProject.repositories;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.marcos.primaryProject.models.Task;


@Repository
public interface TaskRepositories extends JpaRepository<Task, Long> {
    
    List<Task> findByUser_Id(Long id);

    //@Query ("SELECT t FROM Task t WHERE t.user.id = :id")
    //List<Task> findByUserId(@Param("id") Long id);
}
