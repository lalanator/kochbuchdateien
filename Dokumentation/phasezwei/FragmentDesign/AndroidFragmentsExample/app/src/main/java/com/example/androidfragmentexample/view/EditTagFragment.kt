package com.example.androidfragmentexample.view

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.androidfragmentexample.viewModel.EditTagViewModel
import com.example.androidfragmentexample.R


class EditTagFragment : Fragment() {

    companion object {
        fun newInstance() = EditTagFragment()
    }

    private lateinit var viewModel: EditTagViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.edit_tag_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(EditTagViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
