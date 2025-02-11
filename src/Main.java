import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<MailDeliveryService> services = Sender.getMailDeliveryServices();
        Sender.sendingMail(services);
    }
}