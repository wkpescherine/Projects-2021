import React from 'react';
import './App.css';

class Categorys extends React.Component {
    render(){
        return(
            <div style={{
                display: "flex",
                justifyContent: "center",
              }}>
                <div style={{width:525, border:"2px solid white"}}>
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
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("APIDocumentation")}>APIDocumentation</button>
                    }
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("APIServices")}>APIServices</button>
                    }
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("GoogleAdsAPIMigration")}>GoogleAdsAPIMigration</button>
                    }
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("ClientLibrary")}>ClientLibrary</button>
                    }
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("General API Questions")}>General API Questions</button>
                    }
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("Google Ads API Feedback")}>Google Ads API Feedback</button>
                    }
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("Hotel Ads")}>Hotel Ads</button>
                    }
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("Library version migration")}>Library version migration</button>
                    }
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("OAuthSetup")}>OAuthSetup</button>
                    }
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("Others")}>Others</button>
                    }
                    {this.props.data === "GoogleAdsAPI" && 
                        <button onClick={()=>this.props.submitCategory("Reports")}>Reports</button>
                    }
                    {this.props.data === "test" && 
                        <button onClick={()=>this.props.submitCategory("test")}>test</button>
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
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("AdvancedAPIs")}>AdvancedAPIs</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("AdWords Entities")}>AdWords Entities</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Beta")}>Beta</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Dedicated Client Support")}>Dedicated Client Support</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Expanded Text Ads/Text Ads Migration")}>Expanded Text Ads/Text Ads Migration</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Features Availability")}>Features Availability</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Firebase")}>Firebase</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("ForPilotImplementation")}>ForPilotImplementation</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Others")}>Others</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Reports")}>Reports</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Scripts Interface")}>Scripts Interface</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("ScriptsServices")}>ScriptsServices</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Solutions")}>Solutions</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Third party scripts")}>Third party scripts</button>
                    } 
                    {this.props.data === "GoogleAdsScript" && 
                        <button onClick={()=>this.props.submitCategory("Wrong Forum/Support")}>Wrong Forum/Support</button>
                    }
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("AudienceSegmentService")}>AudienceSegmentService</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("Authentication")}>Authentication</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("CompanyService")}>CompanyService</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("Creatives/CreativePlacements")}>Creatives/CreativePlacements</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("CustomFields")}>CustomFields</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("CustomTargeting")}>CustomTargeting</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("Forecasting/checking inventory issues")}>Forecasting/checking inventory issues</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("GeneralGoogleAdManagerAPIClarifications")}>GeneralGoogleAdManagerAPIClarifications</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("GoogleAdManagerAPIReports")}>GoogleAdManagerAPIReports</button>
                    }
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("InventoryService")}>InventoryService</button>
                    }
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("LICAService")}>LICAService</button>
                    }
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("LineItemService")}>LineItemService</button>
                    }
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("LiveStreamEvent")}>LiveStreamEvent</button>
                    }
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("MatchTables")}>MatchTables</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("OrderService")}>OrderService</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("Others")}>Others</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("Performanceissues")}>Performanceissues</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("PQL")}>PQL</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("ProductRelated")}>ProductRelated</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("ProposalService")}>ProposalService</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("Spam")}>Spam</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("User/TeamPermissions")}>User/TeamPermissions</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("VersionSpecificIssues")}>VersionSpecificIssues</button>
                    } 
                    {this.props.data === "GoogleAdManagerAPI" && 
                        <button onClick={()=>this.props.submitCategory("Wrong Forum/Support")}>Wrong Forum/Support</button>
                    } 
                    {this.props.data === "IMA" && 
                        <button onClick={()=>this.props.submitCategory("Additionalplatformanddevicesintegrationconcerns")}>Additionalplatformanddevicesintegrationconcerns</button>
                    } 
                    {this.props.data === "IMA" && 
                        <button onClick={()=>this.props.submitCategory("DocumentationInquiries")}>DocumentationInquiries</button>
                    } 
                    {this.props.data === "IMA" && 
                        <button onClick={()=>this.props.submitCategory("ImplementationsIssues")}>ImplementationsIssues</button>
                    } 
                    {this.props.data === "IMA" && 
                        <button onClick={()=>this.props.submitCategory("NotsupportedIssues")}>NotsupportedIssues</button>
                    } 
                    {this.props.data === "IMA" && 
                        <button onClick={()=>this.props.submitCategory("Others")}>Others</button>
                    } 
                    {this.props.data === "IMA" && 
                        <button onClick={()=>this.props.submitCategory("SDKIssues")}>SDKIssues</button>
                    } 
                    {this.props.data === "IMA" && 
                        <button onClick={()=>this.props.submitCategory("Wrong Forum/Support")}>Wrong Forum/Support</button>
                    } 
                    {this.props.data === "test" && 
                        <button onClick={()=>this.props.submitCategory("test")}>test</button>
                    } 
                </div>              
            </div>
        )
    }

}
export default Categorys;
{/*Google Ads API 187*/}