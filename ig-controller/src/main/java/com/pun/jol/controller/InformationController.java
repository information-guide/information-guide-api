package com.pun.jol.controller;

//import com.pun.jol.dataaccess.entity.Information;
//import com.pun.jol.dataaccess.service.InformationService;
import com.pun.jol.dataaccess.dto.InformationDto;
import com.pun.jol.dataaccess.entity.Information;
import com.pun.jol.dataaccess.service.InformationService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class InformationController {
    @Autowired(required = false) private InformationService service;
    @PostMapping("/information")
    public ResponseEntity<Information> saveInformation(@RequestBody Information information) {
        return ResponseEntity.ok(service.saveInformation(information));
    }

    @GetMapping("/all-information/{id}")
    public ResponseEntity<InformationDto> getAllTopicInformation(@PathVariable int id, @RequestParam(required = false) String search) {
        return ResponseEntity.ok(service.getAllInformationByTopic(id, search));
    }

    @DeleteMapping(value= "/all-information/{id}", produces="text/plain")
    public ResponseEntity<?> deleteInformationById(@PathVariable long id){
        service.deleteInformationById(id);
        return ResponseEntity.accepted().build();
    }

    @PutMapping(value = "/information", produces="text/plain")
    public ResponseEntity<?> updateInformationById(@RequestBody Information information) {
        service.updateInformationById(information);
        return ResponseEntity.accepted().build();
    }

    @GetMapping(value = "/all-information")
    public ResponseEntity<List<Information>> getAllInformation() {
        return ResponseEntity.ok(service.getAllInformation());
    }
}
