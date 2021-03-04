import UIKit

class Person {
    var name = ""
    var age = 0
    
    func actions(){
        print("One year older")
        age += 1
    }
}

//The : after the new Class title extends the Person class
//Now I have access to the Person properties and methods
//This inheritance can go as far back as it is able to go
//So if person inherited, I can gain access to that through
//The Person class
class Employee:Person {
    var position = ""
    var salary = 0
    
    //The override is used to call the previous function but also
    //It allows me to change it to what I want
    override func actions() {
        //The super is used to call the action for the
        //original class
        super.actions()
        print("Going to work and having fun today")
        salary += 10
    }
    
}

var bob = Employee()

bob.name = "Bob Someone"
bob.age = 27
bob.position = "King"
bob.salary = 100

bob.actions()
print(bob.name)
print(bob.age)
print(bob.position)
print(bob.salary)

