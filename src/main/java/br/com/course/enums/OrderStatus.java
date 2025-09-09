package br.com.course.enums;

public enum OrderStatus {
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int value;

    private OrderStatus(int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }

    public static OrderStatus valueOf(int code) throws IllegalAccessException {
        for (OrderStatus obj : OrderStatus.values()){
            if (code == obj.getValue()){
                return obj;
            }
        }
        throw new IllegalAccessException("Invalid OrderStatus code");
    }
}
