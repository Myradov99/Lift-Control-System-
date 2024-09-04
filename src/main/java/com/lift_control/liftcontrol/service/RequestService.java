package com.lift_control.liftcontrol.service;



import com.lift_control.liftcontrol.entity.Request;
import com.lift_control.liftcontrol.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RequestService implements RequestServiceInterface {

    @Autowired
    private RequestRepository requestRepository;
    @Override
    public List<Request> getAllRequests() {
        return requestRepository.findAll();
    }
    @Override
    public Request getRequestById(Long id) {
        return requestRepository.findById(id).orElse(null);
    }
    @Override
    public Request saveRequest(Request request) {
        return requestRepository.save(request);
    }
    @Override
    public void deleteRequest(Long id) {
        requestRepository.deleteById(id);
    }
}
