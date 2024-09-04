package com.lift_control.liftcontrol.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.lift_control.liftcontrol.entity.Arrival;

public interface ArrivalRepository extends JpaRepository<Arrival, Long> {
}
