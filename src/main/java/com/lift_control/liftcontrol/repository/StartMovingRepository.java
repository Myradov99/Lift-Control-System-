package com.lift_control.liftcontrol.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.lift_control.liftcontrol.entity.StartMoving;

public interface StartMovingRepository extends JpaRepository<StartMoving, Long> {
}
