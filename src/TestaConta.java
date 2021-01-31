import java.util.Arrays;
import java.util.List;

public class TestaConta {
    public static void main(String[] args) {
        ContaCorrente cc1 = new ContaCorrente(1,1,"Inter",100,1000);
        ContaCorrente cc2 = new ContaCorrente(2,1,"nubank",0,100);
        ContaCorrente cc3 = new ContaCorrente(3,1,"Nubank",0,0);

        List<ContaCorrente> contas = Arrays.asList(cc1,cc2,cc3);

        for (ContaCorrente conta:contas){
            System.out.println(conta);
        }

        MostraConta mc = new MostraConta();
        contas.forEach(mc);
    }

    Cliente cli1 = new Cliente()
}
