import React from 'react';
import './App.css';

class GameSub extends React.Component {
    render(){
        return(
            <div style={{
                display: "flex",
                justifyContent: "center"
                }}>
                <div style={{width: 100}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Ascension</h5>
                    </div>
                </div>
                <div style={{width: 150}}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Lords of Bellum</h5>
                    </div>
                </div>
            </div>
        );
    }
}

export default GameSub;