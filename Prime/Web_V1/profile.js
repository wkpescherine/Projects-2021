import React from 'react';
import './App.css';

import {Redirect} from 'react-router-dom'

class Profile extends React.Component {
    state={
        section: "none" 
    }

    homeButton( something){
        this.setState({
            section: something
        })
    }
    render(){
        if(this.state.section === "home"){
            return <Redirect to="/home"/>
        }
        if(this.state.section !== "none" && this.state.section !== "profile"){
            if(this.state.section === "profile"){
                return <Redirect to="/profile"/>
            }
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
            <h1>In Profile Section</h1>
        </div>
      );
    }
}

export default Profile;