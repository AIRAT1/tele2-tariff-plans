public class TariffPlan {
    private String name;
    private int priceInRubles;
    private boolean pricePerMonth;
    private Internet internet;
    private Call call;
    private Sms sms;

    TariffPlan(String name, int price, boolean pricePerMonth, Internet internet, Call call, Sms sms) {
        this.name = name;
        this.priceInRubles = price;
        this.pricePerMonth = pricePerMonth;
        this.internet = internet;
        this.call = call;
        this.sms = sms;
    }

    @Override
    public String toString() {
        return  name +
                " {priceInRubles=" + priceInRubles +
                ", pricePerMonth=" + pricePerMonth +
                ", internet=" + internet +
                ", call=" + call +
                ", sms=" + sms +
                '}';
    }
}
