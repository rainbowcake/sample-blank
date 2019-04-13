package com.example.blank.ui.blank

import co.zsmb.rainbowcake.base.JobViewModel
import javax.inject.Inject

class BlankViewModel @Inject constructor(
    private val blankPresenter: BlankPresenter
) : JobViewModel<BlankViewState>(Loading) {

    fun load() = execute {
        viewState = BlankReady(blankPresenter.getData())
    }

}
