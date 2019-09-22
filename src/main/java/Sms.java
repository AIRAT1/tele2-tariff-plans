public class Sms {
    private int freeSmsCount;

    Sms(int freeSmsCount) {
        this.freeSmsCount = freeSmsCount;
    }

    @Override
    public String toString() {
        return "{" +
                "freeSmsCount=" + freeSmsCount +
                '}';
    }
}
