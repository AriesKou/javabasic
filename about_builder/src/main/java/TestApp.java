public class TestApp {
    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();

        LunchOrder lunchOrder = builder.buildBread("bread")
                .buildCondiments("condiments")
                .buildDressing("dressing")
                .buildMeat("meat")
                .build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getMeat());
    }
}
