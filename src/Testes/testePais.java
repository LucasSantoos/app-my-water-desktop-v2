
package Testes;

import Controller.CidadeDAO;
import Controller.PaisDAO;
import Model.Cidade;
import Model.Estado;
import Model.Pais;

public class testePais {
    public static void main(String[] args) {
        CidadeDAO dao = new CidadeDAO();
        
        Cidade r3 = new Cidade(3, "persa", new Estado(1, "", new Pais(1,"")));
        
        dao.add(r3);
        
    }
    
}
