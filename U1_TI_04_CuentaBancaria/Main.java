public class Main{
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Yahir");

        cuenta.depositar(1000);
        System.out.println("Deporsito de 1000 realizado.");
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        boolean retiro1 = cuenta.retirar(200);
        if(retiro1){
            System.out.println("Retiro de 200 exitoso");
        } else{
            System.out.println("Retiro de 200 fallido");
        }
        System.out.println("Saldo actual: " + cuenta.getSaldo());

        boolean retiro2 = cuenta.retirar(10000);
        if(retiro2){
            System.out.println("Retiro de 10000 exitoso");
        } else{
            System.out.println("Retiro de 10000 fallido");
        }
        System.out.println("Saldo final: " + cuenta.getSaldo());
    }
}