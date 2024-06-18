package Banco;

import Banco.TipodeConta.ContaCorrente;
import Banco.TipodeConta.ContaPoupanca;

public class main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Exemplo");

        Conta cc = new ContaCorrente(cliente);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(cliente);
        poupanca.solicitarEmprestimo(2100);
        cc.transferir(100, poupanca);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato(); 
    }
    
}
