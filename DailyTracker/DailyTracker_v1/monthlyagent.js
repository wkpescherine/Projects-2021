import React from 'react';
//import './App.css';
import {Link} from 'react-router-dom'

import AgentMonth from "./agentmonth"

class MonthlyAgent extends React.Component {
    render(){
        return (
            <div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <div>
                    < AgentMonth amth1={"Agent"} amth2={"1"} amth3={"2"} amth4={"3"} amth5={"4"} amth6={"5"}/>
                </div>
                <Link to="/dashboard">
                    <button> Dashboard </button>
                </Link>
            </div>
        )
    }
}
export default MonthlyAgent;