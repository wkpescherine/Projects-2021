import React from 'react';
import './App.css';

import {Link} from 'react-router-dom'

import Products from "./products"
import Categorys from "./categorys"
import Status from "./status"
import SubCategorys from "./subcategorys"
import Technology from "./technology"

class DailyDev extends React.Component {
    state={
        case_id: "case id",
        product: "none",
        status: "none",
        escalation: "none",
        internal: "no",
        fr: "no",
        origin: "forum",
        language: "English",
        question: "Technology",
        technology: "none",
        category: "none",
        sub_category: "none",
        agent: "agent",
        interaction: "Brand New",
        initial_time: "initial time",
        agent_time: "agent time",
        finish_time: "finished time",
        bug_id: "bug id"
    }

    handleInternalFRChange(choice){
        if(choice === "internal"){
            if(this.state.internal === "no"){
                this.setState({
                    internal: "yes"
                })
            }else {
                this.setState({
                    internal: "no"
                })
            }
        } else {
            if(this.state.fr === "no"){
                this.setState({
                    fr: "yes"
                })
            }else {
                this.setState({
                    fr: "no"
                })
            }
        }
    }

    handleOriginChange(){
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

    handleLanguageChange(){
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
            status: "Blocked",
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
          initial_time: event.target.value
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
            product: selection,
            category: "none",
            sub_category: "none"
        })
    }

    submitCategory(selection2){
        this.setState({
            category: selection2
        })
    }

    submitSubCategory(selection3){
        this.setState({
            sub_category: selection3
        })
    }

    handleStatusChange(selection4){
        this.setState({
            status: selection4,
            escalation: "none",
            bug_id: "bug id"
        })
        if(selection4 === "Escalation"){
            if(this.stateescalation === "none"){
                this.setState({
                    escalation: "Restricted Access"
                })                
            } else if (this.state.escalation === "Restricted Access"){
                this.setState({
                    escalation: "Issue Complexity"
                }) 
            } else if (this.state.escalation === "Issue Complexity"){
                this.setState({
                    escalation: "Documentation Review"
                }) 
            } else if (this.state.escalation === "Documentation Review"){
                this.setState({
                    escalation: "SME Review"
                }) 
            } else {
                this.setState({
                    escalation: "Restricted Access"
                }) 
            }
        }
    }

    handleTechnologyChange(selection5){
        this.setState({
            technology: selection5
        })
    }

    handleQuestionChange(){
        if(this.state.question === "Technology"){
            this.setState({
                question: "Product"
            })
        }else {
            this.setState({
                question: "Technology"
            })
        }
    }

    handleInteractionChange(){
        if(this.state.interaction === "Brand New"){
            this.setState({
                interaction: "Follow Up"
            })
        } else if (this.state.interaction === "Brand New"){
            this.setState({
                interaction: "Follow Up: New User"
            })
        } else {
            this.setState({
                interaction: "Brand New"
            })
        }
    }

    submitToSheet(){
        fetch("https://api.apispreadsheets.com/data/14791/", {
            method: "POST",
            body: JSON.stringify({"data": {
                "case_id":this.state.case_id,
                "product":this.state.product,
                "status":this.state.status,
                "escalation":this.state.escalation,
                "internal":this.state.internal,
                "FR":this.state.fr,
                "language":this.state.language,
                "origin":this.state.origin,
                "technology":this.state.technology,
                "question":this.state.question,
                "category":this.state.category,
                "sub_category":this.state.sub_category,
                "agent": this.state.agent,
                "interaction":this.state.interaction,
                "initial_time":this.state.initial_time,
                "agent_time":this.state.agent_time,
                "finish_time":this.state.finish_time,
                "bug_id":this.state.bug_id
            }}),
        }).then(res =>{
            if (res.status === 201){
                // SUCCESS
                console.log("Success")
            }
            else{
                // ERROR
                console.log("Failure")
            }
        })
    }

    render(){
        return (
            <div style={{
                display: "flex",
                justifyContent: "center",
              }}>
                <div style={{width:550, border:"2px solid white"}}>
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
                        < Status handleStatusChange={this.handleStatusChange.bind(this)}/>
                    </div>
                    <br></br>
                    <div>
                        <button onClick={()=>this.handleLanguageChange()}>{this.state.language}</button>
                        <button onClick={()=>this.handleOriginChange()}>{this.state.origin}</button>
                        <button onClick={()=>this.handleInternalFRChange("internal")}>Internal: {this.state.internal}</button>
                        <button onClick={()=>this.handleInternalFRChange("fr")}>FR: {this.state.fr}</button>
                        <button onClick={()=>this.handleQuestionChange()}>Question: {this.state.question}</button>
                        <button onClick={()=>this.handleInteractionChange()}>Interaction: {this.state.interaction}</button>
                    </div>
                    <br></br>
                    <input type="text" onChange={event => this.handleInitTimeChange(event)} value={this.state.initial_time} />
                    <input type="text" onChange={event => this.handleAgentTimeChange(event)} value={this.state.agent_time} />
                    <input type="text" onChange={event => this.handleFinishTimeChange(event)} value={this.state.finish_time} />
                    <br></br>
                    <br></br>
                    <div>
                        <Technology handleTechnologyChange={this.handleTechnologyChange.bind(this)}/>
                    </div>
                    <br></br>
                    <br></br>
                    <div>
                        <Categorys submitCategory={this.submitCategory.bind(this)} data = {this.state.product}/>
                    </div>
                    <br></br>
                    <br></br>
                    <div>
                        <SubCategorys submitSubCategory={this.submitSubCategory.bind(this)} data = {this.state.category}/>
                    </div>
                    <br></br>
                    <br></br>
                    <div>
                        <button onClick={()=>this.submitToSheet()}>Submit to sheet</button>
                        <Link to="/dashboard">
                            <button >Dashboard</button>
                        </Link>
                    </div>
                </div>
                <div style={{width:100, margin: 5}}>
                <h5> 
                        {this.state.case_id}<br></br>
                        {this.state.product}<br></br>
                        {this.state.status}<br></br>
                        {this.state.escalation}<br></br>
                        {this.state.internal}<br></br>
                        {this.state.fr}<br></br>
                        {this.state.origin}<br></br>
                        {this.state.language}<br></br>
                        {this.state.question}<br></br>
                        {this.state.technology}<br></br>
                        {this.state.category}<br></br>
                        {this.state.sub_category}<br></br>
                        {this.state.agent}<br></br>
                        {this.state.interaction}<br></br>
                        {this.state.initial_time}<br></br>
                        {this.state.agent_time}<br></br>
                        {this.state.finish_time} <br></br>
                        {this.state.bug_id}<br></br>
                    </h5>
                </div>
            </div>
        )
    }
}
export default DailyDev;