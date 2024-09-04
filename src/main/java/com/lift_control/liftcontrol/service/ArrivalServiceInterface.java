
package com.lift_control.liftcontrol.service;

import com.lift_control.liftcontrol.entity.Arrival;
import java.util.List;

public interface ArrivalServiceInterface {
    List<Arrival> getAllArrivals();
    Arrival getArrivalById(Long id);
    Arrival saveArrival(Arrival arrival);
    void deleteArrival(Long id);
}
