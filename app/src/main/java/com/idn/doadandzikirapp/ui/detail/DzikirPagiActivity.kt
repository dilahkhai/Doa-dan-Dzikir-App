package com.idn.doadandzikirapp.ui.detail

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.idn.doadandzikirapp.R
import com.idn.doadandzikirapp.adapter.DzikirDoaAdapter
import com.idn.doadandzikirapp.model.DataDzikirDoa
class DzikirPagiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        setContentView(R.layout.activity_dzikir_pagi)

        val rvDzikirPagi = findViewById<RecyclerView>(R.id.rv_dzikir_pagi)
        rvDzikirPagi.layoutManager = LinearLayoutManager(this)
        rvDzikirPagi.adapter = DzikirDoaAdapter(DataDzikirDoa.listDzikirPagi)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}