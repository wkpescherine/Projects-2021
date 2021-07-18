import React from 'react';
import './App.css';

import Navbar from "./navbar"
import Subnavbar from "./subnavbar"
import Article from "./article"

class Homepage extends React.Component {
    state = {
        section: "home"
    }

    changeSection(selectedSection){
        this.setState({
            section: selectedSection
        })
    }

    render(){
        return (
            <div>
                <div>
                    <h1> WARP TECHNOLOGY LLC </h1>
                    <h5> Redefining reality</h5>
                </div>
                < Navbar changeSection={this.changeSection.bind(this)}/>
                <div>
                    { this.state.section === "web" &&
                        < Subnavbar data={this.state.section}/>
                    }
                    { this.state.section === "android" &&
                        < Subnavbar data={this.state.section}/>
                    }
                </div>
                < Article />
            </div>
        );
    }
}

export default Homepage;