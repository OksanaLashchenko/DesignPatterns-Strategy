public class InternalDeliveryPaymentService implements DeliveryPaymentStrategy {

    @Override
    public double calculateDelivery() {
        return 20.0;
    }

}
