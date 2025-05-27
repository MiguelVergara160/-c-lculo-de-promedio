public class CuentaBancaria{
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular){
        this.titular = titular;
        this.saldo = 0;
    }
    public void depositar(double monto){
        if (monto > 0){
            saldo = saldo + monto;
        }
    }

    public boolean retirar(double monto){
        if (monto > 0 && saldo >= monto){
            saldo = saldo - monto;
            return true;
        } 
        return false;
        
    }

    public double getSaldo(){
        return saldo;
    }

    public String getTitular(){
        return titular;
    }

    public void setTitular(String nuevoTitular) {
        titular = nuevoTitular;
    }
}
