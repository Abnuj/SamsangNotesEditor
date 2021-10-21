package com.abnuj.samsangnoteseditor.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.abnuj.samsangnoteseditor.R
import com.abnuj.samsangnoteseditor.databinding.FragmentHomeBinding

class homeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.addNotesFab.setOnClickListener {
            val navController = findNavController()
            navController.navigate(R.id.addNoteFragment)
        }
    }
}