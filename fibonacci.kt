object Fibonacci{
    fun getFinNumber(position: Int): Long {
        return if(position <= 1){
            1L
        }else{
            getFinNumber(position - 1) + getFinNumber(position - 2)
        }
    }

    fun getFinNumberOptimized(position: Int): Long{
        return if(position >= 2) {
            val finNums = mutableListOf<Long>()
            finNums.add(1)
            finNums.add(1)
            for(n in 2.. position){
                finNums.add(finNums[n-1] + finNums[n-2])
            }
            finNums[position - 1] + finNums[position - 2]
        }else if(position >= 0){
            1L
        }else{
            -1L
        }
    }
}