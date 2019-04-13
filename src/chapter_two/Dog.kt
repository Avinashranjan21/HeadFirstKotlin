package chapter_two

class Dog (val name:String,val weight:Int,val breed : String){

    fun bark(){
        println((if (weight <20) "Yip!" else "Woof!"))
    }
}

fun main(){
    var myDog = Dog("Fido",70,"Mixed")
    println(myDog.name)
    myDog.bark()
}