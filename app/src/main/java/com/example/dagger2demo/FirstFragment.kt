package com.example.dagger2demo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import androidx.lifecycle.ViewModelProviders.of
import androidx.navigation.fragment.NavHostFragment
import com.example.dagger2demo.mvvm.MainViewModel
import kotlinx.android.synthetic.main.fragment_first.*
import javax.inject.Inject

class FirstFragment : Fragment() {

    var viewModel: MainViewModel? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.button_first).setOnClickListener {
            NavHostFragment.findNavController(this@FirstFragment)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment)
        }
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
       // showFirstTodo()
    }

    private fun showFirstTodo() {
        viewModel?.getFirstTodo()?.observe(viewLifecycleOwner, Observer {
            textview_first.text = it.title
        })
    }
}