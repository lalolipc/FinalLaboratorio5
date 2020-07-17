package com.utn.gocella.controller;


import com.utn.gocella.model.Printer;
import com.utn.gocella.service.PrinterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/printer")
public class PrinterController {
PrinterService printerService;

@Autowired
    public PrinterController(PrinterService printerService) {
        this.printerService = printerService;
    }
@GetMapping("/")
    public ResponseEntity<List<Printer>> getAllPrinters(){

    List<Printer> list=printerService.getAllPrinters();
    return  ResponseEntity.ok(list);
}

@PostMapping("/")
    public void addPrinter(@RequestBody final Printer printer){
   printerService.addPRinter(printer);

}
}
