/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PessoaEndereco;
import java.util.List;

/**
 *
 * @author Christian
 */
public class PessoaEnderecoDAO extends DAO<PessoaEndereco> {
        public List<PessoaEndereco> getAll(){
        return super.getAll(
        "select p from PessoaEndereco p order by p.nome");
    }
    public List<PessoaEndereco> getAll(String filtro){
        return super.getAll(
        "select p from PessoaEndereco p where p.nome like ?1 "
      + "order by p.nome",
                "%"+filtro.toUpperCase()+"%");        
    }
}
