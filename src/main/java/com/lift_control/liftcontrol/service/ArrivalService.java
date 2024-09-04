package com.lift_control.liftcontrol.service;



import com.lift_control.liftcontrol.entity.Arrival;


import com.lift_control.liftcontrol.repository.ArrivalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArrivalService implements ArrivalServiceInterface {

    @Autowired
    private ArrivalRepository arrivalRepository;
    @Override
    public List<Arrival> getAllArrivals() {
        return arrivalRepository.findAll();
    }
    @Override
    public Arrival getArrivalById(Long id) {
        return arrivalRepository.findById(id).orElse(null);
    }
    @Override
    public Arrival saveArrival(Arrival arrival) {
        return arrivalRepository.save(arrival);
    }
    @Override
    public void deleteArrival(Long id) {
        arrivalRepository.deleteById(id);
    }
}

