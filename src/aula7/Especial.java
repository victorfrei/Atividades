
package aula7;


public class Especial extends Conta {
    private double saldo_especial;
    private final double limite;

    public Especial(double saldo_especial, double limite, String nome, int numero, double saldo) {
        super(nome, numero, saldo);
        this.saldo_especial = saldo_especial;
        this.limite = limite;
    }

   

    

    
    
    @Override
    public double Saldo(){
        System.out.println("Saldo Especial: "+this.saldo_especial+" Saldo: "+this.saldo);
        return 0;
    }
    
    /**
     *
     * @param valor
     */
    
    
    @Override
    public void Sacar(double valor){
        if(valor < limite){
                this.saldo_especial -= valor;
                System.out.println("Saque retirado da conta especial!");
                System.out.println("Seu saldo é: "+this.saldo_especial);
                }else{
                    System.out.println("Você não pode realizar o saque na conta especial, você não possui esse limite de credito!!");
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
         System.out.println("A conta é: ESPECIAL  ");
    }
                
         
           
                
               
       
  }
    
    

