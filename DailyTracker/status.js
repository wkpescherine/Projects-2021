import React from 'react';
import './App.css';

class Status extends React.Component {
    render(){
        return (
            <div>
                <button>Solution Offered</button>
                <button>Needs Info</button>
                <button>Escalation</button>
                <button>Blocked</button>
                <button>Closed</button>
            </div> 
        )
    }
}
export default Status;