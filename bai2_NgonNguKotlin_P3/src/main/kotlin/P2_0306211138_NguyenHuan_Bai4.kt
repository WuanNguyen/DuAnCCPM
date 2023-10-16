fun main() {
    print("Nhập một số nguyên dương N có từ 4 đến 7 chữ số: ")
    val so = readLine()

    if (so != null && so.isNotEmpty()) {
        val number = so.toLongOrNull()

        if (number != null && number in 1000..9999999) {
            if (laSoDoiXung(number.toString())) {
                println("$number là số đối xứng.")
            } else {
                println("$number không phải là số đối xứng.")
            }
        } else {
            println("Số bạn nhập không hợp lệ.")
        }
    } else {
        println("Bạn chưa nhập số.")
    }
}

fun laSoDoiXung(str: String): Boolean {
    val length = str.length
    for (i in 0 until length / 2) {
        if (str[i] != str[length - i - 1]) {
            return false
        }
    }
    return true
}
