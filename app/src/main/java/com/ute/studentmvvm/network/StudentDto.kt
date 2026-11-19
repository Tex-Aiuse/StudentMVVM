package com.ute.studentmvvm.network

import com.google.gson.annotations.SerializedName
import com.ute.studentmvvm.model.Student

data class StudentDto(
    @SerializedName("fullName") val fullName: String?,
    @SerializedName("studentCode") val studentCode: String?,
    @SerializedName("email") val email: String?,
    @SerializedName("gpa") val gpa: Double?,
    @SerializedName("major") val major: String?
)

fun StudentDto.toEntity() = Student(
    fullName = fullName ?: "",
    studentCode = studentCode ?: "",
    email = email ?: "",
    gpa = gpa ?: 0.0,
    major = major ?: "Công Nghệ Thông Tin"
)