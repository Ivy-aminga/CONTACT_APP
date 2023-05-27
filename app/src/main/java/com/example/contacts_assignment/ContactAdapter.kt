package com.example.contacts_assignment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.contacts_assignment.databinding.ItemContactBinding


class ContactAdapter(var contactList: List<Contact>):
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        var binding = ItemContactBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ContactViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ContactAdapter.ContactViewHolder, position: Int) {
        var contact = contactList[position]
        holder.bind(contact)
    }
    override fun getItemCount(): Int {
        return com.example.contacts_assignment.contactList.size
    }
    class ContactViewHolder(private var binding: ItemContactBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(contact: Contact) {
            binding.tvname.text = contact.name
            binding.textView2.text = contact.phoneNumber
            binding.tvemail.text = contact.email
        }
    }
}