
package com.example.timetableapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.timetableapp.R
import com.example.timetableapp.databinding.FragmentStartBinding

class StartFragment : Fragment() {

    private var binding: FragmentStartBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentStartBinding.inflate(inflater, container, false)
        binding = fragmentBinding
        return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.apply {
            startFragment = this@StartFragment
            yearFirst.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_subjectFragment)
            }
            yearSecond.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_subjectFragment)
            }
            yearThird.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_subjectFragment)
            }
            yearFourth.setOnClickListener {
                findNavController().navigate(R.id.action_startFragment_to_subjectFragment)
            }

        }




    }
    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}