/* Create a Dictionary app using mapOf() function where user will
 type a word and your program should return the meaning of that word. */
fun main(){
    var data = mutableMapOf<String,String>(
        "animal" to "living beings",
        "computer" to "electronic device",
        "kera" to "A kind of healthy fruit",
        "book" to "Where there are various information"
    )
    print("Enter a word to find its meaning: ")
    var input : String = readln()

    val meaning = data[input]

    if (meaning != null){
        println("The meaning of the $input is ${meaning}")
    }
    else{
        println("Sorry the meaning of the word $input is not in dictionary")
    }


}