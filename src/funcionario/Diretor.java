
package funcionario;


public class Diretor extends Funcionario{

    public Diretor(String nome, double salario, String cargo) {
        super(nome, salario, cargo);
    }
    
    
    @Override
    public void Bonificar(){
        this.salario *= 1.10;
        System.out.println("O salario atualizado dos funcionarios de "+this.cargo+" é: "+this.salario);
    }
}
