import java.util.Arrays;
import java.util.List;

public class TestaConta {
    public static void main(String[] args) {
        /*  parte referente a contas

        ContaCorrente cc1 = new ContaCorrente(1, 1, "Inter", 100, 1000);
        ContaCorrente cc2 = new ContaCorrente(2, 1, "nubank", 0, 100);
        ContaCorrente cc3 = new ContaCorrente(3, 1, "Nubank", 0, 0);

        List<ContaCorrente> contas = Arrays.asList(cc1, cc2, cc3);

        for (ContaCorrente conta : contas) {
            System.out.println(conta);
        }*/


        Cliente cli1 = new Cliente("Giovanni", true, "2507");
        Cliente cli2 = new Cliente("Mentorama", true, "2547");
        cli1.autentica("456");

        List<Cliente> clientes = Arrays.asList(cli1, cli2);
        MostraConta mostra = new MostraConta();
        clientes.forEach(mostra);

    }
}
