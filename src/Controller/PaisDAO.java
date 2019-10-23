
package Controller;

import Model.Pais;
import java.util.List;

public class PaisDAO extends DAO<Pais>{
    public List<Pais> getAll(){
        return super.getAll(
        "select p from Pais p order by p.nome");
    }
    public List<Pais> getAll(String filtro){
        return super.getAll(
        "select p from Pais p where p.nome like ?1 "
      + "order by p.nome",
                "%"+filtro.toUpperCase()+"%");        
    }
}
