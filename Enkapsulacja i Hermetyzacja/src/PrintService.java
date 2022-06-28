import java.util.Scanner;

public class PrintService {

//    public Client createClient() {
//        Client client = new Client();
//        return client;
//    }

    public void printClientInfo(Client client, double price) {

        DiscountService discountService = new DiscountService();
        double priceDiscount = discountService.calculateDiscountPrice(client, price);

        if(client.getFirstName()==null || client.getLastName()==null)
            System.out.println("Witaj nieznajomy");
        else
            System.out.println("Witaj " + client.getFirstName() + " " + client.getLastName());
        System.out.println("Kwota przed rabatem: " + price);
        System.out.println("Do zapłaty (po rabacie): " + priceDiscount);
    }
}
