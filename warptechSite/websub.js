import React from 'react';
import './App.css';

class WebSub extends React.Component {
    render(){
        return(
            <div style={{
                display: "flex",
                justifyContent: "center"
                }}>
                <div style={{width: 100} }>
                    <div style={{display:"inline", color: "white"}}>
                        <h5 onClick={()=>this.props.changeProject("sportforge")}>SportsForge</h5>
                    </div>
                </div>
            </div>
        );
    }
}

export default WebSub;