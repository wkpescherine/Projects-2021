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
                {this.props.data === "AdSense" && 
                    <button onClick={()=>this.props.submitCategory("Other")}>Other</button>
                }
                {this.props.data === "AdSense" && 
                    <button onClick={()=>this.props.submitCategory("QuotaLimits")}>Quota Limits</button>
                } 
                {this.props.data === "GoogleAnalyticsAPI" && 
                    <button onClick={()=>this.props.submitCategory("Authentication")}>Authentication</button>
                }
                {this.props.data === "GoogleAnalyticsAPI" && 
                    <button onClick={()=>this.props.submitCategory("Configuration")}>Configuration</button>
                } 
                {this.props.data === "GoogleAnalyticsAPI" && 
                    <button onClick={()=>this.props.submitCategory("General Analytics API Question")}>General Analytics API Question</button>
                } 
                {this.props.data === "GoogleAnalyticsAPI" && 
                    <button onClick={()=>this.props.submitCategory("ManagementAPI")}>ManagementAPI</button>
                } 
                {this.props.data === "GoogleAnalyticsAPI" && 
                    <button onClick={()=>this.props.submitCategory("MeasurementProtocol")}>MeasurementProtocol</button>
                } 
                {this.props.data === "GoogleAnalyticsAPI" && 
                    <button onClick={()=>this.props.submitCategory("Others")}>Others</button>
                } 
                {this.props.data === "GoogleAnalyticsAPI" && 
                    <button onClick={()=>this.props.submitCategory("Reports")}>Reports</button>
                } 
                {this.props.data === "GoogleAnalyticsAPI" && 
                    <button onClick={()=>this.props.submitCategory("Wrong Forum/Support")}>Wrong Forum/Support</button>
                } 
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("4XX Errors")}>4XX Errors</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("5XX Errors")}>5XX Errors</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Account Suspensions")}>Account Suspensions</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Accounts")}>Accounts</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("API Clarifications")}>API Clarifications</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Asking for Documentation")}>Asking for Documentation</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Authentication Issues")}>Authentication Issues</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Datafeed Issues")}>Datafeed Issues</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("DataQuality/Validation Issues")}>DataQuality/Validation Issues</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Inventory Service")}>Inventory Service</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("LIA")}>LIA</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Manufacturer API")}>Manufacturer API</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Migration to 2.1")}>Migration to 2.1</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Multi-Client Accounts")}>Multi-Client Accounts</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Others")}>Others</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Policy Issues")}>Policy Issues</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Product Insertion Issues")}>Product Insertion Issues</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Quota Limits")}>Quota Limits</button>
                }
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Related to AdWords")}>Related to AdWords</button>
                } 
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Retrieving Data From MC")}>Retrieving Data From MC</button>
                } 
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("ShippingSettings")}>ShippingSettings</button>
                } 
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("Shopify pilot")}>Shopify pilot</button>
                } 
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("UI issues")}>UI issues</button>
                } 
                {this.props.data === "ContentAPIforShopping" && 
                    <button onClick={()=>this.props.submitCategory("WrongForum/Support")}>WrongForum/Support</button>
                } 
                {this.props.data === "ParallelTracking" && 
                    <button onClick={()=>this.props.submitCategory("General Inquiry")}>General Inquiry</button>
                } 
                {this.props.data === "ParallelTracking" && 
                    <button onClick={()=>this.props.submitCategory("Documentation")}>Documentation</button>
                } 
                {this.props.data === "ParallelTracking" && 
                    <button onClick={()=>this.props.submitCategory("Implementation")}>Implementation</button>
                } 
                {this.props.data === "ParallelTracking" && 
                    <button onClick={()=>this.props.submitCategory("ProductRelatedTroubleshooting")}>ProductRelatedTroubleshooting</button>
                } 
                {this.props.data === "ParallelTracking" && 
                    <button onClick={()=>this.props.submitCategory("Troubleshoot")}>Troubleshoot</button>
                } 
                {this.props.data === "AdWordsAPI" && 
                    <button onClick={()=>this.props.submitCategory("Account access (basic and standard)")}>Account access (basic and standard)</button>
                } 
                {this.props.data === "AdWordsAPI" && 
                    <button onClick={()=>this.props.submitCategory("Account Level Sitelinks")}>Account Level Sitelinks</button>
                } 
                {this.props.data === "AdWordsAPI" && 
                    <button onClick={()=>this.props.submitCategory("Ad Management")}>Ad Management</button>
                }
                {this.props.data === "AdWordsAPI" && 
                    <button onClick={()=>this.props.submitCategory("AdWords API Documentation")}>AdWords API Documentation</button>
                }
                {this.props.data === "AdWordsAPI" && 
                    <button onClick={()=>this.props.submitCategory("AdWordsAPIReports")}>AdWordsAPIReports</button>
                } 
                {this.props.data === "GoogleAdsAPI" && 
                    <button onClick={()=>this.props.submitCategory("AccountAccess")}>AdWordsAPIReports</button>
                } 
                {this.props.data === "GoogleAdsAPI" && 
                    <button onClick={()=>this.props.submitCategory("AllowlistRequest")}>AdWordsAPIReports</button>
                }
                {this.props.data === "DBMAPI" && 
                    <button onClick={()=>this.props.submitCategory("APIversions")}>APIversions</button>
                }
                {this.props.data === "DBMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Authentication")}>Authentication</button>
                }
                {this.props.data === "DBMAPI" && 
                    <button onClick={()=>this.props.submitCategory("General DBM API")}>General DBM API</button>
                }
                {this.props.data === "DBMAPI" && 
                    <button onClick={()=>this.props.submitCategory("LineItems")}>LineItems</button>
                }
                {this.props.data === "DBMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Others")}>Others</button>
                }
                {this.props.data === "DBMAPI" && 
                    <button onClick={()=>this.props.submitCategory("ProductRelated")}>ProductRelated</button>
                } 
                {this.props.data === "DBMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Queries")}>Queries</button>
                } 
                {this.props.data === "DBMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Reports")}>Reports</button>
                } 
                {this.props.data === "DBMAPI" && 
                    <button onClick={()=>this.props.submitCategory("SDF")}>SDF</button>
                } 
                {this.props.data === "DBMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Wrong Forum/Support")}>Wrong Forum/Support</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("AudiencePartnerAPIAnnouncementsgroupaccess")}>AudiencePartnerAPIAnnouncementsgroupaccess</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("AudiencePartnerProductrelated")}>AudiencePartnerProductrelated</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("Authentication")}>Authentication</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("CustomerMatchUploaderService")}>CustomerMatchUploaderService</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("DMPUserListService")}>DMPUserListService</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("GettingStarted")}>GettingStarted</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("Notclearyet")}>Notclearyet</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("Others")}>Others</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("UserListClientService")}>UserListClientService</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("UserListService")}>UserListService</button>
                } 
                {this.props.data === "AudiencePartnerAPI" && 
                    <button onClick={()=>this.props.submitCategory("WrongForum/Support")}>WrongForum/Support</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("4xxErrors")}>4xxErrors</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("5xxErrors")}>5xxErrors</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Ads")}>Ads</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("APIClarification")}>APIClarification</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Campaigns")}>Campaigns</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Conversions")}>Conversions</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Creatives")}>Creatives</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Floodlightactivities")}>Floodlightactivities</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Integration")}>Integration</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Others")}>Others</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("OutofScope")}>OutofScope</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("PermissionsandFilters")}>PermissionsandFilters</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Reports")}>Reports</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("WrongForum/Support")}>WrongForum/Support</button>
                }
                {this.props.data === "DCMAPI" && 
                    <button onClick={()=>this.props.submitCategory("Placements")}>Placements</button>
                }              
            </div>
        )
    }

}
export default Categorys;