package com.utn.gocella.controlelr;

import com.utn.gocella.model.Printer;
import com.utn.gocella.service.IntegrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    IntegrationService integrationService;

    public ApiController(IntegrationService integrationService) {
    }

    @GetMapping("/")
    public Printer getPrinter() {
        return integrationService.getPrinter();
    }
}
