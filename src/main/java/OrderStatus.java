public enum OrderStatus {

    IN_PROCESS("IB"),
    SHIPPED("V"),
    COMPLETED("A");

    private final String abbreviation;

    private OrderStatus(String a) {
        abbreviation = a;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
