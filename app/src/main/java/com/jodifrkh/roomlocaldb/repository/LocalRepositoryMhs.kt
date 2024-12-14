package com.jodifrkh.roomlocaldb.repository

import com.jodifrkh.roomlocaldb.data.dao.MahasiswaDao
import com.jodifrkh.roomlocaldb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

class LocalRepositoryMhs (
    private  val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override  suspend fun  insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

    override suspend fun deleteMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.deleteMahasiswa(mahasiswa)
    }

    override fun getAllMhs(): Flow<List<Mahasiswa>> =
        mahasiswaDao.getAllMahasiswa()


    override fun getMhs(nim: String): Flow<Mahasiswa> =
        mahasiswaDao.getMahasiswa(nim)


    override suspend fun updateMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.updateMahasiswa(mahasiswa)
    }
}