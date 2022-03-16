package com.example.geoquiz

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import com.example.geoquiz.databinding.FragmentQuestionBinding

class QuestionFragment : Fragment() {
    lateinit var binding: FragmentQuestionBinding
    val questionVm : QuestionVM by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentQuestionBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var index = questionVm.i
        binding.questionBox.text = questionVm.qList[index].question
//        initViews()
//        binding.prevButton.isEnabled = index != 0
//        binding.nextButton.isEnabled = index != 9
        binding.prevButton.setOnClickListener{
            if(index != 0){
                index--
            }
            binding.questionBox.text = questionVm.qList[index].question
            binding.prevButton.isEnabled = index != 0
            binding.nextButton.isEnabled =  true
            binding.cheatButton.isEnabled = true //فقط داخل ایف، کافی نیست؟
            if (questionVm.qList[index].isAnswerd||questionVm.qList[index].ischeated){
                binding.cheatButton.isEnabled = false
            }
            if (questionVm.qList[index].isAnswerd){
                binding.falseButton.isEnabled = false
                binding.truebuttton.isEnabled = false
            }else{
                binding.falseButton.isEnabled = true
                binding.truebuttton.isEnabled = true
            }

        }
        binding.nextButton.setOnClickListener{
            index++
            binding.questionBox.text = questionVm.qList[index].question
            binding.nextButton.isEnabled = index != 9
            binding.prevButton.isEnabled =  true
            binding.cheatButton.isEnabled = true //فقط داخل ایف، کافی نیست؟
            if (questionVm.qList[index].isAnswerd||questionVm.qList[index].ischeated){
                binding.cheatButton.isEnabled = false
            }
            if (questionVm.qList[index].isAnswerd){
                binding.falseButton.isEnabled = false
                binding.truebuttton.isEnabled = false
            }else{
                binding.falseButton.isEnabled = true
                binding.truebuttton.isEnabled = true
            }

        }
    }
}