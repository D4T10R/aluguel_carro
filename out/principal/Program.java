package out.principal;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import out.entities.CarRental;
import out.entities.Vehicle;

public class Program {

    public static void main(String[] args) {
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Entre com  os dados do aluguel");
        try {
            System.out.print("Modelo do carro: ");
            String modelo = sc.nextLine();
            System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
            LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
            System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
            LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
            CarRental cr = new CarRental(start, finish, new Vehicle(modelo));

            System.out.println("Preço por hora: R$10.00");
            System.out.println("Preço por dia: R$130.00");
            System.out.println("FATURA: ");
            System.out.println("Pagamento basico: ");
        }
        catch (IOException e) {
            e.printStackTrace();
        }



    }

}