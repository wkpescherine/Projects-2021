import React from 'react';
import './App.css';

import Agent from "./agent"

class AgentTracker extends React.Component {
    render(){
        return (
            <div>
                <div>
                    < Agent data1={"Agent"} data2={"Today"} data3={"Weekly"} data4={"Monthly"}/>
                </div>
                <div>
                    < Agent data1={"pescherine"} data2={"0"} data3={"0"} data4={"0"}/>
                </div>
                <div>
                    < Agent data1={"aryehb"} data2={"0"} data3={"0"} data4={"0"}/>
                </div>
                <div>
                    < Agent data1={"lashanski"} data2={"0"} data3={"0"} data4={"0"}/>
                </div>
                <div>
                    < Agent data1={"lakshmi"} data2={"0"} data3={"0"} data4={"0"}/>                
                </div>
                <div>
                    < Agent data1={"michael"} data2={"0"} data3={"0"} data4={"0"}/>                
                </div>
                <div>
                    < Agent data1={"kevin"} data2={"0"} data3={"0"} data4={"0"}/>                
                </div>
                <div>
                    < Agent data1={"princess"} data2={"0"} data3={"0"} data4={"0"}/>                
                </div>
                <div>
                    < Agent data1={"teejay"} data2={"0"} data3={"0"} data4={"0"}/>                
                </div>
                <div>
                    < Agent data1={"james"} data2={"0"} data3={"0"} data4={"0"}/>                
                </div>
                <div>
                    < Agent data1={"angelia"} data2={"0"} data3={"0"} data4={"0"}/>
                </div>
                <div>
                    < Agent data1={"someone"} data2={"0"} data3={"0"} data4={"0"}/>
                </div>
                <div>
                    < Agent data1={"forgotten"} data2={"0"} data3={"0"} data4={"0"}/>
                </div>
            </div>
        )
    }
}
export default AgentTracker;