package com.example.contacts_assignment

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ContactAdapter(var contactList: List<Contact>) :
    RecyclerView.Adapter<ContactAdapter.ContactViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_contact, parent, false)
        return ContactViewHolder(view)
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var contact = contactList[position]
        holder.nameTextView.text = contact.name
        holder.phoneNumberTextView.text = contact.phoneNumber
        holder.emailTextView.text = contact.email
        holder.imageView.setImageResource(contact.image)

    }

    override fun getItemCount(): Int {
        return contactList.size
    }

    internal class ContactViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var nameTextView: TextView
        var phoneNumberTextView: TextView
        var emailTextView: TextView
        var imageView: ImageView

        init {
            nameTextView = itemView.findViewById(R.id.nameTextView)
            phoneNumberTextView = itemView.findViewById<TextView>(R.id.phoneNumberTextView)
            emailTextView = itemView.findViewById(R.id.emailTextView)
            imageView = itemView.findViewById<ImageView>(R.id.imageView)
        }
    }
}

