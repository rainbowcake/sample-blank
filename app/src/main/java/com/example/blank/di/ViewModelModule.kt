package com.example.blank.di

import android.arch.lifecycle.ViewModel
import co.zsmb.rainbowcake.dagger.ViewModelKey
import com.example.blank.ui.blank.BlankViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @ViewModelKey(BlankViewModel::class)
    abstract fun bindBlankViewModel(blankViewModel: BlankViewModel): ViewModel

}
