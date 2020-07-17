package com.utn.gocella.service;

import com.utn.gocella.model.Printer;
import com.utn.gocella.service.integration.IntegrationComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegrationService {



    IntegrationComponent integrationComponent;

    @Autowired
    public IntegrationService(IntegrationComponent integrationComponent) {
        this.integrationComponent = integrationComponent;
    }

    public Printer getPrinter() {
        return integrationComponent.getPrinter();
    }
}
