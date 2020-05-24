package com.example.blank.ui.blank

import co.zsmb.rainbowcake.base.RainbowCakeViewModel
import javax.inject.Inject

class BlankViewModel @Inject constructor(
    private val blankPresenter: BlankPresenter
) : RainbowCakeViewModel<BlankViewState>(Loading) {

    fun load() = execute {
        viewState = BlankReady(blankPresenter.getData())
    }

}
