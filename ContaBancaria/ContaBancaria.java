public class ContaBancaria {

    private int id;
    private String nomeTitular;
    private double saldo = 0.0;

    public ContaBancaria() {

    }

    public ContaBancaria(int id, String nomeTitular, double saldo) {
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public int getId() {
        return id;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String realizarCredito(double valor) {
        saldo += valor;
        return "Voce adicionou " + valor;
    }

    public String realizarDebito(double valor) {
        saldo -= valor;
        return "voce removeu " + valor;
    }

    public String realizarTransferencia(ContaBancaria contaDestino, double valor) {

        if (this.saldo < valor) {
            return "voce nao tem dinheiro";
        } else {
            contaDestino.realizarCredito(valor);
            this.realizarDebito(valor);
            return "Transferencia realizada com sucesso!\nValor transferido :" + valor + "\nTitular da conta de destino :" + contaDestino.nomeTitular + "\nSaldo total da sua conta :" + this.getSaldo();
        }
    }

    public String toString() {
        return "id da conta: " + id + "\nnome do titular: " + nomeTitular + "\nsaldo: " + saldo;
    }

}
