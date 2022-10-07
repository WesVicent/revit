package com.study.wes.revit.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.study.wes.revit.R
import com.study.wes.revit.databinding.FragmentMainBinding

lateinit var mainFragBinding : FragmentMainBinding

class MainFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        mainFragBinding = FragmentMainBinding.inflate(inflater, container, false)

        mainFragBinding.btnEsquerda.setOnClickListener {
            parentFragmentManager.commit {
                setCustomAnimations(
                    R.anim.slide_in_from_esq,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out_to_esq
                )
                replace(R.id.menu_container, MenuEsquerdaContentFragment.newInstance())
                setReorderingAllowed(true)
                addToBackStack(null)
            }
        }

        mainFragBinding.btnDireita.setOnClickListener {
            parentFragmentManager.commit {
                setCustomAnimations(
                    R.anim.slide_in_from_dir,
                    R.anim.fade_out,
                    R.anim.fade_in,
                    R.anim.slide_out_to_dir
                )
                replace(R.id.menu_container, MenuDireitaContentFragment.newInstance())
                setReorderingAllowed(true)
                addToBackStack(null)
            }
        }

        return mainFragBinding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment MainFragment.
         */

        @JvmStatic
        fun newInstance() =
            MainFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}