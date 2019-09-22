public class Internet {
    private int trafficValueInGb;
    private boolean socialNetworkUnlimitedAccess;
    private boolean internetAbroadAccess;
    private boolean unlimitedAccess;

    Internet(int trafficValueInGb, boolean socialNetworkUnlimitedAccess, boolean internetAbroadAccess, boolean unlimitedAccess) {
        this.trafficValueInGb = trafficValueInGb;
        this.socialNetworkUnlimitedAccess = socialNetworkUnlimitedAccess;
        this.internetAbroadAccess = internetAbroadAccess;
        this.unlimitedAccess = unlimitedAccess;
    }

    @Override
    public String toString() {
        return "{" +
                "trafficValueInGb=" + trafficValueInGb +
                ", socialNetworkUnlimitedAccess=" + socialNetworkUnlimitedAccess +
                ", internetAbroadAccess=" + internetAbroadAccess +
                ", unlimitedAccess=" + unlimitedAccess +
                '}';
    }
}
