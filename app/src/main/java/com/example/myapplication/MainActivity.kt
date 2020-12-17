package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mfragmentManager = supportFragmentManager
        val homeFragment = HomeFragment()
        val chatFragment = ChatFragment()
        val profileFragment = ProfileFragment()

        makesCurrentFragment(homeFragment)

        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.ic_home -> mfragmentManager.beginTransaction().replace(
                    R.id.fl_wrapper,
                    homeFragment,
                    HomeFragment::class.java.simpleName
                ).commit()
                R.id.ic_chat-> mfragmentManager.beginTransaction().replace(
                    R.id.fl_wrapper,
                    chatFragment,
                    ChatFragment::class.java.simpleName
                ).commit()
                R.id.ic_profile-> mfragmentManager.beginTransaction().replace(
                    R.id.fl_wrapper,
                    profileFragment,
                    profileFragment::class.java.simpleName
                ).commit()
            }
            true
        }
    }

    private fun makesCurrentFragment(fragment : Fragment){
     supportFragmentManager
         .beginTransaction()
         .add(R.id.fl_wrapper,fragment)
         .commit()
     }



}
