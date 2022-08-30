package KotlinDSA.leetcode

class TwoSum {

    companion object{
        fun twoSumMethod(nums: IntArray, target: Int):IntArray{
          val map = HashMap<Int,Int>()
            for(item in nums.indices){
                val compliment = target - nums[item]
                if(map.containsKey(compliment)){
                    return intArrayOf(map[compliment]!!, item)
                }else{
                    map[nums[item]] = item
                }

            }
            throw IllegalArgumentException("NOTHING FOUND")

            }


    }
}