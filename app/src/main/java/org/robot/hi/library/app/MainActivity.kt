package org.robot.hi.library.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import org.robot.hi.library.R
import org.robot.hi.library.app.demo.HiLogDemoActivity

/**
 * @author mr.liuzhen@outlook.com (liu zhen)
 **/
class MainActivity :Activity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onClick(v: View?) {
        when(v!!.id) {
            R.id.tv_hilog -> {
                startActivity(Intent(this, HiLogDemoActivity::class.java))
            }
        }
    }
}