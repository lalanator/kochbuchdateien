package com.example.androidfragmentexample.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidfragmentexample.viewModel.MyFavouritesViewModel
import com.example.androidfragmentexample.R


class MyFavouritesFragment : Fragment() {

    companion object {
        fun newInstance() = MyFavouritesFragment()
    }

    private lateinit var viewModel: MyFavouritesViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.my_favourites_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MyFavouritesViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
