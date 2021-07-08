import React from 'react';
import './App.css';

class Agent extends React.Component {
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
                        {this.props.data1}
                    </div>
                </div>
                <div style={{width: 100, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 100}}>
                        {this.props.data2}
                    </div>
                </div>
                <div style={{width: 100, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 100}}>
                        {this.props.data3}
                    </div>
                </div>
                <div style={{width: 100, border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white", width: 100}}>
                        {this.props.data4}
                    </div>
                </div>
            </div>
        )
    }
}
export default Agent;