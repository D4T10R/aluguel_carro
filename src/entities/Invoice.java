package entities;

public class Invoice {
 
    // ATRIBUTOS
    private Double basicPayment;
    private Double tax;    
    // ATRIBUTOS

    // CONSTRUTORES
    public Invoice() {
    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }
    // CONSTRUTORES

    // ENCAPSULAMENTO
    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
    // ENCAPSULAMENTO
    
    // METODOS
    public Double getTotalPayment() {
        return getBasicPayment() + getTax();
    }
    // METODOS
    


}
