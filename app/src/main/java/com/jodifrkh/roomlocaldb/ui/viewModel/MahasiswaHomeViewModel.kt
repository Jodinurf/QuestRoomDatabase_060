package com.jodifrkh.roomlocaldb.ui.viewModel


data class HomeUiState (
    val listMhs: List<Mahasiswa> = listOf(),
    val isLoading: Boolean = false,
    val isError: Boolean = false,
    val errorMessage: String = ""
)