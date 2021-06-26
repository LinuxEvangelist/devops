package com.rllontop.devops.web.controller;

import com.rllontop.devops.services.DevopsService;
import com.rllontop.devops.web.model.DevopsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/v1/")
@RestController
public class DevopsController {
    private final DevopsService devopsService;

    @PostMapping(path = "DevOps")
    public ResponseEntity saveNewBrand(@Validated @RequestBody DevopsDto devopsDto){
        return new ResponseEntity(devopsService.respondMessage(devopsDto),HttpStatus.CREATED);
    }

}
