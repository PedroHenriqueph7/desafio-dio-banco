package Banco;

public abstract class Conta implements IConta {

    private static  final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor){
        saldo-= valor;
    }

    public void depositar(double valor){
        saldo+= valor;
    }

    public void transferir(double valor, Conta contaDestino){
         this.sacar(valor);
         contaDestino.depositar(valor);
    }

    public void solicitarEmprestimo(double valor){
        
        if(valor <= 2000){
           saldo+= valor;
        }else{
           System.out.println("Solicitação de emprestimo negada, valor disponivel até R$ 2.000,00");
        }
    }

    public void imprimirInfosComuns(){
        System.out.println(String.format("Cliente: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
    public int getAgencia() {
        return agencia;
    }
    public int getNumero() {
        return numero;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
