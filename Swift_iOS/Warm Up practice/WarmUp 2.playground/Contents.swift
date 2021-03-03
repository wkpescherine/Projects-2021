//Structures can also interact wityh other structures
struct DBManager {
    func saveTODB(message:String) -> String {
        return "Message saved"
    }
}

struct SmartChat {
    //This becomes a property in the struct
    //Global scope within the struct
    //can add private to limit scope of a property
    var myMessage = ""
    var messageWithPrefix:String {
        return "Response is " + myMessage
    }
    //This becomes a method in the struct
    func sendMessage(){
        var db = DBManager()
        let reponse = db.saveTODB(message: "Howdy")
        print(reponse)
    }
    func deleteMessage(){
        print("Message was deleted")
    }
    func AIChat(){
        print("This would be an automated response")
    }
}
//works like a class and can assign it to a value
SmartChat().deleteMessage()
var newChat = SmartChat()
newChat.AIChat()
newChat.sendMessage()
