package com.example.blank.di

import co.zsmb.rainbowcake.di.RainbowCakeComponent
import co.zsmb.rainbowcake.di.RainbowCakeModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(
    modules = [
        RainbowCakeModule::class,
        ApplicationModule::class,
        ViewModelModule::class
    ]
)
interface AppComponent : RainbowCakeComponent
