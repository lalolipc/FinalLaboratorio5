package com.utn.gocella.controller;

import com.utn.gocella.model.Printer;
import com.utn.gocella.service.PrinterService;
import org.apache.coyote.Response;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class PrinterControllerTest {

    PrinterController printerController;
    PrinterService printerService;

    @Before
    public  void setUp(){
        printerService=mock(PrinterService.class);
        printerController=new PrinterController(printerService);

    }

    @Test
    public void getAllPrinters(){
        Printer one=Printer.builder().id(10).brand("n").model("nn").operativesistem("xp").build();
        Printer two=Printer.builder().id(10).brand("n").model("nn").operativesistem("xp").build();
        List<Printer> list=new ArrayList<Printer>();
        list.add(one);
        list.add(two);

        when(printerService.getAllPrinters()).thenReturn(list);
        ResponseEntity<List<Printer>> lP=printerController.getAllPrinters();

        assertEquals(lP.getBody().get(1),list.get(1));
        verify(printerService,times(1)).getAllPrinters();
    }
}
