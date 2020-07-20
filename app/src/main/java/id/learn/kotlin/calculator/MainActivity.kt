package id.learn.kotlin.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPlus.setOnClickListener {
            val resultFirst: String = angkaPertama.text.toString()
            val resultSecond: String = angkaKedua.text.toString()

            if (resultFirst.isNullOrEmpty()) {
                angkaPertama.error = "Angka Pertama tidak boleh kosong"
            } else if (resultSecond.isNullOrEmpty()) {
                angkaKedua.error = "Angka Kedua tidak boleh kosong"
            } else {
                val hasilFirst = resultFirst.toInt()
                val hasilSecond = resultSecond.toInt()
                val resultFinal = hasilFirst + hasilSecond
                resultValue.text = "Hasil Akhir Ditambah : " + resultFinal
            }
        }

        buttonMinus.setOnClickListener {
            val resultFirst: String = angkaPertama.text.toString()
            val resultSecond: String = angkaKedua.text.toString()

            if (resultFirst.isNullOrEmpty()) {
                angkaPertama.error = "Angka Pertama tidak boleh kosong"
            } else if (resultSecond.isNullOrEmpty()) {
                angkaKedua.error = "Angka Kedua tidak boleh kosong"
            } else {
                val hasilFirst = resultFirst.toInt()
                val hasilSecond = resultSecond.toInt()
                val resultFinal = hasilFirst - hasilSecond
                resultValue.text = "Hasil Akhir Dikurang : " + resultFinal
            }
        }

        buttonKali.setOnClickListener {
            val resultFirst: String = angkaPertama.text.toString()
            val resultSecond: String = angkaKedua.text.toString()

            if (resultFirst.isNullOrEmpty()) {
                angkaPertama.error = "Angka Pertama tidak boleh kosong"
            } else if (resultSecond.isNullOrEmpty()) {
                angkaKedua.error = "Angka Kedua tidak boleh kosong"
            } else {
                val hasilFirst = resultFirst.toInt()
                val hasilSecond = resultSecond.toInt()
                val resultFinal = hasilFirst * hasilSecond
                resultValue.text = "Hasil Akhir Dikali : " + resultFinal
            }
        }

        buttonBagi.setOnClickListener {
            val resultFirst: String = angkaPertama.text.toString()
            val resultSecond: String = angkaKedua.text.toString()

            if (resultFirst.isNullOrEmpty()) {
                angkaPertama.error = "Angka Pertama tidak boleh kosong"
            } else if (resultSecond.isNullOrEmpty()) {
                angkaKedua.error = "Angka Kedua tidak boleh kosong"
            } else {
                val hasilFirst = resultFirst.toDouble()
                val hasilSecond = resultSecond.toDouble()
                val resultFinal = hasilFirst / hasilSecond
                resultValue.text = "Hasil Akhir Dibagi : " + resultFinal
            }
        }
    }
}
