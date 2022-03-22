package com.study.wes.revit.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.study.wes.revit.databinding.FragmentMenuDireitaContentBinding

/** Created by Wes Vicent 17/01/2022*/

private lateinit var menuDirBinding : FragmentMenuDireitaContentBinding

class MenuDireitaContentFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        menuDirBinding = FragmentMenuDireitaContentBinding.inflate(inflater, container, false)

        mainFragBinding.btnEsquerda.isEnabled = false

        menuDirBinding.btnContract.setOnClickListener {
            mainFragBinding.btnEsquerda.isEnabled = true

            parentFragmentManager.popBackStack()
        }

        return menuDirBinding.root
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
            MenuDireitaContentFragment().apply {
                arguments = Bundle().apply {}
            }
    }
}