import React from 'react';
import './App.css';

import Navbar from "./navbar"
import Subnavbar from "./subnavbar"
import Article from "./article"

class Homepage extends React.Component {
    render(){
        return (
            <div>
                <div>
                    <h1> WARP TECHNOLOGY LLC </h1>
                    <h5> Redefining reality</h5>
                </div>
                < Navbar />
                < Subnavbar />
                < Article />
            </div>
        );
    }
}

export default Homepage;