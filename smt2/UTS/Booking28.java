package UTS;

class Booking28 {
        private String customerName28;
        private AlatPesta[] items28;
        private int totalCost28;
    
        public Booking28(String customerName, AlatPesta[] items, int totalCost) {
            this.customerName28 = customerName;
            this.items28 = items;
            this.totalCost28 = totalCost;
        }
    
        public String getCustomerName() {
            return customerName28;
        }
    
        public AlatPesta[] getItems() {
            return items28;
        }
    
        public int getTotalCost() {
            return totalCost28;
        }
    
        @Override
        public String toString() {
            StringBuilder itemDetails = new StringBuilder();
            for (AlatPesta item : items28) {
                itemDetails.append(item.getNama()).append(", ");
            }
            return "Booking{" +
                    "Customer Name='" + customerName28 + '\'' +
                    ", Items=" + itemDetails.toString() +
                    ", Total Cost=" + totalCost28 +
                    '}';
        }
}
