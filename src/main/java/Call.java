public class Call {
    private int freeMinutesInMonth;
    private boolean unlimitedTele2Calls;

    Call(int freeMinutesInMonth, boolean unlimitedTele2Calls) {
        this.freeMinutesInMonth = freeMinutesInMonth;
        this.unlimitedTele2Calls = unlimitedTele2Calls;
    }

    @Override
    public String toString() {
        return "{" +
                "freeMinutesInMonth=" + freeMinutesInMonth +
                ", unlimitedTele2Calls=" + unlimitedTele2Calls +
                '}';
    }
}
