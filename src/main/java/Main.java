public class Main {

    public static void main(String[] args) {
        DeliveryCalculationService calculationService1 = new DeliveryCalculationService();
        calculationService1.setDeliverStrategy(new PickupPaymentService());
        double calculation1 = calculationService1.calculate();
        System.out.println(calculation1);

        DeliveryCalculationService calculationService2 = new DeliveryCalculationService();
        calculationService2.setDeliverStrategy(new InternalDeliveryPaymentService());
        double calculation2 = calculationService2.calculate();
        System.out.println(calculation2);

        DeliveryCalculationService calculationService3 = new DeliveryCalculationService();
        calculationService3.setDeliverStrategy(new ExternalDeliveryPaymentService());
        double calculation3 = calculationService3.calculate();
        System.out.println(calculation3);
    }

}
