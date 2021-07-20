import React from 'react';
import './App.css';

import Navbar from "./navbar"
import Article from "./article"
import WebSub from "./websub"
import AndroidSub from "./androidsub"
import HomeArticle from './home_article'
import SFArticle from "./sf_article"

class Homepage extends React.Component {
    state = {
        section: "home",
        project: "home"
    }

    changeSection(selectedSection){
        this.setState({
            section: selectedSection,
            project: selectedSection
        })
    }

    changeProject(selectedProject){
        this.setState({
            project: selectedProject
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
                        < WebSub changeProject={this.changeProject.bind(this)}/>
                    }
                    { this.state.section === "android" &&
                        < AndroidSub/>
                    }
                </div>
                <div>
                    {this.state.project === "home" &&
                        <HomeArticle/>
                    }
                </div>
                <div>
                    {this.state.project === "sportforge" &&
                        <SFArticle/>
                    }
                </div>
            </div>
        );
    }
}

export default Homepage;