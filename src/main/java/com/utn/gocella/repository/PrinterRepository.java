package com.utn.gocella.repository;

import com.utn.gocella.model.Printer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrinterRepository  extends JpaRepository<Printer,Integer> {
}
