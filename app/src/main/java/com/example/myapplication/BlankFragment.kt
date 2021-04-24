package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentBlankBinding

class BlankFragment : Fragment() {

    private lateinit var binding : FragmentBlankBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ):View? {
        // Inflate the layout for this fragment
        binding = FragmentBlankBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val followingListAdapter = RepositoryListAdapter()
        binding.repositoryList.adapter=followingListAdapter

        followingListAdapter.repositoryList.addAll(
            listOf<RepositoryInfo>(
                RepositoryInfo(
                    repositoryName = "웹프로그래밍",
                    repositoryContent = "웹을 만들어보자",
                    language = "HTML"
                ),
                RepositoryInfo(
                    repositoryName = "앱프로그래밍",
                    repositoryContent = "앱을 만들어보자",
                    language = "Kotlin"
                ),
                RepositoryInfo(
                    repositoryName = "서버프로그래밍",
                    repositoryContent = "서버 만들어보자",
                    language = "SQL"
                )

            )
        )
        followingListAdapter.notifyDataSetChanged()
    }

}