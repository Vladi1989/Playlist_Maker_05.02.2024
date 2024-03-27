package com.spase_y.playlistmaker05022024

import android.content.SharedPreferences
import android.util.Log
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class SearchHistory(val sharedPreferences: SharedPreferences) {
    val gson = Gson()
    fun addItem(track: Track){
//        1. получить сохраненную строку из shared preference
//        2. отформатировать полученную строку из SP в mutableList
//        3. Список есть. Добавить новый элемент, который приходит в функцию
//        4. Сохранить в SP отформатированный список в котором уже был добавлен новый элемент
        val listOfTracks = getAllItems()
        listOfTracks.add(track)
        sharedPreferences.edit().putString("Track list",gson.toJson(listOfTracks)).apply()

    }
    fun deleteItem(track: Track){
        val listOfTracks = getAllItems()
        listOfTracks.remove(track)
        sharedPreferences.edit().putString("Track list",gson.toJson(listOfTracks)).apply()
    }
    fun deleteAllItems(){
        sharedPreferences.edit().putString("Track list","[]").apply()
    }
    fun getAllItems():MutableList<Track>{
        val savedJsonString = sharedPreferences.getString("Track list","[]")
        val typeToken = object : TypeToken<MutableList<Track>>() {}.type
        val listOfTracks = gson.fromJson<MutableList<Track>>(savedJsonString, typeToken)
        return listOfTracks.reversed().toMutableList()
    }
}