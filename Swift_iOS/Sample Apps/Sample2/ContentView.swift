//
//  ContentView.swift
//  Sample2
//
//  Created by wkpescherine on 3/2/21.
//  Copyright © 2021 wkpescherine. All rights reserved.
//

import SwiftUI

struct ContentView: View {
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
                    Image("NEP")
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                    Text("vs")
                        .foregroundColor(Color.white)
                    Image("DB")
                        .resizable()
                        .aspectRatio(contentMode: .fit)
                }
                Spacer()
                HStack{
                    Spacer()
                    Text("0")
                        .foregroundColor(Color.white)
                        .font(.system(size:120))
                    Spacer()
                    Text("0")
                        .foregroundColor(Color.white)
                        .font(.system(size:120))
                    Spacer()
                }
                Spacer()
                //Button("Start", action : {
                //    print("test")
                //})
                ///can also do it as this, should work
                //Button("Start") {
                //    print("test")
                //}
                Button(action: {
                    print()
                }, label: {
                        //can add custom items in here now
                        Text("Click here")
                })
                Text("Click to start")
                    .foregroundColor(Color.white)
                Spacer()
                
            }
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
