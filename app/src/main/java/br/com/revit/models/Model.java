package br.com.revit.models;

import java.util.Map;

public class Model {

    private Map<String, String> campos;
    private String nomeTabela;

    public String getNomeTabela() {
        return nomeTabela;
    }

    public void setNomeTabela(String nomeTabela) {
        this.nomeTabela = nomeTabela;
    }

    public Map<String, String> getCampos() {
        return campos;
    }

    protected void setCampos(Map<String, String> campos) {
        this.campos = campos;
    }
}
