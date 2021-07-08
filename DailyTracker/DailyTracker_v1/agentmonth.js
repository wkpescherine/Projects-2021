import React from 'react';
import './App.css';

class AgentMonth extends React.Component {
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
                        {this.props.amth1}
                    </div>
                </div>
                <div style={{width: 20, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 20}}>
                        {this.props.amth2}
                    </div>
                </div>
                <div style={{width: 20, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 20}}>
                        {this.props.amth3}
                    </div>
                </div>
                <div style={{width: 20, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 20}}>
                        {this.props.amth4}
                    </div>
                </div>
                <div style={{width: 20, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 20}}>
                        {this.props.amth5}
                    </div>
                </div>
                <div style={{width: 20, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 20}}>
                        {this.props.amth6}
                    </div>
                </div>
            </div>
        )
    }
}
export default AgentMonth;