package com.example.a39

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        class Solution {
            fun solution(n: Int, m: Int): IntArray {
                var answer = intArrayOf(0,0)
                //최대 공약수와 최소 공배수를 구한다
                //1.최대 공약수
                var length : Int
                var gcf :Int = 1
                if (m>n) length = n
                else length = m
                for(i in 2..length){
                    if(n%i==0 && m%i==0){
                        gcf = i
                    }
                }
                //2.최소 공배수
                var gcd :Int
                gcd = gcf*(m/gcf)*(n/gcf)
                answer[0]=gcf
                answer[1]=gcd
                return answer
            }
        }
        val a = Solution()
        a.solution(3,12)
        a.solution(2,5)
    }
}