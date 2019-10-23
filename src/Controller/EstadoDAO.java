
package Controller;

import Model.Estado;
import java.util.List;

public class EstadoDAO extends DAO<Estado>{
    public List<Estado> getAll(){
        return super.getAll("select e from Estado e order by e.nome");
    }
    public List<Estado> getAll(String filtro){
        return super.getAll(
                "select e from Estado e where e.nome like ?1 order by e.nome",
                "%"+filtro.toUpperCase()+"%");
    }
}
