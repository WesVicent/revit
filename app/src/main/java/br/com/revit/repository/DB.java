package br.com.revit.repository;

import android.content.Context;
import android.content.SharedPreferences;

import java.util.Map;

import br.com.revit.R;
import br.com.revit.models.Model;
import br.com.revit.utils.Schemas;

public class DB {

    Context contexto;

    public DB(Context context) {
        this.contexto = context;
    }

    public void prepare() {

        for (Model tabela : Schemas.TABELAS) {
            SharedPreferences sharedPreferences = contexto.getSharedPreferences(tabela.getNomeTabela(), Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();

            Map<String, String> campos = tabela.getCampos();

            for(Map.Entry<String, String> entry: campos.entrySet()){
                editor.putString(entry.getKey(), entry.getValue());
            }

            editor.apply();
        }

    }

}
