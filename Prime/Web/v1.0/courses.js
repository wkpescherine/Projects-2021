import React from 'react';
import './App.css';

import {Redirect} from 'react-router-dom'

import Html from "./html"
import Java from "./java"
import CPlusPlus from "./c++"
import Python from "./components/python"

class Courses extends React.Component {
    state={
        section: "none",
        course: "none"
    }

    homeButton( selected){
        this.setState({
            section: selected
        })
    }

    selectCourse(courseClicked){
        if(this.state.course !== courseClicked){
            this.setState({
                course: courseClicked
            })
        } else  {
            this.setState({
                course: "none"
            })
        }
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
                    <div>
                        <br></br>
                        <button onClick={()=>this.selectCourse("html")}> HTML/CSS</button>
                        <br></br>
                        {this.state.course === "html" &&       
                            < Html />
                        }
                        <br></br>
                        <button onClick={()=>this.selectCourse("c++")}> C++</button>
                        <br></br>
                        {this.state.course === "c++" &&       
                            < CPlusPlus />
                        }
                        <br></br>
                        <button onClick={()=>this.selectCourse("java")}> Java</button>
                        <br></br>
                        {this.state.course === "java" &&       
                            < Java />
                        }
                        <br></br>
                        <button onClick={()=>this.selectCourse("python")}> Python</button>
                        <br></br>
                        {this.state.course === "python" &&       
                            < Python />
                        }
                    </div>
                </div>
            <h1>In Courses Section</h1>
        </div>
      );
    }
}

export default Courses;