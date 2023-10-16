fun main() {
    print("Nhập một số nguyên dương N có từ 4 đến 7 chữ số: ")
    val input = readLine()

    if (input != null && input.isNotEmpty()) {
        val number = input.toLongOrNull()

        if (number != null && number in 1000..9999999) {
            if (laSoTien(number.toString())) {
                println("$number là số tiến.")
            } else {
                println("$number không phải là số tiến.")
            }
        } else {
            println("Số bạn nhập không hợp lệ.")
        }
    } else {
        println("Bạn chưa nhập số.")
    }
}

fun laSoTien(str: String): Boolean {
    val length = str.length
    for (i in 0 until length - 1) {
        if (str[i] >= str[i + 1]) {
            return false
        }
    }
    return true
}
