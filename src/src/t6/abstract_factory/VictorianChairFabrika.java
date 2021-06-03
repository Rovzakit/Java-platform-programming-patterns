package t6.abstract_factory;

public class VictorianChairFabrika implements Fabrika {


    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
