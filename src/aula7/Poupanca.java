
package aula7;


public class Poupanca extends Conta {
    private double saldo_poupanca;

    public Poupanca(double saldo_poupanca, String nome, int numero, double saldo) {
        super(nome, numero, saldo);
        this.saldo_poupanca = saldo_poupanca;
    }

   

    

    @Override
    public double Saldo() {
        return saldo_poupanca;
    }
    
    
    @Override
    public void Sacar(double valor){
        if(this.saldo_poupanca > valor){
                this.saldo_poupanca -= valor;
                System.out.println("Saque retirado da poupança!");
                System.out.println("Seu saldo é: "+this.saldo_poupanca);
                }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
    
    public void Sacar(int valor){
        if(this.saldo > valor){
                this.saldo -= valor;
                System.out.println("Saque retirado da conta!");
                System.out.println("Seu saldo é: "+this.saldo);
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
                
           
    @Override
   public void tipo_de_conta(){
        System.out.println("A conta é: POUPANÇA ");
   }
    
}
