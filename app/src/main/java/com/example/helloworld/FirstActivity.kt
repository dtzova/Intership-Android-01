package com.example.helloworld

import android.content.Context
import android.os.Bundle
import android.util.AttributeSet
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.helloworld.databinding.FragmentFirstActivityBinding

class FirstActivity : Fragment() {

    private var _binding: FragmentFirstActivityBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstActivityBinding.inflate(inflater, container, false)
        val view = binding.root
        return view
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.buttonOne.setOnClickListener {
            findNavController().navigate(R.id.action_firstActivity_to_secondActivity)
        }

      binding.buttonTwo.setOnClickListener{
          findNavController().navigate(R.id.action_firstActivity_to_thirdActivity)
      }

        binding.buttonThree.setOnClickListener {
            findNavController().navigate(R.id.action_firstActivity_to_fourthActivity)
        }
    }
}