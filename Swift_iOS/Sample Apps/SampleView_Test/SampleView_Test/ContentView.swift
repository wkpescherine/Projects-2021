//
//  ContentView.swift
//  SampleView_Test
//
//  Created by wkpescherine on 3/5/21.
//

import SwiftUI

struct ContentView: View {
    @State var GoToView2:Bool = false
    var body: some View {
        ZStack{
            if(GoToView2){
                View2(ContentView: self.$GoToView2)
            }else {
                VStack{
                    Text("View 1")
                        .padding()
                    Button( "Switch View" , action : {
                        withAnimation {
                            self.GoToView2.toggle()
                        }
                    })
                }
            }
        }
    }
}

struct View2: View {
    @Binding var ContentView:Bool
    var body: some View {
        VStack{
            Button(action: {
                withAnimation {
                    self.ContentView.toggle()
                }
            }){
                Text("This is view 2")
            }
        }.transition(.move(edge: .leading))
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
