public class DeliveryCalculationService {

    DeliveryPaymentStrategy deliveryPaymentStrategy;

    public DeliveryCalculationService() {
    }

    public void setDeliverStrategy(DeliveryPaymentStrategy deliveryPaymentStrategy) {
        this.deliveryPaymentStrategy = deliveryPaymentStrategy;
    }

    public double calculate() {
        return deliveryPaymentStrategy.calculateDelivery();
    }

}
