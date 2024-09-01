package com.example.bv.DAOs

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.example.bv.Entities.Perro

@Dao
interface PerroDAO {

    @Insert
    fun insertUser(perro : Perro )

    @Update
    fun updateUser (perro : Perro)

    @Delete
    fun deleteUser(perro : Perro)

    @Query(" SELECT * FROM Perro")
    fun selecteAllUsers() : List<Perro>

    @Query(" SELECT * From Perro WHERE id= :id")
    fun selectUser(id: Int) : Perro
}