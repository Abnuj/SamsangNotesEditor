package com.abnuj.samsangnoteseditor.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.abnuj.samsangnoteseditor.R
import com.abnuj.samsangnoteseditor.databinding.FragmentAddNoteBinding

class AddNoteFragment : Fragment() {
    lateinit var binding: FragmentAddNoteBinding
    lateinit var navController: NavController
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root
        initializeItems()
        setUpBottomMenu()
    }

    private fun initializeItems() {
        navController = findNavController()
    }

    private fun setUpBottomMenu() {
        binding.menuIcon.setOnClickListener {
            navController.navigate(R.id.action_addNoteFragment_to_noteMenuBottomLayoutFragment)
        }

        binding.addBackgroundBtn.setOnClickListener {
//navController.navigate()
        }

    }
}