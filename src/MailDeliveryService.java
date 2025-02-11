public interface MailDeliveryService {
    default void sendMail(){
        System.out.println("Неизвестная служба доставки");
    }
}
