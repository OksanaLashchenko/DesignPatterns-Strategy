public class ExternalDeliveryPaymentService implements DeliveryPaymentStrategy {

    @Override
    public double calculateDelivery() {
        return 50.0;
    }

}
