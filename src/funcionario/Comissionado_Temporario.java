
package funcionario;

public class Comissionado_Temporario extends Funcionario {

    public Comissionado_Temporario(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public void calcularSalario(){
        System.out.println("Funcionario: "+this.nome);
        System.out.println("O salario antigo era "+this.salario);
        this.salario += this.salario *0.05;
        System.out.println("O salario atual é: "+this.salario);
        System.out.println("------------------------------------");
    } 
    
    
    
}
