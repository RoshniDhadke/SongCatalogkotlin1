class Song(var title:String,var artist:String,var year:Int,var playCount:Int){
    val isPopular:Boolean
    get()=playCount>=1000

    fun Description() {
        println("$title performed by $artist was released in $year ")
    }
}
fun main(){
    val input=Song("Until i found you","Stephen Sanchez",2022,10001)
    input.Description()
    println(input.isPopular)
}