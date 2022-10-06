package com.study.wes.revit.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.study.wes.revit.R
import com.study.wes.revit.databinding.ActivityMainBinding
import com.study.wes.revit.models.Instrucao
import com.study.wes.revit.models.Interacao
import com.study.wes.revit.models.Passo
import com.study.wes.revit.models.Lembrete
import com.study.wes.revit.views.fragments.MainFragment

lateinit var mainBinding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        mainBinding.menuContainer.bringToFront()

        setContentView(view)

        supportFragmentManager.commit {
            add(R.id.container, MainFragment.newInstance())
        }

        val interacoes = List(1) { Interacao(0, 0, 0.0) }
        val passos = List(1) { Passo("", 0, "", interacoes, 0.0) }
        val alongamentos = List(1) { Instrucao("Alongamento Lateral", passos) }
        val alongarPescoco = Lembrete("", alongamentos, 0.0)
    }
}