package com.study.wes.revit.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.study.wes.revit.databinding.FragmentMenuEsquerdaContentBinding

private lateinit var menuEsqBinding : FragmentMenuEsquerdaContentBinding

class MenuEsquerdaContentFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        menuEsqBinding = FragmentMenuEsquerdaContentBinding.inflate(inflater, container, false)

        mainFragBinding.btnDireita.isEnabled = false

        menuEsqBinding.btnContract.setOnClickListener {
            mainFragBinding.btnDireita.isEnabled = true

            parentFragmentManager.popBackStack()
        }

        return menuEsqBinding.root
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @return A new instance of fragment TestFragment.
         */
        @JvmStatic
        fun newInstance() =
            MenuEsquerdaContentFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}