package com.example.subjectdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var subjectList = arrayListOf("COA", "DBMS", "PTNM", "OS", "OOD", "BE")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        decideBtn.setOnClickListener {
            val random = Random()
            val randomSubject = random.nextInt(subjectList.count())
            selectedSubjectTxt.text = subjectList[randomSubject]
        }

        addSubjectBtn.setOnClickListener {
            val newSubject = addSubjectTxt.text.toString()
            subjectList.add(newSubject)
            addSubjectTxt.text.clear()
        }
    }
}
