package ru.example.a2111

class calculation {
    fun factorial(int:Int):Int{
        if(int < 0){
            return 0
        }
        if(int==0) {
            return 1
        }
        return int*factorial(int-1)
    }
    fun fibbonachi(int:Int, f:Int=1, s:Int=1, count:Int = 3, summ:Int = 2):Int{
        if(int == 1) {
            return 1

        }
        else if(int ==2){
            return 2
        }
        val curr = f + s
        if( count <= int) {
            return  fibbonachi(int, s, curr, count + 1, summ + curr)
        }
       else{
           return summ
       }
    }
    fun sochetanie(n:Int, k:Int):Int{
        return factorial(n)/factorial(k)/factorial(n-k)
    }
}