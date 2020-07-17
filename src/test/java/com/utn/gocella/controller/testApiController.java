package com.utn.gocella.controller;

import com.utn.gocella.controlelr.ApiController;
import com.utn.gocella.model.Printer;
import com.utn.gocella.service.IntegrationService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

public class testApiController {

    ApiController apiController;
    IntegrationService integrationService;

    @Before
    public  void setUp(){
        integrationService=mock(IntegrationService.class);
        apiController=new ApiController(integrationService);

    }

    @Test
    public void getAllPrinters(){
        Printer one=Printer.builder().brand("n").model("nn").operativesistem("xp").build();
                when(integrationService.getPrinter()).thenReturn(one);
        Printer lP=apiController.getPrinter();

        assertEquals(lP.getBrand(),one.getBrand());
        verify(integrationService,times(1)).getPrinter();
    }
}
