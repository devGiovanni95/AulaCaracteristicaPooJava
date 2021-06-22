import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestaContaAnonima {
    public static void main(String[] args) {

        Cliente cli1 = new Cliente("Giovanni", true, "2507");
        Cliente cli2 = new Cliente("Mentorama", true, "2547");
        cli1.autentica("2507");
        cli2.autentica("2507");



        //criando uma classe anonima nao precisamos implementar um novo pacote e sim usa-lo aqui mesmo 

        List<Cliente> clientes = Arrays.asList(cli1, cli2);
        Consumer<Cliente> consumer = new Consumer<Cliente>() {
            @Override
            public void accept(Cliente cliente) {
                System.out.println(cliente.getNome());
            }
        };
        clientes.forEach(consumer);
    }
}
