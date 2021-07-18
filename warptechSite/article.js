import React from 'react';
import './App.css';

class Article extends React.Component {
    render(){
        return (
            <div style={{
                display: "flex",
                justifyContent: "center"
                }}>
                <div style={{width: 400}}>
                    <div style={{display:"inline", color: "white"}}>
                        <p>Welcome to WARP Technology the home of a new and reality bending company that will take all of the norms that we have thought about. And turn them on end.</p>
                    </div>
                </div>
            </div>
        );
    }
}

export default Article;