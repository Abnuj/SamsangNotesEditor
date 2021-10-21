package com.abnuj.samsangnoteseditor.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abnuj.samsangnoteseditor.databinding.FragmentAddNoteBinding
import com.abnuj.samsangnoteseditor.databinding.FragmentNoteMenuBottomLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NoteMenuBottomLayoutFragment : BottomSheetDialogFragment() {
    lateinit var binding: FragmentNoteMenuBottomLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentNoteMenuBottomLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root
    }
}