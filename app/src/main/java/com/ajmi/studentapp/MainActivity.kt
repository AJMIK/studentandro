package com.ajmi.studentapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun loginstud(view: View) {
        var getSname=findViewById<EditText>(R.id.stnm)
        var getRoll=findViewById<EditText>(R.id.rlno)
        var getAdm=findViewById<EditText>(R.id.admn)
        var getClg=findViewById<EditText>(R.id.clg)
        var getPname=findViewById<EditText>(R.id.pnm)
        var getPemail=findViewById<EditText>(R.id.pem)
        var getPhno=findViewById<EditText>(R.id.phn)
        var getUsername=findViewById<EditText>(R.id.uname)
        var getPassword=findViewById<EditText>(R.id.pass)
        var getConpass=findViewById<EditText>(R.id.cpass)
        Toast.makeText(this,getSname.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getRoll.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getAdm.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getClg.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getPname.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getPemail.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getPhno.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getUsername.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getPassword.text.toString(),Toast.LENGTH_SHORT).show()
        Toast.makeText(this,getConpass.text.toString(),Toast.LENGTH_SHORT).show()
    }
}