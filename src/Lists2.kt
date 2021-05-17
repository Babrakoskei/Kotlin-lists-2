fun main(){
 var classes = listOf("Anita B", "lovelace", "Lisa lab")
 println(classes[1])
 var colors = mutableListOf("Black","Red","White")
    println(colors)
    var Kenya = listOf("Kenya",5200000,63.8,true)
    data class Car(var make:String,val model :String)
    var carsList= listOf(Car("Mazda","Dermio"))
    Car("Subaru","Forester")
    Car("Toyota","Corola")
    println(carsList)
    var nums= listOf(45,3455,53,4,763,24,5,24,123,7,3,9)
    println(nums.count())
    println(nums.size)
    println(nums.maxOrNull())
    println(nums.minOrNull())
    println(nums.sum())
    println(nums.average())
    println(nums.first())
 //  var ages = listOf(13,13,13,13)
    //println(ages.minOrNull())
    //list indexing
    var colours = mutableListOf("black", "red","green", "blue")
    println(colours[2])
    println(colours.get(3))
    colours[2]= "Purple"
    println(colours)
    colours.set(3,"Yellow")
    println(colours)
    for (colour in colours){
        println(colours)
        var sortedColours= colours.sorted()
        println(sortedColours)
       // println(filteredNames())

    }
   // var numbers= listOf(3,567,37,436,87,90,674)
    //var sortedColours= colours.sortedDescending()
   // println(sortedColours)


    data class Phone (var brand: String,var price : Int)
     var phoneList= listOf(
         Phone ("Samsung",12000),
         Phone("Itel",19000),
         Phone("Tecno",45666),
         Phone("Iphone",50000)


     )
   // println(phoneList)
    var over15kPhones = phoneList.filter { phone->phone.price>15000 }
    println(over15kPhones)
    var phoneListi = phoneList.filter {  phone->phone.brand.startsWith("I")}
    println(phoneListi)
   // var sortedPhones = phoneList.sortedByDescending { phone -> phone.brand }
//println(sortedPhones)
    var names = listOf( "Janet","James","Kate ","Lilian","Diane")
  //  var filtered = names.filter { name->name.startsWith("L") }
  //  println(filtered)
   // var filtered = names.filter { name->name.length%2!=0 }
  //  println(filtered)
}
fun filteredNames(names: List<String>): List<String>{
   var filteredNames = names.filter { name->name.length%2!=0 }
    return filteredNames
}




