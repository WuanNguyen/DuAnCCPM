class ThiSinh
{
    public val danhsach = mutableListOf<ThiSinh>()
    var cccd: String=""
    var hoten: String=""
    var toan: Float=0f
    var ly: Float=0f
    var hoa: Float=0f
    var van: Float=0f
    var anh : Float=0f
    var khoithi: String=""
    constructor()
    {
        this.cccd=cccd
        this.hoten=hoten
        this.toan=toan
        this.ly=ly
        this.hoa=hoa
        this.van=van
        this.anh=anh
        this.khoithi=khoithi
    }
    constructor(cccd:String,hoten:String,toan:Float,ly:Float,hoa:Float,van:Float,anh:Float,khoithi:String)
    {
        this.cccd=cccd
        this.hoten=hoten
        this.toan=toan
        this.ly=ly
        this.hoa=hoa
        this.van=van
        this.anh=anh
        this.khoithi=khoithi
    }
    fun Nhap()
    {
        while(true)
        {
            print("Nhập Họ và tên: ")
            val hoten = readLine() ?: ""
            print("Nhập căn cước công dân: ")
            val cccd= readLine() ?: ""
            print("Nhập điểm toán: ")
            val toan = readln().toFloat()
            print("Nhập điểm lý: ")
            val ly= readln().toFloat()
            print("Nhập điểm hóa: ")
            val hoa = readln().toFloat()
            print("Nhập điểm văn: ")
            val van= readln().toFloat()
            print("Nhập điểm anh: ")
            val anh= readln().toFloat()
            print("Nhập khối thi: ")
            val khoithi= readLine() ?: ""

            val thisinh = ThiSinh(cccd,hoten,toan,ly,hoa,van,anh,khoithi)
            danhsach.add(thisinh)
            print("Bạn muốn nhập tiếp (Y/N)? ")
            val input = readLine()?.trim()?.uppercase() ?: ""
            if (input != "Y") {
                break;
            }
        }
    }
    fun Xuat()
    {
        println("Danh sách thông tin thí sinh:")
        danhsach.forEach{
            println("\nHọ tên: ${it.hoten}")
            println("Cccd: ${it.cccd}")
            println("Toán: ${it.toan}")
            println("Lý: ${it.ly}")
            println("Hóa: ${it.hoa}")
            println("Văn: ${it.van}")
            println("Anh: ${it.anh}")
            println("Khối thi: ${it.khoithi}")
            TinhTongDiemTheoKhoiThi()
        }
    }
    fun TinhTongDiemTheoKhoiThi()
    {
        var tong:Float?=null
        if(khoithi.uppercase()=="A00")
        {
            tong= toan+ ly +hoa
        }
        else if(khoithi.uppercase()=="A01")
        {
            tong= toan+ly+anh
        }
        else if(khoithi.uppercase()=="D01")
        {
            tong=toan+van+anh
        }
        println("Tổng điểm xét theo khối thi ${khoithi.uppercase()}: ${tong} điểm")
    }

//    fun SapXep()
//    {
//        println("\n Danh sách sau khi sắp xếp:")
//        danhsach.s
//    }



}
fun main(args: Array<String>)
{
    var thisinh=ThiSinh()
    thisinh.Nhap()
    thisinh.Xuat()
    print("Nhập vào điểm chuẩn:")
    var diemchuan=readln().toFloat()


}
