/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enums;

public enum TipoPessoa {
    FUNCIONARIO("Funcionário"),
    CLIENTE("Cliente");

    private String descricao;    
    private TipoPessoa(String descricao) {
        this.descricao = descricao;
    }
    
    public String toString(){
        return descricao;
    }
}
