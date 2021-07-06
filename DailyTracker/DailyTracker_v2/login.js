import React from 'react';
import './App.css';

import {Link} from 'react-router-dom'

class Login extends React.Component {
    state = {
      login: false
    }
    render(){
        return (
            <div>
              <Link to="/dashboard">
                <button>Click to enter</button>
              </Link>
            </div>
          );
        }
    }

export default Login;