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
                    <button onClick={()=>this.props.submitSubCategory("AccountAccess")}>Account Access</button>
                } 
                {this.props.data === "AccountRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("AdPerformance")}>Ad Performance</button>
                } 
                {this.props.data === "AccountRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("Campaign/HouseAds")}>Campaign/House Ads</button>
                } 
                {this.props.data === "AccountRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }                  
                {this.props.data === "AccountRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("NativeAdvanceRequest")}>Native Advance Request</button>
                }
                {this.props.data === "AccountRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("Payment/Revenue")}>Payment/Revenue</button>
                }     
                {this.props.data === "AccountRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("PinIssues")}>Pin Issue</button>
                } 
                {this.props.data === "AccountRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("SuspendedAccount")}>Suspended Account</button>
                } 
                {this.props.data === "AdSpecIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("AppOpenAds")}>App Open Ads</button>
                }
                {this.props.data === "AdSpecIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("BannerAds")}>Banner Ads</button>
                } 
                {this.props.data === "AdSpecIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomRenderedAds")}>Custom Rendered Ads</button>
                } 
                {this.props.data === "AdSpecIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("InterstitialAds")}>Interstitial Ads</button>
                } 
                {this.props.data === "AdSpecIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("MultipleAdFormats")}>Multiple Ad Formats</button>
                } 
                {this.props.data === "AdSpecIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("NativeAdvancedAds")}>Native Advanced Ads</button>
                } 
                {this.props.data === "AdSpecIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("RewardedVideoAds")}>Rewarded Video Ads</button>
                } 
                {this.props.data === "GeneralDeveloper" && 
                    <button onClick={()=>this.props.submitSubCategory("Build/SetupIssues")}>Build/Setup Issues</button>
                } 
                {this.props.data === "GeneralDeveloper" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                } 
                {this.props.data === "GeneralDeveloper" && 
                    <button onClick={()=>this.props.submitSubCategory("ImplementationIssues")}>Implementation Issues</button>
                }
                {this.props.data === "AdManager" && 
                    <button onClick={()=>this.props.submitSubCategory("MRAID")}>MRAID</button>
                } 
                {this.props.data === "AdManager" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                } 
                {this.props.data === "Mediation" && 
                    <button onClick={()=>this.props.submitSubCategory("Adapter")}>Adapter</button>
                } 
                {this.props.data === "Mediation" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomEvents")}>Custom Events</button>
                } 
                {this.props.data === "Mediation" && 
                    <button onClick={()=>this.props.submitSubCategory("Impressions")}>Impressions</button>
                } 
                {this.props.data === "Mediation" && 
                    <button onClick={()=>this.props.submitSubCategory("Integration/Implementation")}>Integration/Implementation</button>
                } 
                {this.props.data === "Mediation" && 
                    <button onClick={()=>this.props.submitSubCategory("MediationTestSuite")}>Mediation Test Suite</button>
                }  
                {this.props.data === "Other" && 
                    <button onClick={()=>this.props.submitSubCategory("DeveloperOpinionatedDiscussion")}>Developer Opinionated Discussion</button>
                }
                {this.props.data === "Other" && 
                    <button onClick={()=>this.props.submitSubCategory("Firebase")}>Firebase</button>
                }  
                {this.props.data === "Other" && 
                    <button onClick={()=>this.props.submitSubCategory("WrongForum")}>Wrong Forum</button>
                }  
                {this.props.data === "Other" && 
                    <button onClick={()=>this.props.submitSubCategory("UnsupportedPlatform")}>Unsupported Platform</button>
                } 
                {this.props.data === "PolicyIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                } 
                {this.props.data === "Authentication" && 
                    <button onClick={()=>this.props.submitSubCategory("OAuth")}>OAuth</button>
                }  
                {this.props.data === "Authentication" && 
                    <button onClick={()=>this.props.submitSubCategory("Permission issue")}>Permission issue</button>
                } 
                {this.props.data === "Configuration" && 
                    <button onClick={()=>this.props.submitSubCategory("OAuth")}>OAuth</button>
                } 
                {this.props.data === "Configuration" && 
                    <button onClick={()=>this.props.submitSubCategory("Quota Increase Request")}>Quota Increase Request</button>
                } 
                {this.props.data === "Configuration" && 
                    <button onClick={()=>this.props.submitSubCategory("Rate Limits")}>Rate Limits</button>
                } 
                {this.props.data === "ManagementAPI" && 
                    <button onClick={()=>this.props.submitSubCategory("ClientID")}>ClientID</button>
                } 
                {this.props.data === "ManagementAPI" && 
                    <button onClick={()=>this.props.submitSubCategory("Custom Dimensions")}>Custom Dimensions</button>
                } 
                {this.props.data === "ManagementAPI" && 
                    <button onClick={()=>this.props.submitSubCategory("Custom Metrics")}>Custom Metrics</button>
                } 
                {this.props.data === "ManagementAPI" && 
                    <button onClick={()=>this.props.submitSubCategory("Goals")}>Goals</button>
                } 
                {this.props.data === "ManagementAPI" && 
                    <button onClick={()=>this.props.submitSubCategory("Segments")}>Segments</button>
                } 
                {this.props.data === "ManagementAPI" && 
                    <button onClick={()=>this.props.submitSubCategory("Views(Profile)")}>Views(Profile)</button>
                } 
                {this.props.data === "MeasurementProtocol" && 
                    <button onClick={()=>this.props.submitSubCategory("Events")}>Events</button>
                }  
                {this.props.data === "MeasurementProtocol" && 
                    <button onClick={()=>this.props.submitSubCategory("Session Control")}>Session Control</button>
                }  
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("Data Related Concern")}>Data Related Concern</button>
                }  
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("Documentation")}>Documentation</button>
                }  
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("Product Related Concern")}>Product Related Concern</button>
                }  
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Events")}>Events</button>
                }  
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Events")}>Events</button>
                }  
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Events")}>Events</button>
                } 
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Events")}>Events</button>
                }  
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Events")}>Events</button>
                }  
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Events")}>Events</button>
                } 
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Events")}>Events</button>
                }  
            </div>
        )
    }

}
export default SubCategorys;