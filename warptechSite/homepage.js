import React from 'react';
import './App.css';

import Navbar from "./navbar"
import Article from "./article"
import WebSub from "./websub"
import AndroidSub from "./androidsub"

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
                        < WebSub/>
                    }
                    { this.state.section === "android" &&
                        < AndroidSub/>
                    }
                </div>
                <div>
                    { this.state.section === "home" &&
                        < Article />
                    }
                </div>
            </div>
        );
    }
}

export default Homepage;