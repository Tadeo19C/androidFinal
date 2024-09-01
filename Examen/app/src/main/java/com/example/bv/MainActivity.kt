package com.example.bv

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.bv.AppDatabases.AppDatabase
import com.example.bv.Entities.Perro
import com.example.bv.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)



        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val db = AppDatabase.getDatabase(this)





        binding.xd.setOnClickListener {

            lifecycleScope.launch(Dispatchers.IO) {



                var perro = Perro(null, binding.nombre.text.toString(), binding.raza.text.toString(), binding.edad.text.toString(), binding.sexo.text.toString())
                db.PerroDAO().insertUser(perro)   //para agregar

//                Snackbar.make(binding.root, binding.nombre.text.toString(), 1000).show()
            }
        }


    }
}