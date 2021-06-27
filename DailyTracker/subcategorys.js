import React from 'react';
import './App.css';

class SubCategorys extends React.Component {
    render(){
        return(
            <div>
                {/*AdMob*/}
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
                {/*GoogleAnalyticsAPI*/}
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
                    <button onClick={()=>this.props.submitSubCategory("Dimensions and Metrics")}>Dimensions and Metrics</button>
                }  
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Discrepancies")}>Discrepancies</button>
                }  
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Incomplete Results")}>Incomplete Results</button>
                } 
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Quota Error")}>Quota Error</button>
                }  
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Error 5xx")}>Error 5xx</button>
                }  
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Error 4xx")}>Error 4xx</button>
                } 
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("No results found")}>No results found</button>
                }
                {/*ContentAPIForShopping*/}
                {this.props.data === "WrongForum/Support" && 
                    <button onClick={()=>this.props.submitSubCategory("Shopify users")}>Shopify users</button>
                }  
                {/*ParallelTracking*/}
                {this.props.data === "Documentation" && 
                    <button onClick={()=>this.props.submitSubCategory("Display")}>Display</button>
                } 
                {this.props.data === "Documentation" && 
                    <button onClick={()=>this.props.submitSubCategory("Shopping")}>Shopping</button>
                } 
                {this.props.data === "Documentation" && 
                    <button onClick={()=>this.props.submitSubCategory("Search")}>Search</button>
                } 
                {this.props.data === "Documentation" && 
                    <button onClick={()=>this.props.submitSubCategory("Video")}>Video</button>
                }
                {this.props.data === "Implementation" && 
                    <button onClick={()=>this.props.submitSubCategory("Display")}>Display</button>
                } 
                {this.props.data === "Implementation" && 
                    <button onClick={()=>this.props.submitSubCategory("Shopping")}>Shopping</button>
                } 
                {this.props.data === "Implementation" && 
                    <button onClick={()=>this.props.submitSubCategory("Search")}>Search</button>
                } 
                {this.props.data === "Implementation" && 
                    <button onClick={()=>this.props.submitSubCategory("Video")}>Video</button>
                }
                {this.props.data === "ProductRelatedTroubleshooting" && 
                    <button onClick={()=>this.props.submitSubCategory("Display")}>Display</button>
                } 
                {this.props.data === "ProductRelatedTroubleshooting" && 
                    <button onClick={()=>this.props.submitSubCategory("Shopping")}>Shopping</button>
                } 
                {this.props.data === "ProductRelatedTroubleshooting" && 
                    <button onClick={()=>this.props.submitSubCategory("Search")}>Search</button>
                } 
                {this.props.data === "ProductRelatedTroubleshooting" && 
                    <button onClick={()=>this.props.submitSubCategory("Video")}>Video</button>
                }
                {this.props.data === "Troubleshoot" && 
                    <button onClick={()=>this.props.submitSubCategory("Display")}>Display</button>
                } 
                {this.props.data === "Troubleshoot" && 
                    <button onClick={()=>this.props.submitSubCategory("Shopping")}>Shopping</button>
                } 
                {this.props.data === "Troubleshoot" && 
                    <button onClick={()=>this.props.submitSubCategory("Search")}>Search</button>
                } 
                {this.props.data === "Troubleshoot" && 
                    <button onClick={()=>this.props.submitSubCategory("Video")}>Video</button>
                }
                {/*Adwords API*/}
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Select")}>Select</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Account Performance")}>Account Performance</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Ad Customizers Feed Item")}>Ad Customizers Feed Item</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Ad Group Performance")}>Ad Group Performance</button>
                }
                {/*GoogleAdsAPI*/}
                {this.props.data === "AccountAccess" && 
                    <button onClick={()=>this.props.submitSubCategory("Basic")}>Basic</button>
                }
                {this.props.data === "AccountAccess" && 
                    <button onClick={()=>this.props.submitSubCategory("Google Ads API Migration")}>Google Ads API Migration</button>
                }
                {this.props.data === "AccountAccess" && 
                    <button onClick={()=>this.props.submitSubCategory("Standard")}>Standard</button>
                }
                {this.props.data === "AllowlistRequest" && 
                    <button onClick={()=>this.props.submitSubCategory("App Campaign")}>App Campaign</button>
                }
                {this.props.data === "AllowlistRequest" && 
                    <button onClick={()=>this.props.submitSubCategory("Google Ads API Migration")}>Google Ads API Migration</button>
                }
                {this.props.data === "AllowlistRequest" && 
                    <button onClick={()=>this.props.submitSubCategory("Comparison Listing Ads")}>Comparison Listing Ads</button>
                }
                {this.props.data === "AllowlistRequest" && 
                    <button onClick={()=>this.props.submitSubCategory("Hotel Ads")}>Hotel Ads</button>
                }
                {this.props.data === "AllowlistRequest" && 
                    <button onClick={()=>this.props.submitSubCategory("MutateJobService")}>MutateJobService</button>
                }
            </div>
        )
    }

}
export default SubCategorys;