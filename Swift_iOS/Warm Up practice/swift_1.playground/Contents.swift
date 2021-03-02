import UIKit

var str = "Hello, playground"
//When type is created at rucomile then it keeps the same
//type which can not be changed as we progress. But your are
//unable to change type once cast
var number = 34
var number2 = 78

number + number2
//No need to cast types
var val1:Int = 45

var val2:Double = 45.32
//This is a const immutable
let word = "New String"

func something(){
    number+number2
}
//This is the function call that is neeeded
something()

if number > 20 && number < 30 {
    print("This is true")
} else if number == 34 {
    print("The nymber is equal to 34")
} else {
    print("This is false")
}

var person = "Bob"

switch person {
    case "Fred":
        print("The string is Fred")
    case "Mark":
        print("The string is Mark")
    case "Bob":
        print("The string is Bob")
    case "Todd":
        print("The string is Todd")
    default:
        print("There is no person")
}
//for in loop numbers are inclusive
//dont need to use the counter and it will still work
//can also replace counter with _
for counter in 0...6 {
    print(person)
    print(counter)
}

var sum = 0
var iteration = 0

while sum < 470 {
    sum += iteration
    iteration += 1
}

var nextSum = sum
print(sum)
print(iteration)
print(nextSum)

iteration = 0

repeat {
    sum = sum/2
    iteration += 1
}while sum > 0

print(sum)
print(iteration)

//The _ underscore lets me just pass the value in
// first is the argument label and then the parameter
//Mostly for passing values to the function
func addition( _ para1:Int, _ para2:Int) -> Int {
    let a = para1
    let b = para2
    let c = a+b
    return c
}

var moreSum = addition(7,19)
print(moreSum)

//clases
class Person {
    var name = ""
    var age = 0
    var location = ""
    
    func getOlder(){
        print("Getting another year older")
        age += 1
    }
}

//This is the constructor
var Greg = Person()

Greg.name = "Greg Someone"
Greg.age = 7891
Greg.location = "New York City"

for _ in 1...10{
    Greg.getOlder()
}

print(Greg.age)

