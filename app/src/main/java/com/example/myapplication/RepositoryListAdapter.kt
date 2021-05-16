package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ItemFollowRepositoryBinding

class RepositoryListAdapter() : RecyclerView.Adapter<RepositoryListAdapter.RepositoryViewHolder>(){

    val repositoryList = mutableListOf<RepositoryInfo>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RepositoryListAdapter.RepositoryViewHolder {
        val binding = ItemFollowRepositoryBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return RepositoryViewHolder(binding)
    }

    override fun getItemCount(): Int = repositoryList.size

    override fun onBindViewHolder(holder: RepositoryListAdapter.RepositoryViewHolder, position: Int) {
        holder.onBind(repositoryList[position])
    }


    class RepositoryViewHolder(
        private val binding:ItemFollowRepositoryBinding
    ) : RecyclerView.ViewHolder(binding.root){
        fun onBind(RepositoryInfo: RepositoryInfo){
            binding.repositoryName.setText(RepositoryInfo.repositoryName)
            binding.repositoryContent.text=RepositoryInfo.repositoryContent
            binding.laguage.text=RepositoryInfo.language
        }
    }
}

