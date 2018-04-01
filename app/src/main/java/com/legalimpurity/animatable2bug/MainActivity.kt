package com.legalimpurity.animatable2bug

import android.graphics.drawable.Animatable
import android.graphics.drawable.Animatable2
import android.graphics.drawable.Drawable
import android.os.Build
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        animateSplash()
    }

    private fun animateSplash()
    {
        try {
                val anim = (splash_image  as Animatable)
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    val anim2 = (splash_image as Animatable2)
                    anim2.registerAnimationCallback(object : Animatable2.AnimationCallback() {
                        override fun onAnimationEnd(drawable: Drawable?) {
                            super.onAnimationEnd(drawable)
                        }
                    }
                    )
                } else {
                }
                anim.start()
        }
        catch (e : Exception)
        {
        }
    }
}
