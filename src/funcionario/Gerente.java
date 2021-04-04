
package funcionario;


public class Gerente extends Funcionario{

    public Gerente(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }
    
    
    
    @Override
    public void Bonificar(){
        this.salario *= 1.15;
        System.out.println("O salario atualizado dos funcionarios de "+this.cargo+" é: "+this.salario);
    }
    
    
}
