package com.example.myapplication

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.icu.util.Calendar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val radGrp_Gender = findViewById<RadioGroup>(R.id.radGrpGender)
        val radBtn_Male = findViewById<RadioButton>(R.id.radBtn_Male)
        val radBtn_Female = findViewById<RadioButton>(R.id.radBtn_Female)
        var gender=" "

        val applyDate = findViewById<EditText>(R.id.applydate)
        applyDate.setOnClickListener{
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val day = calendar.get(Calendar.DAY_OF_MONTH)
            DatePickerDialog(this, { _, year, month, day ->
                run {
                    var format = "${setDateFormat(year, month, day)}"
                    applyDate.setText(format)
                }
            }, year, month, day).show()
        }
        /*val numPicker = findViewById<NumberPicker>(R.id.numPicker_Age)
        numPicker.setMinValue(1)
        numPicker.setMaxValue(12)
        numPicker.setValue(1)*/

        val chkbox1 = findViewById<CheckBox>(R.id.ckb1)
        val chkbox2 = findViewById<CheckBox>(R.id.ckb2)
        val chkbox3 = findViewById<CheckBox>(R.id.ckb3)
        val btn_send = findViewById<Button>(R.id.btn_send)
        btn_send.setOnClickListener {
            var msg=""
            val account=findViewById<EditText>(R.id.editTextTextPersonName2)
            val password =findViewById<EditText>(R.id.editTextTextPassword)
            val email =findViewById<EditText>(R.id.editTextTextEmailAddress)
            val phone =findViewById<EditText>(R.id.editTextTextPersonName)
            val birth=findViewById<EditText>(R.id.applydate)
            if (chkbox1.isChecked()) {
                msg = msg + chkbox1.getText().toString()
            }
            if (chkbox2.isChecked()) {
                msg = msg + " " + chkbox2.getText().toString()
            }
            if (chkbox3.isChecked()) {
                msg = msg + " " + chkbox3.getText().toString()
            }

            Toast.makeText(this@MainActivity, "帳號:"+account.text+"密碼:"+password.text+"email:"+email.text+"電話:"+phone.text+"生日:"+birth.text+"性別:"+gender+"興趣:"+msg,
                Toast.LENGTH_LONG).show()

        }

        radGrp_Gender.setOnCheckedChangeListener{_,checkedID ->
            gender= radGrp_Gender.findViewById<RadioButton>(checkedID).text.toString()
            Toast.makeText(this,gender,Toast.LENGTH_LONG).show()
        }

        }


    }
    private fun setDateFormat(year: Int, month: Int, day: Int): String {
        return "$year-${month + 1}-$day"
    }
