public class TariffPlan {
    private int id;
    private String name;
    private int priceInRubles;
    private boolean pricePerMonth;
    private Internet internet;
    private Call call;
    private Sms sms;

    TariffPlan(int id, String name, int price, boolean pricePerMonth, Internet internet, Call call, Sms sms) {
        this.id = id;
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
                " {id=" + id +
                ", priceInRubles=" + priceInRubles +
                ", pricePerMonth=" + pricePerMonth +
                ", internet=" + internet +
                ", call=" + call +
                ", sms=" + sms +
                '}';
    }
}
