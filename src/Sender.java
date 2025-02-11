public class Sender {
    MailDeliveryService mailDeliveryService;

    public Sender(MailDeliveryService mailDeliveryService) {
        this.mailDeliveryService = mailDeliveryService;
    }
    void send(MailDeliveryService mailDeliveryService){
        mailDeliveryService.sendMail();
    }
}
