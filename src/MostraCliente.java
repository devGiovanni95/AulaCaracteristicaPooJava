import java.util.function.Consumer;

public class MostraCliente implements Consumer {

    public void accept(Object o) {
        System.out.println(o);
    }
}
