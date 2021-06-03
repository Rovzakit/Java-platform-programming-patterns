package t6.abstract_factory;

public class MultyfunctionChairFabrika implements Fabrika {
    @Override
    public Chair createChair() {
        return new MultyfunctionChair();
    }
}
