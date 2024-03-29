
package Controller;

import Model.Pessoa;
import java.util.List;

public class PessoaDAO extends DAO<Pessoa>{
    public List<Pessoa> getAll(){
        return super.getAll(
        "select a from Pessoa a order by a.nome");
    }
    public List<Pessoa> getAll(String filtro){
        return super.getAll(
        "select a from Pessoa a where a.nome like ?1 "
      + "order by a.nome","%"
      +filtro.toUpperCase()+"%");        
    }
    
    public List<Pessoa> getAllFuncionarios(){
        return super.getAll(
        "select a from Pessoa a where a.tipoPessoa like 'FUNCIONARIO' order by a.nome");
    }
    
    public List<Pessoa> getAllClientes(){
        return super.getAll(
        "select a from Pessoa a where a.tipoPessoa like 'CLIENTE' order by a.nome");
    }
}
