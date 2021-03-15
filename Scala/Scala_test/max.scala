def max(x : Int, y : Int) : Int = {
    if(x > y)
        x
    else
        y
}

val a = 2
val b = 3
val m = max(a, b)
println(s"The max between $a and $b is $m")