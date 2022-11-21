package services;

import java.time.Duration;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
    
    // ATRIBUTOS
    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxService taxService;
    // ATRIBUTOS

    // CONSTRUTORES
    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }
    // CONSTRUTORES

    // METODOS
    public void processInvoice(CarRental carRental) {

        Double minuntes = (double) Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        Double hours = minuntes / 60;
        
        Double basciPayment;

        if(hours <= 12) {
            basciPayment = pricePerHour * hours;
        }
        else {
            basciPayment = pricePerDay * Math.ceil(hours / 24);
        }

        Double tax = taxService.tax(basciPayment);

        carRental.setInvoice(new Invoice(basciPayment, tax));



    }
    // METODOS

    



}
