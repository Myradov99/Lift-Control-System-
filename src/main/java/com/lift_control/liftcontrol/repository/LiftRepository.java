package com.lift_control.liftcontrol.repository;

import com.lift_control.liftcontrol.entity.Lift;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiftRepository extends JpaRepository<Lift, Long> {
}
