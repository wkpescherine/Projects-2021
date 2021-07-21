import React from 'react';
import './App.css';

class Navbar extends React.Component {
    render(){
        return(
            <div style={{
                display: "flex",
                justifyContent: "center"
                }}>
                <div style={{width: 100, background: "green"}}
                    onClick={()=>this.props.changeSection("home")}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Home</h5>
                    </div>
                </div>
                <div style={{width: 100, background: "red"}} 
                    onClick={()=>this.props.changeSection("web")}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Web</h5>
                    </div>
                </div>
                <div style={{width: 100, background: "blue", border: "2px solid white"}}
                    onClick={()=>this.props.changeSection("android")}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Android</h5>
                    </div>
                </div>
                <div style={{width: 100, background: "#0b0", border: "2px solid white"}}
                    onClick={()=>this.props.changeSection("games")}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>Games</h5>
                    </div>
                </div>
                <div style={{width: 100, background: "#aaa", border: "2px solid white"}}
                    onClick={()=>this.props.changeSection("warp")}>
                    <div style={{display:"inline", color: "white"}}>
                        <h5>WARP Tech</h5>
                    </div>
                </div>
            </div>
        );
    }
}

export default Navbar;