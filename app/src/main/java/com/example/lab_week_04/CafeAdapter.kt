package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(private val hostFragment: Fragment) : FragmentStateAdapter(hostFragment) {

    private val cafeDescriptions = listOf(
        R.string.starbucks_desc,
        R.string.janjijiwa_desc,
        R.string.kopikenangan_desc
    )

    override fun getItemCount(): Int = cafeDescriptions.size

    override fun createFragment(position: Int): Fragment {
        val description = hostFragment.requireContext().getString(cafeDescriptions[position])
        return CafeDetailFragment.newInstance(description)
    }
}
