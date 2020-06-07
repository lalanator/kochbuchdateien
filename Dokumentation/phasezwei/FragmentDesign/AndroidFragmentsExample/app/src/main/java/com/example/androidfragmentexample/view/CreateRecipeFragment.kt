package com.example.androidfragmentexample.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidfragmentexample.viewModel.CreateRecipeViewModel
import com.example.androidfragmentexample.R


class CreateRecipeFragment : Fragment() {

    companion object {
        fun newInstance() = CreateRecipeFragment()
    }

    private lateinit var viewModel: CreateRecipeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.create_recipe_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(CreateRecipeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
