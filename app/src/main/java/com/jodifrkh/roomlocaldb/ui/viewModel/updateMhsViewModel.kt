package com.jodifrkh.roomlocaldb.ui.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.jodifrkh.roomlocaldb.data.entity.Mahasiswa
import com.jodifrkh.roomlocaldb.repository.RepositoryMhs
import com.jodifrkh.roomlocaldb.ui.navigation.DestinasiUpdate


class updateMhsViewModel(
    savedStateHandle: SavedStateHandle,
    private val repositoryMhs: RepositoryMhs
) : ViewModel() {

    var updateUIState by mutableStateOf(mhsUIState())
        private set

    private val _nim: String = checkNotNull(savedStateHandle[DestinasiUpdate.NIM])

}

fun Mahasiswa.toUIStateMhs() : mhsUIState = mhsUIState (
    mahasiswaEvent = this.toDetailUiEvent(),
)