package com.example.ecg_project_android_app.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.ecg_project_android_app.databinding.FragmentMainBinding
import com.example.ecg_project_android_app.graph.Graph
import com.github.mikephil.charting.charts.LineChart

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding
    private lateinit var graph: Graph

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        init()

        graph.displayGraph(binding.graphImageView)
    }

    companion object {
        @JvmStatic
        fun newInstance() = MainFragment()
    }

    private fun init() = with(binding) {
        graph = Graph(lineChart)
    }

}