
package funcionario;

public class Contratado_Carteira extends Funcionario {

    public Contratado_Carteira(String nome, double salario) {
        super(nome, salario);
    }
    
    @Override
    public void calcularSalario(){
        System.out.println("Funcionario: "+this.nome);
        System.out.println("O salario antigo era "+this.salario);
        this.salario += this.salario *0.2;
        System.out.println("O salario atual é: "+this.salario);
        System.out.println("------------------------------------");
    } 
    
    
}
