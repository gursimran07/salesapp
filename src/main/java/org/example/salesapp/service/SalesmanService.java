package org.example.salesapp.service;

import org.example.salesapp.model.Salesman;

import java.util.List;
import java.util.Map;

public interface SalesmanService {

    List<Salesman> getAllSalesmen();

    void saveOrUpdateSalesman(Salesman salesman);

    Salesman getSalesmanById(Long id);

    void deleteSalesman(Long id);

    Map<String, Map<String, Double>> getSalesSummary();
}
