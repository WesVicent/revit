package com.study.wes.revit.views.components

import android.content.Context
import android.util.AttributeSet
import android.view.ContextThemeWrapper
import android.view.View
import android.widget.FrameLayout
import com.study.wes.revit.R
import com.study.wes.revit.views.RevitView
import kotlin.math.roundToInt


/** Created by Wes Vicent 05/10/2022*/
class DecreaseBar(context: Context, attributeSet: AttributeSet?, defStyleAttr: Int) : FrameLayout(context, attributeSet, defStyleAttr) {

    constructor(context: Context, attributeSet: AttributeSet?) : this(ContextThemeWrapper(context, DEFAULT_STYLE), attributeSet, DEFAULT_STYLE_ATTR) {
        val v = object : RevitView {
            override fun load(attrs: AttributeSet?, defStyleAttr: Int) {
                if (attrs != null) {
                    val atributos = getContext().theme.obtainStyledAttributes(
                        attrs,
                        R.styleable.DecreaseBar,
                        defStyleAttr,
                        DEFAULT_STYLE
                    )

                    atributos.recycle()
                }
            }
        }
        v.load(attributeSet, DEFAULT_STYLE_ATTR)

        val backGround = View(getContext())
        backGround.layoutParams = LayoutParams(LayoutParams.MATCH_PARENT, getContext().resources.getDimension(R.dimen.bar_size).roundToInt())
        backGround.setBackgroundColor(getContext().getColor(R.color.primary))

        val foreGround = View(getContext())
        foreGround.layoutParams = LayoutParams(99, getContext().resources.getDimension(R.dimen.bar_size).roundToInt())
        foreGround.setBackgroundColor(getContext().getColor(R.color.black))

        addView(backGround)
        addView(foreGround)

        /*val anim: Animation = TranslateAnimation(
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, +1.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f,
            Animation.RELATIVE_TO_PARENT, 0.0f
        )
        anim.duration = 2000
        anim.interpolator = AccelerateInterpolator()

        anim.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation) {}
            override fun onAnimationRepeat(animation: Animation) {}
            override fun onAnimationEnd(animation: Animation) {
                val params = mainFragBinding.barContainer.txvPercent.layoutParams as FrameLayout.LayoutParams
                params.topMargin += 0
                params.leftMargin = 200
                mainFragBinding.barContainer.txvPercent.layoutParams = params
            }
        })

        mainFragBinding.barContainer.txvPercent.startAnimation(anim)*/

    }

    // chain constructor
    constructor(context: Context) : this(ContextThemeWrapper(context, DEFAULT_STYLE), null){


    }

    companion object {
        const val DEFAULT_STYLE_ATTR = R.attr.defaultProgress
        const val DEFAULT_STYLE = R.style.DecreaseBar
    }

}