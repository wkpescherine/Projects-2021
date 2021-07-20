import React from 'react';
import './App.css';

class SFArticle extends React.Component {
    render(){
        return(
            <div style={{
                display: "flex",
                justifyContent: "center"
                }}>
                <div style={{width: 500} }>
                    <div style={{display:"inline", color: "white"}}>
                        <p>Sport based fantasy torunamnet that uses an IronMan type of approach to see who wins</p> 
                   </div>
                </div>
            </div>
        );
    }
}

export default SFArticle;