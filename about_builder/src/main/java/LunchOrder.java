public class LunchOrder {
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    /*
    * 1. making constructor as private, ensure LunchOrder can't be instanted outside this class
    * 2. constructor only accept Builder, so this is the bridge how we use builder to create LunchOderBean object
    * 3. In order to wire the two object up, you observe that redundancy fields between Builder and LunchOrder
    * */
    private LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }


    /*
    * you can only see the getters but no setters, that ensures the object immucontratable
    * */
    public String getBread() {
        return bread;
    }
    public String getCondiments() {
        return condiments;
    }
    public String getDressing() {
        return dressing;
    }
    public String getMeat() {
        return meat;
    }


    /*
    * 1.this inner must be static, otherwise it requires an instance of outer calss(LunchOrder) to access Builder
    *
    * */
    public static class Builder{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder(){}

        public LunchOrder build(){
            return new LunchOrder(this);
        }

        public Builder buildBread(String bread){
            this.bread = bread;
            return this;
        }
        public Builder buildDressing(String dressing){
            this.dressing = dressing;
            return this;
        }
        public Builder buildCondiments(String condiments){
            this.condiments = condiments;
            return this;
        }
        public Builder buildMeat(String meat){
            this.meat = meat;
            return this;
        }
    }

}
