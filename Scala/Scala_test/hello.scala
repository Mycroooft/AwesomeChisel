
// 该部分是需要编译的非脚本文件
/*

object Hello
{
    def main(args : Array[String]) : Unit = 
    {
        println("Hello world!")
    }
}

*/


class Hello {
    val hw = "Hello world!"
    def display() = println(hw)
}


// 以下一行可构成可执行的Scala脚本文件
//println("Hello world!")