import React from 'react';
import './App.css';

class UpdateQueue extends React.Component {
    state2 = {
        tempValue:""
    }
    render(){
        return (
            <div>
                <input type="text"onChange={event => this.props.changeQueue(event)} value={this.props.admobQ} />
                <button onClick={()=>this.props.showModQueue("")}>update</button>
            </div> 
        )
    }
}
export default UpdateQueue;