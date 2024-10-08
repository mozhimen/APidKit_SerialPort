package com.mozhimen.pidk.serialport.test

import android.view.View
import com.mozhimen.bindk.bases.viewdatabinding.activity.BaseActivityVDB
import com.mozhimen.kotlin.utilk.android.content.startContext
import com.mozhimen.pidk.serialport.test.databinding.ActivityMainBinding


/**
 * @ClassName MainActivity
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2022/12/18 18:22
 * @Version 1.0
 */
class MainActivity : BaseActivityVDB<ActivityMainBinding>() {

    fun goServiceReceive(view: View) {
        startContext<ServiceReceiveActivity>()
    }

    fun goSendReceive(view: View) {
        startContext<SendReceiveActivity>()
    }
}