import React from 'react';
import './App.css';

import Products from "./products"
import Categorys from "./categorys"
import Status from "./status"

class DailyDev extends React.Component {
    state={
        case_id: "case id",
        product: "none",
        status: "none",
        escalation: "none",
        internal: "none",
        fr: "none",
        origin: "forum",
        language: "English",
        question: "none",
        technology: "none",
        category: "none",
        sub_category: "none",
        agent: "agent",
        interaction: "none",
        inital_time: "initial time",
        agent_time: "agent time",
        finish_time: "finished time",
        bug_id: "bug id"
    }

    handleOriginChange = event => {
        if(this.state.origin === "forum"){
            this.setState({
                origin: "support"
            })
        } else{
            this.setState({
                origin: "forum"
            })
        }
    }

    handleLanguageChange = event => {
        if(this.state.language === "English"){
            this.setState({
                language: "Chinese"
            })
        } else if(this.state.language === "Chinese"){
            this.setState({
                language: "Spanish"
            })
        } else {
            this.setState({
                language: "English"
            }) 
        }
    }

    handleAgentChange = event => {
        this.setState({
          agent: event.target.value
        })
    }

    handleBugIdChange = event => {
        this.setState({
            bug_id: event.target.value
        })
    }

    handleCaseIdChange = event => {
        this.setState({
            case_id: event.target.value
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

    submitProduct(selection){
        this.setState({
            product: selection
        })
    }

    submitCategory(selection){
        this.setState({
            category: selection
        })
    }

    handleStatusChange = event => {}

    render(){
        return (
            <div>
                <input type="text" onChange={event => this.handleAgentChange(event)} value={this.state.agent} />
                <input type="text" onChange={event => this.handleCaseIdChange(event)} value={this.state.case_id} />
                <input type="text" onChange={event => this.handleBugIdChange(event)} value={this.state.bug_id} />
                <br></br>
                <br></br>
                <div>
                    < Products submitProduct={this.submitProduct.bind(this)}/>
                </div>
                <br></br>
                <div>
                    < Status />
                </div>
                <br></br>
                <div>
                    <button onClick={()=>this.handleLanguageChange()}>{this.state.language}</button>
                    <button onClick={()=>this.handleOriginChange()}>{this.state.origin}</button>
                </div>
                <br></br>
                <input type="text" onChange={event => this.handleInitTimeChange(event)} value={this.state.inital_time} />
                <input type="text" onChange={event => this.handleAgentTimeChange(event)} value={this.state.agent_time} />
                <input type="text" onChange={event => this.handleFinishTimeChange(event)} value={this.state.finish_time} />
                <br></br>
                <br></br>
                <div>
                    <Categorys data = {this.state.product}/>
                </div>
                <br></br>
                <br></br>
                <div>
                    <button>Submit to sheet</button>
                </div>
                <h5> {this.state.case_id}|{this.state.product}|{this.state.status}|{this.state.escalation}|
                </h5>
            </div>
        )
    }
}
export default DailyDev;