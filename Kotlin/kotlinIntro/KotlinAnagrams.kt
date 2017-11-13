package javaintro.StringsProblem
import java.util.Scanner
import java.util.TreeMap
/**
 * Problem Link :https://www.hackerrank.com/challenges/java-anagrams/problem
 * <p>
 * Difficulty: Easy
 */
object KotlinAnagrams {
    fun isAnagram(a:String, b:String):Boolean {
        //Our Algorithm is case Insensitive
        var a = a.toLowerCase()
        var b = b.toLowerCase()

        var isAnagram = false
        if (a.length != b.length)
            isAnagram = false
        val mapA = BuildMap(a)
        val mapB = BuildMap(b)
        if (mapA == mapB)
            isAnagram = true
        return isAnagram
    }
    //O(n)
    fun BuildMap(a:String):Map<Char, Int> {
        val returnMap = TreeMap<Char, Int>()
        for (i in 0 until a.length)
        {
            val key = a.get(i)
            if (returnMap.containsKey(key))
            {
                val integer = returnMap.get(key)
                returnMap.put(key, (integer?.toInt()?.plus(1)!!))
            }
            else
                returnMap.put(key, 1)
        }
        return returnMap
    }
    @JvmStatic fun main(args:Array<String>) {
        val scan = Scanner(System.`in`)
        var a = scan.next()
        var b = scan.next()
        scan.close()
        val ret = isAnagram(a, b)
        println(if ((ret)) "Anagrams" else "Not Anagrams")
    }
}