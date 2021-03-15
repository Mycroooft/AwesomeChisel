object test_row
{
    def printRows(rows : Int) {
        def printRow(columns : Int) : Unit = println("X" * columns)
        if(rows > 0) {
            printRow(rows)
            printRows(rows - 1)
        }
    }

    def main(args : Array[String]) : Unit = 
    {
        printRows(10)
    }
}