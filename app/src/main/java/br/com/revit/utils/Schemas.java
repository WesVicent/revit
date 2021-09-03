package br.com.revit.utils;

import br.com.revit.models.Model;
import br.com.revit.models.Regioes;

public class Schemas {

    public static final int INDEX_REGIOES = 0;
    public static final String[] NOME_TABELAS = {"regioes"};
    public static final Model[] TABELAS = {new Regioes() {{
        setNome("Diogo");
        setData_regeneracao("asdc");
        setTempo_degeneracao("Diosdgo");
    }}, new Regioes() {{
        setNome("Wesley");
        setData_regeneracao("Wesley");
        setTempo_degeneracao("Wesley");
    }}};


}
