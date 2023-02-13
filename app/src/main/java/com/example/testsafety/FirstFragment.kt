package com.example.testsafety

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.testsafety.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!

//    val viewModel = PersonViewModel()

//    private val viewModel by lazy{
//        ViewModelProvider(this).get(PersonViewModel::class.java)
//    }
    private val viewModel by viewModels<PersonViewModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        viewModel.personLiveData.observe(viewLifecycleOwner){
//            println("${it.name} &&&")
//        }
        binding.sendButton.setOnClickListener {
            val name = binding.enterName.text.toString()
            val age = binding.enterAge.text.toString()
            val person = Person(name, age.toInt())

            val action = FirstFragmentDirections.actionFirstFragmentToSecondFragment(person)
            findNavController().navigate(action)
//        }
        }
    }
}