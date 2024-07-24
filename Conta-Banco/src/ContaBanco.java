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

    public String getAgencia() {
        return Agencia;
    }

    public void setAgencia(String Agencia) {
        this.Agencia = Agencia;
    }

    public String getNomeCliente() {
        return NomeCliente;
    }

    public void setNomeCliente(String NomeCliente) {
        this.NomeCliente = NomeCliente;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }
    

    
}
