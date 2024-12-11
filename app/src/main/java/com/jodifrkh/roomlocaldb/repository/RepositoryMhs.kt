package com.jodifrkh.roomlocaldb.repository

import com.jodifrkh.roomlocaldb.data.entity.Mahasiswa

interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}