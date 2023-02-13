package com.example.testsafety

import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.testsafety.databinding.FragmentFirstBinding
import com.example.testsafety.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!
//    val secondfragmentViewModel by viewModels<SecondfragmentViewModel>()
//    val secondfragmentViewModel by viewModels<SecondfragmentViewModel>(){
//        MyViemodelFactory(Repository())
//}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val person = SecondFragmentArgs.fromBundle(requireArguments()).person
        binding.showNameObject.text = person.toString()
        binding.showName.text = person.name
        binding.showAge.text = person.age.toString()
    }
}