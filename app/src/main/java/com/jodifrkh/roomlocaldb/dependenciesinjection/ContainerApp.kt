package com.jodifrkh.roomlocaldb.dependenciesinjection

import android.content.Context
import com.jodifrkh.roomlocaldb.data.database.KrsDatabase
import com.jodifrkh.roomlocaldb.repository.LocalRepositoryMhs
import com.jodifrkh.roomlocaldb.repository.RepositoryMhs

interface  InterfaceContainerApp {
    val repositoryMhs: RepositoryMhs
}

class ContainerApp(private  val context: Context) : InterfaceContainerApp {
    override val repositoryMhs: RepositoryMhs by lazy {
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}