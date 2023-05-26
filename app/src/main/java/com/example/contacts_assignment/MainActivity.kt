package com.example.contacts_assignment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    var contactAdapter: ContactAdapter? = null
    var contactList: MutableList<Contact>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setLayoutManager(LinearLayoutManager(this))
        contactList = ArrayList()
        contactAdapter = ContactAdapter(contactList as ArrayList<Contact>)
        recyclerView.setAdapter(contactAdapter)


        (contactList as ArrayList<Contact>).add(
            Contact(
                "Ivy Aming'a",
                "071234567",
                "amingaivy@gmail.com",
                R.drawable.placeholder
            )
        )
        contactAdapter!!.notifyDataSetChanged()
    }
}
