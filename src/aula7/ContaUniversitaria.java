
package aula7;


public class ContaUniversitaria extends Conta{
    private double saldo_universitaria;

    public ContaUniversitaria(double saldo_universitaria, String nome, int numero, double saldo) {
        super(nome, numero, saldo);
        this.saldo_universitaria = saldo_universitaria;
    }

    

       
   
    @Override
    public double Saldo() {
        System.out.println("Seu saldo é: "+this.saldo_universitaria);
        return 1;
    }
    
    
    @Override
    public void Sacar(double valor){
        if(this.saldo_universitaria>=valor){
        this.saldo_universitaria -= valor;
        System.out.println("Seu saldo atual é: "+this.saldo_universitaria);
        }else{
        System.out.println("Não é possivel sacar!!");
        }
    }
    
    @Override
    public void Depositar(double valor){
        this.saldo_universitaria += (valor + valor*0.05);
        System.out.println("Seu saldo atual é: "+this.saldo_universitaria);
    }  
    
    @Override
    public void tipo_de_conta(){
         System.out.println("A conta é: CONTA UNIVERSITÁRIA");
    }
    
    
}
