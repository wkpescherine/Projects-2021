import React from 'react';
//import './App.css';

import {Link} from 'react-router-dom'

import UpdateQueue from "./updatequeue"
import AgentTracker from "./agenttracker"

class Dashboard extends React.Component {
    state= {
      admobQ: 0,
      imaQ: 0,
      googleadsapiQ: 0,
      adsenseQ: 0,
      adwordQ: 0,
      shoppingQ: 0,
      parallelQ: 0,
      dcmapiQ: 0,
      dbmapiQ: 0,
      audienceQ: 0,
      admanagerQ: 0,
      googlescriptQ: 0,
      googleanalyticsQ:0,
      modQueue: false,
      queue_product: "",
      tempvalue:""
    }

    changeQueue = event => {
      this.setState({
        tempvalue: event.target.value
      })
      if(this.state.queue_product ==="admob"){
        this.setState({
          admobQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="ima"){
        this.setState({
          imaQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="adsense"){
        this.setState({
          adsenseQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="dcm"){
        this.setState({
          dcmapiQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="dbm"){
        this.setState({
          dbmapiQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="adword"){
        this.setState({
          adwordQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="parallel"){
        this.setState({
          parallelQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="audience"){
        this.setState({
          audienceQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="googlead"){
        this.setState({
          googleadsapiQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="googlescript"){
        this.setState({
          googlescriptQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="googleanalytic"){
        this.setState({
          googleanalyticsQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="admanager"){
        this.setState({
          admanagerQ: event.target.value
        })  
      }
      if(this.state.queue_product ==="shopping"){
        this.setState({
          shoppingQ: event.target.value
        })  
      }
    }

    showModQueue(modQueChanged){
      if(this.state.modQueue === false){
        this.setState({
          modQueue: true,
          queue_product: modQueChanged
        })
      } else {
        this.setState({
          modQueue: false,
          queue_product:"",
          tempvalue:""
        })
      }
    }

    render(){
      return (
        <div style={{
          display: "flex",
          justifyContent: "center"
          }}>
          <div style={{width:750, border:"2px solid white"}}>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("admob")}>AdMob<br></br>{this.state.admobQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("ima")}>IMA<br></br>{this.state.imaQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("googleads")}>Google Ads<br></br>{this.state.adsenseQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("adword")}>AdWord API<br></br>{this.state.adwordQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("adsense")}>AdSense<br></br>{this.state.adsenseQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("shopping")}>Shopping<br></br>{this.state.shoppingQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("parallel")}>Parallel<br></br>{this.state.parallelQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("dcm")}>DCMAPI<br></br>{this.state.dcmapiQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("dbm")}>DBMAPI<br></br>{this.state.dbmapiQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("audience")}>Audience<br></br>{this.state.audienceQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("admanager")}>Ad Manager<br></br>{this.state.admanagerQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("googlescript")}>Google Script<br></br>{this.state.googlescriptQ}</button>
            <button style={{width:100, height: 100}} onClick={()=>this.showModQueue("googleanalytic")}>Google Analytic<br></br>{this.state.googleanalyticsQ}</button>
            <div>
              {this.state.modQueue === true && 
                <UpdateQueue showModQueue={this.showModQueue.bind(this)} changeQueue={this.changeQueue.bind(this)} data={this.state.tempvalue}/>
              }
            </div>
            <div>
              <Link to="/dailydev">
                <button>DailyDev</button>
              </Link>
              <button> Update Queue</button>
              <button >Monthly Agent Intake</button>
              <button> Daily Agent Intake</button>
              <button> View Inflow Analysis</button>
              <button> Bug Tracker</button>
            </div>
            <div>
            <AgentTracker/>
            </div>
            <div>
            <AgentTracker/>
            </div>
            <div>
            <AgentTracker/>
            </div>
            <div>
            <AgentTracker/>
            </div>
            <div>
            <AgentTracker/>
            </div>
            <div>
            <AgentTracker/>
            </div>
            <div>
            <AgentTracker/>
            </div>
            <div>
            <AgentTracker/>
            </div>
          </div>
        </div>
      );
    }
}

export default Dashboard;