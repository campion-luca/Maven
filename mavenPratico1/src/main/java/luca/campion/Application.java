package luca.campion;

import javax.print.attribute.standard.MediaSize;
import java.sql.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Application {

    public static void main(String[] args) {

        System.out.println("Maven esercizio pratico");

        // primo esercizio :

        // lista customer
        Customer Luca = new Customer("Luca",5);
        Customer Cristina = new Customer("Cristina",1);
        Customer Paolo = new Customer("Paolo",10);
        Customer Devis = new Customer("Devis",6);



        // lista order :

        List<Order> orderList = new ArrayList<>();

        Order primo = new Order(Luca);
        Order secondo = new Order(Cristina);
        Order terzo = new Order(Paolo);
        Order quarto = new Order(Devis);

        orderList.add(primo);
        orderList.add(secondo);
        orderList.add(terzo);
        orderList.add(quarto);



    }
}
