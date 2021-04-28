package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemFollowUserBinding

class FollowingListAdapter() : RecyclerView.Adapter<FollowingListAdapter.FollowingUserViewHolder>(){

    val userList = mutableListOf<FollowingUserInfo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FollowingListAdapter.FollowingUserViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: FollowingListAdapter.FollowingUserViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class FollowingUserViewHolder(
        private val binding:ItemFollowUserBinding
    ) : RecyclerView.ViewHolder(binding.root)
}

