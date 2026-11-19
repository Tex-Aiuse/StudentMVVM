package com.ute.studentmvvm

import android.app.Application
import com.ute.studentmvvm.data.AppDatabase
import com.ute.studentmvvm.repository.StudentRepository

class StudentApp : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { StudentRepository(database.studentDao()) }
}