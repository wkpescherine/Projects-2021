import React from 'react';
import './App.css';

import {Link} from 'react-router-dom'

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
      googleanalyticsQ:0
    }

    render(){
      return (
        <div style={{
          display: "flex",
          justifyContent: "center"
          }}>
          <div style={{width: 750, border:"2 solid white"}}>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>AdMob<br></br>{this.state.admobQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>IMA<br></br>{this.state.imaQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>AdSense<br></br>{this.state.adsenseQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>AdWord API<br></br>{this.state.adwordQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>AdSense<br></br>{this.state.adsenseQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>Shopping<br></br>{this.state.shoppingQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>Parallel<br></br>{this.state.parallelQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>DCMAPI<br></br>{this.state.dcmapiQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>DBMAPI<br></br>{this.state.dbmapiQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>Audience<br></br>{this.state.audienceQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>Ad Manager<br></br>{this.state.admanagerQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>Google Script<br></br>{this.state.googlescriptQ}</button>
            <button style={{width:100, height: 100, color: "white", background: "black"}}>Google Analytics<br></br>{this.state.googleanalyticsQ}</button>
            <div>
            <Link to="/dailydev">
              <button>DailyDev</button>
            </Link>
          </div>
          </div>
        </div>
      );
    }
}

export default Dashboard;