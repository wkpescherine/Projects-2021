import React from 'react';
import './App.css';

import Products from "./products"

class DailyDev extends React.Component {
    state={
        case_id: "none",
        product: "none",
        escalation: "none",
        internal: "none",
        fr: "none",
        technology: "none",
        category: "none",
        sub_category: "none",
        agent: "agent",
        status: "none",
        inital_time: "none",
        agent_time: "none",
        finish_time: "none",
    }

    handleAgentChange = event => {
        this.setState({
          agent: event.target.value
        })
    }

    handleInitTimeChange = event => {
        this.setState({
          inital_time: event.target.value
        })
    }
    handleAgentTimeChange = event => {
        this.setState({
          agent_time: event.target.value
        })
    }
    handleFinishTimeChange = event => {
        this.setState({
          finish_time: event.target.value
        })
        console.log(this.state.product);
    }

    render(){
        return (
            <div>
                <input type="text" onChange={event => this.handleAgentChange(event)} value={this.state.agent} />
                <div>
                    < Products/>
                </div>
                <input type="text" onChange={event => this.handleInitTimeChange(event)} value={this.state.inital_time} />
                <input type="text" onChange={event => this.handleAgentTimeChange(event)} value={this.state.agent_time} />
                <input type="text" onChange={event => this.handleFinishTimeChange(event)} value={this.state.finish_time} />
            </div>
        )
    }
}
export default DailyDev;