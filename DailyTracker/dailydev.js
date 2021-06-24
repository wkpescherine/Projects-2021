import React from 'react';
import './App.css';

import Products from "./products"
import Categorys from "./categorys"
import Status from "./status"
import SubCategorys from "./subcategorys"

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
                    < Status handleStatusChange={this.handleStatusChange.bind(this)}/>
                </div>
                <br></br>
                <div>
                    <button onClick={()=>this.handleLanguageChange()}>{this.state.language}</button>
                    <button onClick={()=>this.handleOriginChange()}>{this.state.origin}</button>
                    <button onClick={()=>this.handleInternalFRChange("internal")}>Internal: {this.state.internal}</button>
                    <button onClick={()=>this.handleInternalFRChange("fr")}>FR: {this.state.fr}</button>
                </div>
                <br></br>
                <input type="text" onChange={event => this.handleInitTimeChange(event)} value={this.state.inital_time} />
                <input type="text" onChange={event => this.handleAgentTimeChange(event)} value={this.state.agent_time} />
                <input type="text" onChange={event => this.handleFinishTimeChange(event)} value={this.state.finish_time} />
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
                    <button>Submit to sheet</button>
                </div>
                <h5> {this.state.case_id}|{this.state.product}|{this.state.status}|{this.state.escalation}|{this.state.category}| {this.state.sub_category}|
                </h5>
            </div>
        )
    }
}
export default DailyDev;