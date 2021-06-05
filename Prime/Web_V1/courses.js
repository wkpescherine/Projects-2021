import React from 'react';
import './App.css';

import {Redirect} from 'react-router-dom'

class Courses extends React.Component {
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
        if(this.state.section === "profile"){
            return <Redirect to="/profile"/>
        }
        if(this.state.section !=="none" && this.state.section !== "courses"){
            if(this.state.section === "courses"){
                return <Redirect to="/courses"/>
            }
        }
        if(this.state.section === "logout"){
            return <Redirect to="/"/>
        }

        return (
        <div>
            <h3> Prime Academy</h3>
                <div>
                    <button onClick={()=>this.homeButton("home")}> Home</button>
                    <button onClick={()=>this.homeButton("profile")}> Profile</button>
                    <button onClick={()=>this.homeButton("courses")}> Courses</button>
                    <button onClick={()=>this.homeButton("logout")}> Logout</button>
                </div>
            <h1>In Courses Section</h1>
        </div>
      );
    }
}

export default Courses;