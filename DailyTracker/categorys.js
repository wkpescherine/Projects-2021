import React from 'react';
import './App.css';

class Categorys extends React.Component {
    render(){
        return(
            <div>
                {this.props.data === "AdMob" && 
                    <button onClick={()=>this.props.submitCategory("SDKIssues")}>SDK Issues</button>
                }
                {this.props.data === "AdMob" && 
                    <button onClick={()=>this.props.submitCategory("AccountRelated")}>Account Related</button>
                }
                {this.props.data === "AdMob" && 
                    <button onClick={()=>this.props.submitCategory("Mediation")}>Mediation</button>
                }
                {this.props.data === "AdMob" && 
                    <button onClick={()=>this.props.submitCategory("AdSpecIssues")}>Ad Spec Issues</button>
                }
                {this.props.data === "AdMob" && 
                    <button onClick={()=>this.props.submitCategory("Flutter")}>Flutter</button>
                }
                {this.props.data === "AdMob" && 
                    <button onClick={()=>this.props.submitCategory("GeneralDeveloper")}>General Developer</button>
                }
                {this.props.data === "AdMob" && 
                    <button onClick={()=>this.props.submitCategory("Other")}>Other</button>
                } 
                {this.props.data === "AdMob" && 
                    <button onClick={()=>this.props.submitCategory("PolicyIssues")}>Policy Issues</button>
                }   
                {this.props.data === "AdMob" && 
                    <button onClick={()=>this.props.submitCategory("AdManager")}>Ad Manager</button>
                }   
                {this.props.data === "AdMob" && 
                    <button onClick={()=>this.props.submitCategory("WrongForum")}>Wrong Forum</button>
                }                
            </div>
        )
    }

}
export default Categorys;