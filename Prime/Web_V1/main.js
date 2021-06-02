import React from 'react';
import './App.css';

import {Link} from 'react-router-dom'
import {Redirect} from 'react-router-dom'

class Main extends React.Component {
    state={
        login: false
    }

    submitButton(){
        this.setState({
            login: true
        })
    }

    render(){
        if(this.state.login === true){
            return <Redirect to="/home" /> 
        }

        return (
            <div>
                <h1> Prime Academy</h1>
                <button onClick={()=>this.submitButton()}>Click to Enter</button>
            </div>
        );
    }
}

export default Main;