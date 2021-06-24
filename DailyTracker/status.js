import React from 'react';
import './App.css';

class Status extends React.Component {
    render(){
        return (
            <div>
                <button onClick={()=>this.props.handleStatusChange("Solution Offered")}>Solution Offered</button>
                <button onClick={()=>this.props.handleStatusChange("Need Info")}>Needs Info</button>
                <button onClick={()=>this.props.handleStatusChange("Escalation")}>Escalation</button>
                <button onClick={()=>this.props.handleStatusChange("Closed")}>Closed</button>
                <button onClick={()=>this.props.handleStatusChange("Routed")}>Routed</button>
                <button onClick={()=>this.props.handleStatusChange("Duplicate")}>Duplicate</button>
                <button onClick={()=>this.props.handleStatusChange("Spam")}>Spam</button>
            </div> 
        )
    }
}
export default Status;