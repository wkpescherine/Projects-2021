import React from 'react';
import './App.css';

class SubCategorys extends React.Component {
    render(){
        return(
            <div>
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Crash")}>Crash</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Internal Error(Error 0)")}>Internal Error(Error 0)</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Request Error(Error 1)")}>Request Error(Error 1)</button>
                } 
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Network Error(Error 2)")}>Network Error(Error 2)</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("No Fill(Error 3)")}>No Fill(Error 3)</button>
                }                                                
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Memory Issues")}>Memory Issues</button>
                }  
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Missing App Link")}>Missing App Link</button>
                }
                {this.props.data === "AccountRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("Missing App Link")}>Missing App Link</button>
                }                  
            </div>
        )
    }

}
export default SubCategorys;