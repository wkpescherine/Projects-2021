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
                    <button>Account Related</button>
                }
                {this.props.data === "AdMob" && 
                    <button>Mediation</button>
                }
                {this.props.data === "AdMob" && 
                    <button>Ad Spec Issues</button>
                }
                {this.props.data === "AdMob" && 
                    <button>Flutter</button>
                }
                {this.props.data === "AdMob" && 
                    <button>General Developer</button>
                }
                {this.props.data === "AdMob" && 
                    <button>Other</button>
                } 
                {this.props.data === "AdMob" && 
                    <button>Policy Issues</button>
                }                
            </div>
        )
    }

}
export default Categorys;