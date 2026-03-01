package Models;

public class Entities {
    
    // Müşteri Sınıfı
    public static class Customer {
        private int customerId;
        private String fullName;
        private String phoneNumber;
        private String address;

        // Constructor (Yapıcı Metot)
        public Customer(int customerId, String fullName, String phoneNumber, String address) {
            this.customerId = customerId;
            this.fullName = fullName;
            this.phoneNumber = phoneNumber;
            this.address = address;
        }

        // Getter ve Setter metotları buraya eklenecek...
    }

    // Sipariş Sınıfı
    public static class Order {
        private int orderId;
        private int customerId;
        private String carpetType;
        private double squareMeters;
        private double totalPrice;
        private String orderStatus;

        public Order(int orderId, int customerId, String carpetType, double squareMeters, double totalPrice, String orderStatus) {
            this.orderId = orderId;
            this.customerId = customerId;
            this.carpetType = carpetType;
            this.squareMeters = squareMeters;
            this.totalPrice = totalPrice;
            this.orderStatus = orderStatus;
        }
    }
}
