
package aula7;


public class Aula7 {

    
    public static void main(String[] args) {
        Poupanca c1 = new Poupanca(2000,"conta1",0,10000);
        ContaUniversitaria c2 = new ContaUniversitaria(500,"conta2",0,10000);
        Especial c3 = new Especial(1000,2000,"conta3",0,10000);
        
        
        System.out.println("C1");
        
        c1.Sacar(1000);
        c1.Saldo();
        c1.Depositar(300);
        c1.Saldo();
        
        System.out.println("C2");
        c2.Saldo();
        c2.Sacar(10000);
        c2.Depositar(300);
        c2.Saldo();
        
        System.out.println("C3");
        c3.Sacar(400.00);
        c3.Sacar(250);
        c3.Saldo();
       
        
        
    }
    
}
