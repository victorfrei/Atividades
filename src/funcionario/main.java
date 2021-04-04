
package funcionario;

public class main {

       
    public static void main(String[] args) {
        Diretor d = new Diretor("Diretor",1200,"Diretor");
        Gerente g = new Gerente("Gerente",1065,"Gerente");
        Engenheiro e = new Engenheiro("Engenheiro",2400,"Engenheiro");
        Secretario c = new Secretario("Secretorio",980,"Secretorio");
        
        d.Bonificar();
        g.Bonificar();
        e.Bonificar();
        c.Bonificar();
        
        
        
        
    }
    
}
