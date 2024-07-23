public class ContaBanco {

    private String Numero;
    private String Agencia;
    private String NomeCliente;
    private double Saldo;

    public ContaBanco(String Agencia, String Banco, String NomeCliente, double Saldo) {
        this.Numero = Numero;
        this.Agencia = Agencia;
        this.NomeCliente = NomeCliente;
        this.Saldo = Saldo;

    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
    
}
