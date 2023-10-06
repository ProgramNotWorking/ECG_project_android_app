package com.example.ecg_project_android_app.graph

import android.graphics.Bitmap
import android.graphics.Canvas
import android.widget.ImageView
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.data.Entry
import com.github.mikephil.charting.data.LineData
import com.github.mikephil.charting.data.LineDataSet

class Graph(graphLineChart: LineChart) {

    private var lineChart: LineChart = graphLineChart

    private val entries = listOf(
        Entry(0f, 2f),
        Entry(1f, 4f),
        Entry(2f, 6f),
        Entry(3f, 8f),
        Entry(4f, 10f)
    )

    private val dataSet = LineDataSet(entries, "Graph")
    private val lineData = LineData(dataSet)

    private fun createChartImage(): Bitmap {
        lineChartSetting()

        val bitmap = Bitmap.createBitmap(
            100, 100, Bitmap.Config.ARGB_8888
        )
        val canvas = Canvas(bitmap)
        lineChart.draw(canvas)

        return bitmap
    }

    private fun lineChartSetting() {
        lineChart.data = lineData
        lineChart.xAxis.labelCount = entries.size
        lineChart.xAxis.setDrawGridLines(false)
        lineChart.axisLeft.setDrawGridLines(false)
        lineChart.axisRight.setDrawGridLines(false)
        lineChart.description.isEnabled = false
        lineChart.legend.isEnabled = false
    }

    fun displayGraph(imageView: ImageView) {
        val image = createChartImage()
        imageView.setImageBitmap(image)
    }

}