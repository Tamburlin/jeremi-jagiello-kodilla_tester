package com.kodilla.hibernate.task;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface TaskFinancialDetail extends CrudRepository<Task, Integer> {
    List<Task> findByID(int id);
}
