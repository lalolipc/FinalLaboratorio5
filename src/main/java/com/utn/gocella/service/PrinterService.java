package com.utn.gocella.service;

import com.utn.gocella.model.Printer;
import com.utn.gocella.repository.PrinterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrinterService {

    PrinterRepository printerRepository;

@Autowired
    public PrinterService(PrinterRepository printerRepository) {
        this.printerRepository = printerRepository;
    }

    public List<Printer> getAllPrinters(){
    return  printerRepository.findAll();

    }

    public void addPRinter(Printer p) {
     printerRepository.save(p);
    }
}
