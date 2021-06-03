import React from 'react';
import './App.css';

import {Link} from 'react-router-dom'

class Home extends React.Component {
    render(){
        return (
            <div>
                <h3> Prime Academy</h3>
                <div>
                    <button> Home</button>
                    <button> Profile</button>
                    <button> Lessons</button>
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