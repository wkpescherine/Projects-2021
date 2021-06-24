import React from 'react';
import './App.css';

class SubCategorys extends React.Component {
    render(){
        return(
            <div>
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Crash")}>Crash</button>
                }               
            </div>
        )
    }

}
export default SubCategorys;