import React from 'react';
import './App.css';

class Technology extends React.Component {
    render(){
        return(
            <div>
                <button onClick={()=>this.props.handleTechnologyChange("HTML5")}>HTML 5</button>
                <button onClick={()=>this.props.handleTechnologyChange("Java")}>Java</button>
                <button onClick={()=>this.props.handleTechnologyChange("iOS")}>iOS</button>
                <button onClick={()=>this.props.handleTechnologyChange("Android")}>Android</button>
                <button onClick={()=>this.props.handleTechnologyChange("Python")}>Python</button>               
            </div>
        )
    }

}
export default Technology;