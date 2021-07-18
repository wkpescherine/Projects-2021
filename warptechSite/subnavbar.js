import React from 'react';
import './App.css';

class Subnavbar extends React.Component {
    render(){
        return(
            <div style={{
                display: "flex",
                justifyContent: "center"
                }}>
                <div style={{width: 100, background: "green"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Home</h5>
                    </div>
                </div>
                <div style={{width: 100, background: "red"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Web Projects</h5>
                    </div>
                </div>
                <div style={{width: 150, background: "blue", border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Android Projects</h5>
                    </div>
                </div>
                <div style={{width: 100, background: "#aaa", border: "2px solid white"}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>WARP Tech</h5>
                    </div>
                </div>
            </div>
        );
    }
}

export default Subnavbar;