package com.example.easytable

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.easytable.databinding.FragmentHomePageBinding


class FragmentHomePage : Fragment() {

    var _binding: FragmentHomePageBinding?=null
    val binding get() = _binding

    val frgRestaurants = FragmentRestaurants()
    val frgBars = FragmentBars()
    val frgCafes = FragmentCafe()
    val frgHookahPlaces = FragmentHookah()
    val frgReservation = FragmentReservationDate()


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomePageBinding.inflate(inflater, container, false)
        return binding?.root
    }


    override fun onStart() {
        super.onStart()
        binding?.btnBars?.setOnClickListener {
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.change, frgReservation)
                ?.addToBackStack("bars")
                ?.commit()
        }

        binding?.btnRestaurants?.setOnClickListener {
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.change, frgRestaurants)
                ?.addToBackStack("bars")
                ?.commit()
        }

        binding?.btnCafes?.setOnClickListener {
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.change, frgCafes)
                ?.addToBackStack("bars")
                ?.commit()
        }

        binding?.btnHookah?.setOnClickListener {
            this.activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.change, frgHookahPlaces)
                ?.addToBackStack("bars")
                ?.commit()
        }
    }

}