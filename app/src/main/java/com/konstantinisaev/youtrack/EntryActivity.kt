package com.konstantinisaev.youtrack

import android.os.Bundle
import com.konstantinisaev.youtrack.ui.base.screens.BaseActivity
import com.konstantinisaev.youtrack.ui.base.utils.AuthRouter
import ru.terrakok.cicerone.Cicerone
import ru.terrakok.cicerone.Router
import ru.terrakok.cicerone.android.support.SupportAppNavigator
import javax.inject.Inject

class EntryActivity : BaseActivity() {

    @Inject
    lateinit var cicerone: Cicerone<Router>

    @Inject
    lateinit var authRouter: AuthRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entry)
        App.appComponent.injectEntryActivity(this)
        cicerone.navigatorHolder.setNavigator(SupportAppNavigator(this,R.id.flContainer))
        authRouter.showSplash()
    }
}