/*
    Scala version: 2.11.12
*/

//Removes spaces
def removeGap(param: String):String={param.replace(" ", "").toLowerCase()}

//Example 1
val phrasesOne=List("This is a phrases ", "String ")
val remove_gap_one=phrasesOne.map(removeGap)                                                   
if (remove_gap_one(0)==remove_gap_one(1).reverse){println("This is a palindrome")}else{println("This is not a palindrome")}
//Example 2
val phrasesTwo=List("malayalaM", "maLayalam ")
val remove_gap_two=phrasesTwo.map(removeGap) 
if (remove_gap_two(0)==remove_gap_two(1).reverse){println("This is a palindrome")}else{println("This is not a palindrome")}
//Example  3
val phrasesThree=List("level")
val phrasesThree1="level"::phrasesThree//add an item
val remove_gap_three=phrasesThree1.map(removeGap) 
if (remove_gap_three(0)==remove_gap_three(1).reverse){println("This is a palindrome")}else{println("This is not a palindrome")}

//Example  4
val phrasesFour="level " :: "level "::Nil
val remove_gap_four=phrasesFour.map(removeGap) 
if (remove_gap_four(0)==remove_gap_four(1).reverse){println("This is a palindrome")}else{println("This is not a palindrome")}
