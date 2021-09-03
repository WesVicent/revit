package br.com.revit.models;

import java.util.HashMap;
import java.util.Map;

import br.com.revit.utils.Schemas;

public class Regioes extends Model {

    private String nome;
    private String data_regeneracao;
    private String tempo_degeneracao;

    public Regioes() {
        this.setNomeTabela(Schemas.NOME_TABELAS[Schemas.INDEX_REGIOES]);
        setCampos(camposVazios());
    }

    private Map<String, String> camposVazios() {
        Map<String, String> campos = new HashMap<>();

        campos.put("nome", this.nome);
        campos.put("data_regeneracao", this.data_regeneracao);
        campos.put("tempo_degeneracao", this.tempo_degeneracao);
        return campos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        getCampos().put("nome", nome);
        this.nome = nome;
    }

    public String getData_regeneracao() {
        return data_regeneracao;
    }

    public void setData_regeneracao(String data_regeneracao) {
        getCampos().put("data_regeneracao", this.data_regeneracao);
        this.data_regeneracao = data_regeneracao;
    }

    public String getTempo_degeneracao() {
        return tempo_degeneracao;
    }

    public void setTempo_degeneracao(String tempo_degeneracao) {
        getCampos().put("tempo_degeneracao", this.tempo_degeneracao);
        this.tempo_degeneracao = tempo_degeneracao;
    }
}
