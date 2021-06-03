package t6.abstract_factory;

public class MagicChairFabrika implements Fabrika {

    @Override
    public Chair createChair(){
        return new MagicChair();
    }
}
