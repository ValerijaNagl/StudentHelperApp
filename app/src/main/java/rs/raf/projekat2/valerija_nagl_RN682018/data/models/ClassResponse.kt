package rs.raf.projekat2.valerija_nagl_RN682018.data.models

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
class ClassResponse (
    val predmet : String,
    val tip : String,
    val nastavnik : String,
    val grupe : String,
    val dan : String,
    val termin : String,
    val ucionica : String
)