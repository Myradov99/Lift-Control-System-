package com.lift_control.liftcontrol.Controller;

import com.lift_control.liftcontrol.dto.RequestDto;
import com.lift_control.liftcontrol.entity.Request;
import com.lift_control.liftcontrol.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/request")
public class RequestController {

    @Autowired
    private RequestService requestService;

    @GetMapping	
    public List<Request> getAllRequests() {
        return requestService.getAllRequests();
    }

    @PostMapping
    public Request createRequest(@RequestBody RequestDto requestDto) {
        Request request = new Request();
        request.setReqUp(requestDto.isReqUp());
        request.setReqDown(requestDto.isReqDown());
        return requestService.saveRequest(request);
    }

    @DeleteMapping("/{id}")
    public void deleteRequest(@PathVariable Long id) {
        requestService.deleteRequest(id);
    }
}
