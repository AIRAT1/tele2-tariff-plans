import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        TariffPlan myOnline = new TariffPlan(0,"Мой онлайн", 290, "month",
                new Internet(15, true, false, false),
                new Call(400, true),
                new Sms(0));
        TariffPlan myOnlinePlus = new TariffPlan(1, "Мой онлайн +", 350, "month",
                new Internet(20, true, true, false),
                new Call(600, true),
                new Sms(0));
        TariffPlan myTalk = new TariffPlan(2, "Мой разговор", 190, "month",
                new Internet(3, false, false, false),
                new Call(250, true),
                new Sms(0));
        TariffPlan myTele2 = new TariffPlan(3, "Мой Tele2", 7, "day",
                new Internet(6, false, false, false),
                new Call(0, true),
                new Sms(0));
        TariffPlan unlimited = new TariffPlan(4, "Безлимит", 400, "month",
                new Internet(0, false, false, true),
                new Call(500, true),
                new Sms(50));
        TariffPlan premium = new TariffPlan(5, "Премиум", 1100, "month",
                new Internet(40, false, false, false),
                new Call(2000, true),
                new Sms(500));
        TariffPlan classic = new TariffPlan(6, "Классический", 0, "month",
                new Internet(0, false, false, false),
                new Call(0, false),
                new Sms(0));
        TariffPlan internetForDevices = new TariffPlan(7, "Интернет для устройств", 0, "month",
                new Internet(0, false, false, false),
                new Call(0, false),
                new Sms(0));
        TariffPlan internetForThinks = new TariffPlan(8, "Интернет для вещей", 100, "month",
                new Internet(300, false, false, false),
                new Call(30, false),
                new Sms(100));

        List<TariffPlan> tariffPlans = new ArrayList<>(9);
        tariffPlans.add(myOnline);
        tariffPlans.add(myOnlinePlus);
        tariffPlans.add(myTalk);
        tariffPlans.add(myTele2);
        tariffPlans.add(unlimited);
        tariffPlans.add(premium);
        tariffPlans.add(classic);
        tariffPlans.add(internetForDevices);
        tariffPlans.add(internetForThinks);

        for (TariffPlan tariffPlan : tariffPlans) {
            System.out.println(tariffPlan);
        }
    }
}
