package com.example.myuccapp

data class Course (val code: String? = null, val courseTitle: String? = null) {
    // Null default values create a no-argument default constructor, which is needed
    // for deserialization from a DataSnapshot.
}