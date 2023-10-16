fun x(n:Int):Int
{
    if(n == 0)
        return 1;
    return(x(n-1)+y(n-1));
}
fun y(n:Int):Int
{
    if(n == 0)
        return 0;
    return (3*x(n-1)+2*y(n-1));
}
fun main()
{
    var n:Int
    do{
        print("Nhap vao mot so nguyen duong: ");
        n = readln().toInt();
    }while(n < 0)
    println("X[$n]= ${x(n)}");
    println("Y[$n]= ${y(n)}");
}