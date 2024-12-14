package com.jodifrkh.roomlocaldb.ui.viewModel

import com.jodifrkh.roomlocaldb.data.entity.Mahasiswa


fun Mahasiswa.toUIStateMhs() : mhsUIState = mhsUIState (
    mahasiswaEvent = this.toDetailUiEvent(),
)