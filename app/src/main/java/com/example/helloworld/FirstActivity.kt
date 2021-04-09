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

class FirstActivity : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first_activity, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val btnOne : Button = view.findViewById(R.id.button_one)

        btnOne.setOnClickListener{
            findNavController().navigate(R.id.action_firstActivity_to_secondActivity)
        }

        val btnTwo : Button = view.findViewById(R.id.button_two)

        btnTwo.setOnClickListener{
            findNavController().navigate(R.id.action_firstActivity_to_thirdActivity)
        }

        val btnThree : Button = view.findViewById(R.id.button_three)

        btnThree.setOnClickListener{
            findNavController().navigate(R.id.action_firstActivity_to_fourthActivity)
        }
    }
}