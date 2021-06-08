import React from 'react';
import './App.css';

import {Link} from 'react-router-dom'
import {Redirect} from 'react-router-dom'

class Home extends React.Component {
    state={
        section: "none" 
    }

    homeButton( something){
        this.setState({
            section: something
        })
    }

    render(){
        if(this.state.section !== "none" && this.state.section !== "home"){
            if(this.state.section === "home"){
                return <Redirect to="/home"/>
            }
        }
        if(this.state.section === "profile"){
            return <Redirect to="/"/>
        }
        if(this.state.section === "lesson"){
            return <Redirect to="/lesson"/>
        }

        return (
            <div>
                <h3> Prime Academy</h3>
                <div>
                    <button onClick={()=>this.homeButton("home")}> Home</button>
                    <button onClick={()=>this.homeButton("profile")}> Profile</button>
                    <button onClick={()=>this.homeButton("lesson")}> Lessons</button>
                </div>
                <br></br>
                <Link to="/">
                    <h5>Back</h5>
                </Link>
            </div>
        );
    }
}

export default Home;