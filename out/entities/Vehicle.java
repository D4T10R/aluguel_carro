package out.entities;

public class Vehicle {

    // ATRIBUTOS
    private String model;
    // ATRIBUTOS

    // CONSTRUTORES 
    public Vehicle() {

    }

    public Vehicle(String model) {
        this.model = model;
    }
    // CONSTRUTORES 

    // ENCAPSULAMENTO
    public void setModel(String model) {
        this.model = model;
    }

    private String getModel() {
        return model;
    }
    // ENCAPSULAMENTO

    
}
