package com.abnuj.samsangnoteseditor.Fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.abnuj.samsangnoteseditor.databinding.BackgroundMenuBottomLayoutBinding
import com.abnuj.samsangnoteseditor.databinding.FragmentAddNoteBinding
import com.abnuj.samsangnoteseditor.databinding.FragmentNoteMenuBottomLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class NoteBackgroundBottomLayoutFragment : BottomSheetDialogFragment() {
    lateinit var binding: BackgroundMenuBottomLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = BackgroundMenuBottomLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.root
    }
}