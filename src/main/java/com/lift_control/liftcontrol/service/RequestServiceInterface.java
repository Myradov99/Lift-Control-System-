package com.lift_control.liftcontrol.service;

import com.lift_control.liftcontrol.entity.Request;
import java.util.List;

public interface RequestServiceInterface {
    List<Request> getAllRequests();
    Request getRequestById(Long id);
    Request saveRequest(Request request);
    void deleteRequest(Long id);
}
