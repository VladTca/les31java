import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sender {

    static void sendingMail(List<MailDeliveryService> services) {
      send(choiceService(services));
    }

    static List<MailDeliveryService> getMailDeliveryServices() {
        List<MailDeliveryService> services = new ArrayList<>();
        services.add(new DHL());
        services.add(new Email());
        services.add(new Pigeon());
        return services;
    }

    public static MailDeliveryService choiceService(List<MailDeliveryService> services ) {
        System.out.println("Какую службу доставки использовать? (Pigeon, Email, DHL)");
        Scanner sc = new Scanner(System.in);
        String deliveryService = sc.nextLine();
        sc.close();
        for (MailDeliveryService service : services) {
            if (service.getClass().getSimpleName().equalsIgnoreCase(deliveryService)) {
                return service;
            }
        }
        return new MailDeliveryService() {
        };
    }

    public static void send(MailDeliveryService mailDeliveryService){
        mailDeliveryService.sendMail();
    }
}
