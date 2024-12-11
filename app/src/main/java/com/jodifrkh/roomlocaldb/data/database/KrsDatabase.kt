package com.jodifrkh.roomlocaldb.data.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.jodifrkh.roomlocaldb.data.dao.MahasiswaDao
import com.jodifrkh.roomlocaldb.data.entity.Mahasiswa

@Database(entities = [Mahasiswa::class], version = 1, exportSchema = false)
abstract  class  KrsDatabase : RoomDatabase(){

    // Mendefinisikan fungsi untuk mengakses data mahasiswa
    abstract fun mahasiswaDao(): MahasiswaDao

    companion object {
        @Volatile // Memastikan bahwa nilai variabel instance selalu sama di semua thread
        private  var Instance:  KrsDatabase? = null

        fun getDatabase(context: Context): KrsDatabase {
            return (Instance ?: synchronized(this){
                Room.databaseBuilder(
                    context,
                    KrsDatabase::class.java, // class database
                    name = "KrsDatabase" // Nama Database
                )
                    .build().also { Instance = it }
            })
        }
    }
}