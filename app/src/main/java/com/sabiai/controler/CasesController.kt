package com.sabiai.controler

import com.sabiai.CasesActivity
import com.sabiai.model.CasesTimeSery
import com.sabiai.model.CovidData
import retrofit2.Response
import java.io.IOException

class CasesController(var covidData : CovidData, var view : CasesActivity) {

     suspend fun<T:Any> apiRequest(call : suspend() -> Response<T>) : T{

        val response = call.invoke()
        if (response.isSuccessful){
            return response.body()!!
        }else{
            throw ApiException(response.code().toString())
        }
    }
    fun getCovidDate(): List<CasesTimeSery> {
        return covidData.cases_time_series
    }

}
class ApiException(message : String) : IOException(message)