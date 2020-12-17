package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_home.*

/**
 * A simple [Fragment] subclass.
 */
class HomeFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)

//        val btnPP:Button = view.findViewById(R.id.btn_PP)
//        btnPP.setOnClickListener(this)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_PP.setOnClickListener{
           val mIntent = Intent(activity,Pp::class.java)
           startActivity(mIntent)
        }
    }

//    override fun onClick(p0: View) {
//       when(p0.id){
//           R.id.btn_PP->{
//               val intentPP = Intent(activity,Pp::class.java)
//               startActivity(intentPP)
//           }
//       }
//
//    }


}
