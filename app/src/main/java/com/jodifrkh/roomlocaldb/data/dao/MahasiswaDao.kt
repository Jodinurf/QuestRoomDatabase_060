package com.jodifrkh.roomlocaldb.data.dao

import androidx.room.*
import com.jodifrkh.roomlocaldb.data.entity.Mahasiswa
@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)

}