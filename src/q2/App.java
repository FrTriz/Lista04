package q2;

public class App {
    public static void main(String args[]){
        ContaCorrente conta1 = new ContaCorrente();
        ContaCorrente conta2 = new ContaCorrente();
        ContaCorrente conta3 = new ContaCorrente();

        Banco banco = new Banco("Beatriz", conta1,"Marcos", conta2,"Fernanda", conta3);

        banco.creditar("Beatriz",1000);
        banco.creditar("Marcos",500);
        banco.creditar("Fernanda",2000);

        banco.debitar("Beatriz",100);
        banco.debitar("Marcos",300);
        banco.debitar("Fernanda",1000);

        banco.transferir("Beatriz","Marcos",500);

        System.out.println("Saldo de Beatriz: " + banco.getSaldo("Beatriz"));
        System.out.println("Saldo de Marcos: " + banco.getSaldo("Marcos"));
        System.out.println("Saldo de Fernanda: " + banco.getSaldo("Fernanda"));
    }
}
