import React from 'react';
import './App.css';

class AgentTracker extends React.Component {
    render(){
        return (
            <div style={{
                display: "flex",
                justifyContent: "center"
                }}>
                <div>

                </div>
                <div style={{width: 100, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white"}}>
                        Agent Name
                    </div>
                </div>
                <div style={{width: 100, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 100}}>
                        0
                    </div>
                </div>
                <div style={{width: 100, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 100}}>
                        0
                    </div>
                </div>
                <div style={{width: 100, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 100}}>
                        0
                    </div>
                </div>
            </div>
        )
    }
}
export default AgentTracker;