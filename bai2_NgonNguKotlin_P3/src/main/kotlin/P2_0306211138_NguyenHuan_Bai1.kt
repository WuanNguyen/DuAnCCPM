
fun snt(a:Int):Boolean
{
    var dem = 0;
    if(a == 1)
        return false;
    else{
        for(i in 2..a-1)
        {
            if(a%i == 0)
            {
                dem++;
            }
        }
    }
    if(dem==0)return true;
    return false;
}
fun sum(a:Int):Int
{
    var tong = 0;
    var i:Int;
    for(i in 1..a)
    {
        if(snt(i) == true)
        {
            tong+=i;
        }
    }
    return tong;
}
fun main()
{
    var n:Int
    do{
        print("Nhap vao mot so nguyen duong: ");
        n = readln().toInt();
    }while(n <= 0)
    var kq = sum(n);
    print("Tong Cac so ngto: $kq ")


}