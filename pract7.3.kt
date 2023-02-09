fun main() {
    try {
        println("Введите первую сторону")
        var a = readLine()!!.toDouble()
        println("Введите вторую сторону")
        var b = readLine()!!.toDouble()
        println("Введите третью сторону")
        var c = readLine()!!.toDouble()

        if (a>0&&b>0&&c>0 )
        {
            var p1 = (a+b+c)/2;
            println("Площадь треугольника равна")
            println(Math.sqrt(p1*(p1-a)*(p1-b)*(p1-c)))
        }
        else
            println("Стороны введены неверно")
    }
    catch (e: Exception) {
        println("Неверный формат ввода")
    }
}
