public class DeliveryCalculationService {

    DeliveryPaymentStrategy deliveryPaymentStrategy;

    public DeliveryCalculationService() {
    }

    public DeliveryCalculationService(DeliveryPaymentStrategy deliveryPaymentStrategy) {
        this.deliveryPaymentStrategy = deliveryPaymentStrategy;
    }

    public DeliveryPaymentStrategy getDeliverStrategy() {
        return deliveryPaymentStrategy;
    }

    public void setDeliverStrategy(DeliveryPaymentStrategy deliveryPaymentStrategy) {
        this.deliveryPaymentStrategy = deliveryPaymentStrategy;
    }

    public double calculate() {
        return deliveryPaymentStrategy.calculateDelivery();
    }

}
