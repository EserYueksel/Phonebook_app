package com.example.phonebook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.appName.adapter.EntryAdapter
import com.example.phonebook.data.Datasource
import com.example.phonebook.data.model.Entry
import com.example.phonebook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var entryList: MutableList<Entry>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val datasource = Datasource()
        val entryList = datasource.getEntryList()

        val entryAdapter = EntryAdapter(this, entryList)
        binding.entryRecycler.adapter = entryAdapter

         binding.addEntryButton.setOnClickListener {
            val name = binding.nameEdit.text.toString()
            val number = binding.numberEdit.text.toString()

            if (!name.isNullOrEmpty()) {
                val newEntry = Entry(name, number,R.drawable.ic_launcher_background)
                entryList.add(newEntry)
                entryAdapter.notifyItemInserted(entryList.lastIndex)
            }
        }
    }
}


