package com.example.fragmentbackapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class Fragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button1 = view.findViewById<Button>(R.id.button1)

        button1.setOnClickListener {
            val fragment2 = Fragment2()
            val transaction = parentFragmentManager.beginTransaction()
            transaction.replace(R.id.flframe, fragment2)
            transaction.addToBackStack(null)
            transaction.commit()
        }
    }

}

