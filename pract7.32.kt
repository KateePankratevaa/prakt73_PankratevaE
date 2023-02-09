fun main() {
    try {
        println("Введите a")
        var a = readLine()!!.toDouble()
        println("Введите b")
        var b = readLine()!!.toDouble()
        println("Введите c")
        var c = readLine()!!.toDouble()

        if (a==0.0) {
            println("Это линейный вид уравнения")
        }
        else {
            val d = Math.sqrt(b * b - 4 * a * c);
            println(d)
        }
        val d = Math.sqrt(b * b - 4 * a * c);
        if (d<0) {
            println("уравнение не имеет корней")
        }
        if (d==0.0&&a!=0.0) {
            println((-1*b)/(2*a))
        }
        if (d>0&&a!=0.0) {
            println("Найдем корни уравнения")
            val x1 = println( -b+Math.sqrt(d)/2*a)
            val x2 = println( -b-Math.sqrt(d)/2*a)
        }
    }
    catch (e: Exception) {
        println("Неверный формат ввода")
    }
}