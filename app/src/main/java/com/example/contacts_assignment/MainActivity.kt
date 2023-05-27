package com.example.contacts_assignment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts_assignment.databinding.ActivityMainBinding
import kotlinx.coroutines.flow.internal.NoOpContinuation.context
import kotlin.coroutines.jvm.internal.CompletedContinuation.context


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var contactList: List<Contact>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(LayoutInflater())
        setContentView(binding.root)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        contactList = createContactList()
        var adapter = ContactAdapter(contactList)
        binding.recyclerView.adapter = adapter
    }

    private fun LayoutInflater(): LayoutInflater {g
        return LayoutInflater.from(context)
    }

    private fun createContactList(): List<Contact> {
        var contacts = mutableListOf<Contact>()

        contacts.add(Contact("Ivy Aminga","071234567","amingaivy@gmail.com"))
        contacts.add(Contact("Marrion Mideva","071345678","midevamarrion@gmail.com"))

        return contacts
    }
}