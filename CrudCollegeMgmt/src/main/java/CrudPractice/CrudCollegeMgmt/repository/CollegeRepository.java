package CrudPractice.CrudCollegeMgmt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import CrudPractice.CrudCollegeMgmt.entity.College;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {

}
