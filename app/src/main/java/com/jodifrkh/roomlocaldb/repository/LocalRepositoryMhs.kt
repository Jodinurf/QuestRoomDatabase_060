package com.jodifrkh.roomlocaldb.repository

import com.jodifrkh.roomlocaldb.data.dao.MahasiswaDao
import com.jodifrkh.roomlocaldb.data.entity.Mahasiswa

class LocalRepositoryMhs (
    private  val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override  suspend fun  insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }
}