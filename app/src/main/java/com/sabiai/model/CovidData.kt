package com.sabiai.model

data class CovidData(
    val cases_time_series: List<CasesTimeSery>,
    val statewise: List<Statewise>,
    val tested: List<Tested>
)