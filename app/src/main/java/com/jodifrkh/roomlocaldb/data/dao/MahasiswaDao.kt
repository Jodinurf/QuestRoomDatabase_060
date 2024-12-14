package com.jodifrkh.roomlocaldb.data.dao

import androidx.room.*
import com.jodifrkh.roomlocaldb.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow
@Dao
interface MahasiswaDao {
    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    @Update
    suspend fun updateMahasiswa(mahasiswa: Mahasiswa)

    @Delete
    suspend fun deleteMahasiswa(mahasiswa: Mahasiswa)

    @Query("SELECT * FROM mahasiswa ORDER BY nama ASC")
    fun getAllMahasiswa(): Flow<List<Mahasiswa>>
}