import SwiftUI

struct ContentView: View {
    //Need the @State to allow me to change the date
    //Without the @State I can not modify it
    @State var possesion = ""
    @State var teamA = "NEP"
    @State var teamB = "DB"
    @State var teamAScore = 0
    @State var teamBScore = 0
    
    var body: some View {
        ZStack{
            Image("background")
                .resizable()
                .aspectRatio(contentMode: .fill)
                .edgesIgnoringSafeArea([.top])
                .edgesIgnoringSafeArea([.bottom])
            VStack{
                Spacer()
                Text("Champion Sports")
                    .foregroundColor(Color.white)
                Spacer()
                HStack{
                    Image(teamA)
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                    Text("vs")
                        .foregroundColor(Color.white)
                    Image(teamB)
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                }
                Spacer()
                HStack{
                    Spacer()
                    //The STring() is used to convert the int
                    //Into a String for use in the text
                    //Otherwise we get an error
                    Text(String(teamAScore))
                        .foregroundColor(Color.white)
                        .font(.system(size:120))
                    Spacer()
                    Text(String(teamBScore))
                        .foregroundColor(Color.white)
                        .font(.system(size:120))
                    Spacer()
                }
                Spacer()
                //Multiple ways to do a Button
                //Button("Start", action : {
                //    print("test")
                //})
                ///can also do it as this, should work
                //Button("Start") {
                //    print("test")
                //}
                
                VStack{
                    Spacer()
                    Button(action: {
                        var randomScore = Int.random(in: 0...7)
                        if(self.possesion == self.teamA){
                            self.teamAScore += randomScore
                            self.possesion = self.teamB
                        } else {
                            self.teamBScore +=  randomScore
                            self.possesion = self.teamA
                        }
                        
                    }, label: {
                            //can add custom items in here now
                            Text("Click here")
                    })
                    Spacer()
                    Text("Click to start")
                        .foregroundColor(Color.white)
                    Spacer()
                }
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}//73
