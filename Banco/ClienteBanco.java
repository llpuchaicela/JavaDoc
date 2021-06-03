package Banco;

public class ClienteBanco {
    public static void main(String[]arg) {
        //Cuenta ahorro
        System.out.println("***Cuenta de ahorro***");
        Ahorro ctAh1 = new Ahorro(100, "01", 0.05);
        System.out.println(ctAh1.getSaldo());
        System.out.println(ctAh1.getNumero());
        ctAh1.depositar(320);

        System.out.println("\n-----------------\n");
        System.out.println("***Cuenta Corriente***");

        //Cuenta Corriente
        Corriente ctCnt1= new Corriente(345, "50");
        System.out.println(ctCnt1.getNumero());
        System.out.println(ctCnt1.getSaldo());
        ctCnt1.depositar(34);

        //Luego de depositar

        System.out.println("Luego del deposito");
        System.out.println(ctAh1.getSaldo());
        System.out.println(ctCnt1.getSaldo());

        //Luego de retirar
        ctAh1.retirar(50);
        System.out.println("Luego del retiro");
        System.out.println(ctAh1.getSaldo());
        System.out.println(ctCnt1.getSaldo());

        Ahorro ah1 = new Ahorro(-10, "001",0.1);
        System.out.println(ah1.getSaldo());



    }
}
