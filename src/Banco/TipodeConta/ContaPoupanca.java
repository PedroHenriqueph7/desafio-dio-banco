package Banco.TipodeConta;

import Banco.Cliente;
import Banco.Conta;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança===");
        super.imprimirInfosComuns();
    }
    


}
