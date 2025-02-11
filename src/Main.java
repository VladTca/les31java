import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String deliveryService = sc.nextLine();
        DHL dhl = new DHL();
        Email email = new Email();
        Pigeon pigeon = new Pigeon();
        if (deliveryService.equalsIgnoreCase("Pigeon")) {
            pigeon.sendMail();
        } else if (deliveryService.equalsIgnoreCase("DHL")) {
            dhl.sendMail();
        } else if (deliveryService.equalsIgnoreCase("Email")) {
            email.sendMail();
        } else {
            System.out.println("Неизвестная служба доставки");
        }

}}