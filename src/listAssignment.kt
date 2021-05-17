fun main(){
println(Even(listOf("Babra","Manuel","Cain","Liza","Faith","Bre","Sammi","Sam","Flora","Clara")))
println(People(listOf(1.6,2.3,1.7,2.1,1.1)))
    //var personList= listOf("Manny",34,1.2,67.9)
    var personList= listOf(
    Person("Hyram",32,2.0,49.9),
    Person("Dylan",19,1.5,55.7),
        Person("Babra",20,26.7,56.0)
    )
    var sortedPerson= personList.sortedByDescending { Person->Person.age }
   println(sortedPerson)

    println(personList)
    var carList= listOf(
        Car("KDA1234",90.7),
        Car("KCA6754",34.8),
        Car("KBD768",76.9)
    )
    println(details(carList))
}



fun Even(name: List<String>): List<String>{
var word = mutableListOf<String>()
    for(x in name){
        if(name.indexOf(x)%2!=0)
            word.addAll(listOf(x))
    }
    return word
}
fun People(height: List<Double>):Pair<Double,Double>{
    var total = height.sum()
    var average = height.average()
    return Pair(total,average)

}
data class Person(var name:String,var age:Int,var height:Double,var weight:Double){
fun person(name:String,age: Int,height: Double,weight: Double){
//    var personList= listOf(Person("Manny",34,1.2,67.9))
//    Person("Hyram",32,2.0,49.9)
//    Person("Dylan",19,1.5,55.7)
//    var sortedPerson= personList.sortedByDescending { Person->person.age }
//    println(sortedPerson)
}
}
fun humanCombine(Person:MutableList<Person>){
    var personList= listOf(
        Person("Hyram",32,2.0,49.9),
        Person("Dylan",19,1.5,55.7),
        Person("Babra",20,26.7,56.0)
    )
    Person.addAll(
        listOf(
            Person("Garet",10,1.1,50.6),
            Person("Dina",30,2.1,60.9)

        )


    )

println(personList)

}
class Car (var registration: String,var milleage :Double)
  fun details(cars: List<Car>)  : Double{
      var totalMilleage=0.0
      cars.forEach{ Car->
          totalMilleage+= Car.milleage

      }
      var average = totalMilleage / cars.size
      return average
  }


