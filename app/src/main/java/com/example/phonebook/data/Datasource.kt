package com.example.phonebook.data

import com.example.phonebook.R
import com.example.phonebook.data.model.Entry

class Datasource {

    fun getEntryList(): MutableList<Entry> {
        return mutableListOf(
            Entry("Fritz", "+491582382384", R.drawable.entry_acc_image),
            Entry("Onkel Roger","+42258923498",R.drawable.entry_acc_image),
            Entry("Kim Jong","+248023482",R.drawable.entry_acc_image),
            Entry("Kim Chi","+252342873",R.drawable.entry_acc_image),
            Entry("Popeye","+232498829",R.drawable.entry_acc_image),
            Entry("Willhelm","+603459822",R.drawable.entry_acc_image)
        )
    }
}