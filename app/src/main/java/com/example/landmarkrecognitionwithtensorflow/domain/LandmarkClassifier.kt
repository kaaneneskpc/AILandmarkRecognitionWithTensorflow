package com.example.landmarkrecognitionwithtensorflow.domain

import android.graphics.Bitmap
import com.example.landmarkrecognitionwithtensorflow.domain.Classification

interface LandmarkClassifier {
    fun classify(bitmap: Bitmap, rotation: Int): List<Classification>
}