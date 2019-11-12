
package Controller;

import Model.EmissaoConta;
import Model.Pessoa;
import java.util.List;

public class EmissaoContaDAO extends DAO<EmissaoConta>{
    public List<EmissaoConta> getAll(){
        return super.getAll(
        "select a from EmissaoConta a order by a.dtAfericao");
    }
    
    public List<EmissaoConta> getAll(String filtro){
        return super.getAll(
        "select a from EmissaoConta a where a.nome like ?1 "
      + "order by a.nome","%"
      +filtro.toUpperCase()+"%");        
    }
}
