package com.study.wes.revit.views.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AccelerateInterpolator
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.study.wes.revit.R
import com.study.wes.revit.databinding.FragmentMainBinding
import com.study.wes.revit.views.components.DecreaseBar


lateinit var mainFragBinding : FragmentMainBinding

class MainFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    private fun inFromRightAnimation(): Animation? {
        val inFromRight: Animation = TranslateAnimation(
            Animation.RELATIVE_TO_PARENT, +1.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f
        )
        inFromRight.duration = 500
        inFromRight.interpolator = AccelerateInterpolator()
        return inFromRight
    }

    private fun outToLeftAnimation(): Animation? {
        val outtoLeft: Animation = TranslateAnimation(
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, -1.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f
        )
        outtoLeft.duration = 1000
        outtoLeft.interpolator = AccelerateInterpolator()
        return outtoLeft
    }

    private fun inFromLeftAnimation(): Animation? {
        val inFromLeft: Animation = TranslateAnimation(
            Animation.RELATIVE_TO_PARENT, -1.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f
        )
        inFromLeft.duration = 1000
        inFromLeft.interpolator = AccelerateInterpolator()
        return inFromLeft
    }

    private fun outToRightAnimation(): Animation? {
        val outtoRight: Animation = TranslateAnimation(
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, +1.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f
        )
        outtoRight.duration = 500
        outtoRight.interpolator = AccelerateInterpolator()
        return outtoRight
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        mainFragBinding = FragmentMainBinding.inflate(inflater, container, false)



        val v = DecreaseBar(requireContext())

        mainFragBinding.mainFragmentContainer.addView(v)

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