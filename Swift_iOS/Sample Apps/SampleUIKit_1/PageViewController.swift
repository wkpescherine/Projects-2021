//
//  PageViewController.swift
//  SampleUIKit_1
//
//  Created by wkpescherine on 3/4/21.
//

import SwiftUI
import UIKit

struct PageViewController<Page: View>: UIViewControllerRepresentable {
    var pages: [Page]

}
