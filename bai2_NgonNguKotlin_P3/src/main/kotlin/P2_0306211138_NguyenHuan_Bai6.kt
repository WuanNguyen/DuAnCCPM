fun main() {
    print("Nhập một số nguyên dương N có từ 4 đến 7 chữ số: ")
    var tongso = 0
    val so = readLine()

    if (so != null && so.isNotEmpty()) {
        val number = so.toLongOrNull()

        if (number != null && number in 1000..9999999) {
            {
                if(laSoDoiXung())
                {

                }
            }
    } else {
        println("Bạn chưa nhập số.")
    }
}

fun laDoiXung(str: String): Boolean {
    val length = str.length
    for (i in 0 until length / 2) {
        if (str[i] != str[length - i - 1]) {
            return false
        }
    }
    return true
}
fun Tong(n:Int):Boolean
{
    var sum = 0
    var num = n
    while (num != 0) {
        sum += (num % 10).toInt()
        val temp = num / 10
        num = temp
    }
    return sum % 3 == 0

}
