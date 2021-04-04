
package funcionario;


public class Secretario extends Funcionario{

    public Secretario(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }
    
    
   @Override
    public void Bonificar(){
        this.salario *= 1.05;
        System.out.println("O salario atualizado dos funcionarios de "+this.cargo+" é: "+this.salario);
    }
    
}
