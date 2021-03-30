
package funcionario;

public class main {

       
    public static void main(String[] args) {
        Comissionado_Temporario f1 = new Comissionado_Temporario("João",2000);
        Comissionado_Temporario f2 = new Comissionado_Temporario("Teresa",3240);
        Comissionado_Temporario f3 = new Comissionado_Temporario("Gabryella",950);
       
        Contratado_Carteira f4 = new Contratado_Carteira("Pedro",2500);
        Contratado_Carteira f5 = new Contratado_Carteira("Carlos",1780);
        Contratado_Carteira f6 = new Contratado_Carteira("Tynagn",4200);
        
        f1.calcularSalario();
        f2.calcularSalario();
        f3.calcularSalario();
        f4.calcularSalario();
        f5.calcularSalario();
        f6.calcularSalario();
        
        
        
        
        
        
    }
    
}
