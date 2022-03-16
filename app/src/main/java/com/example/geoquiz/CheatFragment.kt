package com.example.geoquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import com.example.geoquiz.databinding.FragmentCheatBinding


class CheatFragment : Fragment() {
    lateinit var binding: FragmentCheatBinding
    val questionVm : QuestionVM by viewModels()
    val args: CheatFragmentArgs by navArgs()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCheatBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.showAnswerBtn.setOnClickListener{
            var qIndex = args.index
            questionVm.qList[qIndex].ischeated = true
            binding.textView.text = questionVm.qList[qIndex].answer.toString()
        }
    }
}