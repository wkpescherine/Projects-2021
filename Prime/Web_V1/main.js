import React from 'react';
import './App.css';

import {Redirect} from 'react-router-dom'

class Main extends React.Component {
    state={
        create: false,
        login: false
    }

    submitButton(){
        this.setState({
            login: true
        })
    }

    createButton(){
        this.setState({
            create: true
        })
    }

    render(){
        if(this.state.login === true){
            return <Redirect to="/home" /> 
        }

        if(this.state.create === true){
            return <Redirect to="/create"/>
        }

        return (
            <div>
                <h1> Prime Academy</h1>
                <button onClick={()=>this.submitButton()}>Click to Enter</button>
                <br></br>
                <br></br>
                <button onClick={()=>this.createButton()}>Create Profile</button>
            </div>
        );
    }
}

export default Main;