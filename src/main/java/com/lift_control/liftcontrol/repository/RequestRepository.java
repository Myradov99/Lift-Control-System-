package com.lift_control.liftcontrol.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.lift_control.liftcontrol.entity.Request;

public interface RequestRepository extends JpaRepository<Request, Long> {
}
