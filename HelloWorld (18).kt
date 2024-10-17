/*fun main() {
  
  val unreadCount = 5
  val readCount = 105
    println("You have ${unreadCount + readCount} total message  in your inbox.")
}

Output:

You have 110total message  in your inbox.*/



//f you forget the curly braces around the template expression, you will get unexpected results. You can test that out in the Kotlin Playground by changing the println() statement to println("You have $unreadCount + readCount total messages in your inbox.") and observing the output.

/*fun main()
{
  
  val unreadCount = 5
  val readCount = 105
    println("You have $unreadCount + readCount total message  in your inbox.")
}

Output:

You have 5 + readCount total message  in your inbox.*/


/*fun main()
{
  val numberOfPhotos = 100
  val photosDeleted = 10
  println("$numberOfPhotos")
  println("$photosDeleted")
  println("${numberOfPhotos-photosDeleted} photo left")
  
}

Output:

100
10
90 photo left*/





/*fun main()
{
  val numberOfProductSell = 1100
  val numberOfProductRemain = 50
  println("$numberOfProductSell")
  println("$numberOfProductRemain")
  println("${numberOfProductSell-numberOfProductRemain} still Productts are Remaining")
  
}

Output:

1100
50
1050 still Productts are Remaining*/





