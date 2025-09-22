package com.example.lab_week_04

import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.lab_week_04.R
import android.content.Context

val TABS_FIXED = listOf(
    R.string.starbucks_title,
    R.string.janjijiwa_title,
    R.string.kopikenangan_title,
)

class CafeAdapter (fragmentManager: FragmentManager, lifecycle: Lifecycle, private val context: Context) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
        return TABS_FIXED.size
    }

    override fun createFragment(position: Int): Fragment {
        val content = when (position) {
            0 -> R.string.starbucks_desc
            1 -> R.string.janjijiwa_desc
            2 -> R.string.kopikenangan_desc
            else -> 0
        }
        return CafeDetailFragment.newInstance(context.getString(content))
    }
}
