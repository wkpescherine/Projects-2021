//
//  ContentView.swift
//  SampleApp
//
//  Created by wkpescherine on 3/1/21.
//

import SwiftUI
//View can only have one element vstack allows you to hold more
struct ContentView: View {
    var body: some View {
        //vstack can hold more then 1 element
        VStack{
            //ImageIcon("Asset_name") for image example
            //This is used to help to create equal space
            //between elemnets
            Spacer()
            Text("Sample App").padding()
            Text("this is a second line of text").padding()
            Spacer()
            VStack{
                Text("Sample App").padding()
                Text("this is a second line of text").padding()
            }
            Spacer()
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
