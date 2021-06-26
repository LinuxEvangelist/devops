package com.rllontop.devops.services;

import com.rllontop.devops.web.model.DevopsDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class DevopsServiceImpl implements DevopsService {
    @Override
    public String respondMessage(DevopsDto devopsDto) {
        return "Hello "+devopsDto.getFrom()+" your message will be send";
    }
}
