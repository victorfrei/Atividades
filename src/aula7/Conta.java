
package aula7;


public class Conta {
    protected String nome;
    protected int numero;
    protected double saldo;

    public Conta(String nome, int numero, double saldo) {
        this.nome = nome;
        this.numero = numero;
        this.saldo = saldo;
    }

   

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public double Saldo() {
        return saldo;
    }
    
    
    public void Sacar(double valor){
        if(this.saldo>=valor){
        this.saldo -= valor;
        System.out.println("Seu saldo atual é: "+this.saldo);
        }else{
        System.out.println("Não é possivel sacar!!");
        }
    }
    
    
    public void Depositar(double valor){
        this.saldo += valor;
        System.out.println("Seu saldo atual é: "+this.saldo);
    }    
    
    
    public void tipo_de_conta(){
        System.out.println("");
    }
    
}
