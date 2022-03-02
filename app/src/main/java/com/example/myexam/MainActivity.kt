package com.example.myexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        setSupportActionBar(toolbar)
    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.about -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, Fragment1() )
                    .commit()
            }
            R.id.classes -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, Fragment2() )
                    .commit()
            }
            R.id.students -> {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainer, Fragment3() )
                    .commit()
            }
            else -> {}
        }
        return super.onOptionsItemSelected(item)
    }
}
//exam