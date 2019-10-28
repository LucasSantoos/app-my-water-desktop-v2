/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.PessoaTelefone;
import java.util.List;

/**
 *
 * @author Christian
 */
public class PessoaTelefoneDAO extends DAO<PessoaTelefone> {
        public List<PessoaTelefone> getAll(){
        return super.getAll(
        "select p from PessoaTelefone p order by p.nome");
    }
    public List<PessoaTelefone> getAll(String filtro){
        return super.getAll(
        "select p from PessoaTelefone p where p.nome like ?1 "
      + "order by p.nome",
                "%"+filtro.toUpperCase()+"%");        
    }
}
