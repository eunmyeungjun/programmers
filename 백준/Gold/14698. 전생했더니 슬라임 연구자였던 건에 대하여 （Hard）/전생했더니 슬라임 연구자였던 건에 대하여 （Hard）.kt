import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val T = readLine().toInt()
    val mod = 1_000_000_007

    repeat(T){
        val N = readLine().toInt()
        val slime = readLine().split(" ").map { it.toLong() }
        val slimeQ = PriorityQueue<Long>()
        slimeQ.addAll(slime)
        var slimeEnergy = 1L

        while (true){
            if (slimeQ.size == 1){
                break
            }
            val smallSlime = slimeQ.poll()
            val smallSlime2 = slimeQ.poll()
            val newSlime = smallSlime * smallSlime2
            slimeQ.add(newSlime)
            slimeEnergy *= (smallSlime % mod * smallSlime2 % mod) % mod
            slimeEnergy %= mod
        }
        bw.write("${slimeEnergy}\n")
    }
    bw.close()
}