import React from 'react';
import './App.css';

import {Link} from 'react-router-dom'
import {Redirect} from 'react-router-dom'

class Create extends React.Component {
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
          <h3>Enter the following information to create an account</h3>
          <input type="text" onChange={event => this.handleUsernameChange(event)} value={this.state.username} />
          <br></br>
          <br></br>
           <input type="text" onChange={event => this.handleEmailChange(event)} value={this.state.email} />
          <br></br>
          <br></br>
          <input type="text" onChange={event => this.handlePasswordChange(event)} value={this.state.password} />
          <br></br>
          <br></br>
          <button onClick={()=>this.submitButton()}>Submit</button>
          <br></br>
          <Link to="/">
            <h5>Back</h5>
          </Link>
        </div>
      );
    }
}

export default Create;