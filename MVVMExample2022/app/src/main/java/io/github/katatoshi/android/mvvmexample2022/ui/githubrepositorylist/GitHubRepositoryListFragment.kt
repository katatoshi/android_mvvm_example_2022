package io.github.katatoshi.android.mvvmexample2022.ui.githubrepositorylist

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import io.github.katatoshi.android.mvvmexample2022.R
import io.github.katatoshi.android.mvvmexample2022.databinding.FragmentGitHubRepositoryListBinding

class GitHubRepositoryListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentGitHubRepositoryListBinding>(
            inflater,
            R.layout.fragment_git_hub_repository_list,
            container,
            false
        )
        return binding.root
    }
}