import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Saler {

    @Autowired
    private Shop shop;

    @Override
    public String toString() {
        return "Saler{" +
                "shop=" + shop +
                '}';
    }
}
