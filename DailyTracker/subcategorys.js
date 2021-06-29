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
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Ad Performance")}>Ad Performance</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Age Range Performance")}>Age Range Performance</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Audience Performance")}>Audience Performance</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Automatic Placements Performance")}>Automatic Placements Performance</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Bid Goal Performance")}>Bid Goal Performance</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Budget Performance")}>Budget Performance</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Call Metrics Call Details")}>Call Metrics Call Details</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Campaign Ad Schedule Target")}>Campaign Ad Schedule Target</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Campaign Location Target")}>Campaign Location Target</button>
                }
                {this.props.data === "AdWordsAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Campaign Negative Keywords Performance")}>Campaign Negative Keywords Performance</button>
                }
                {this.props.data === "Test" && 
                    <button onClick={()=>this.props.submitSubCategory("test")}>tes</button>
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
                {this.props.data === "APIDocumentation" && 
                    <button onClick={()=>this.props.submitSubCategory("Select")}>Select</button>
                }
                {this.props.data === "APIDocumentation" && 
                    <button onClick={()=>this.props.submitSubCategory("Google Ads API Migration")}>Google Ads API Migration</button>
                }
                {this.props.data === "APIDocumentation" && 
                    <button onClick={()=>this.props.submitSubCategory("General inquiry")}>General inquiry</button>
                }
                {this.props.data === "APIDocumentation" && 
                    <button onClick={()=>this.props.submitSubCategory("OAuthAuthentication")}>OAuthAuthentication</button>
                }
                {this.props.data === "APIDocumentation" && 
                    <button onClick={()=>this.props.submitSubCategory("Reporting fields")}>Reporting fields</button>
                }
                {this.props.data === "APIDocumentation" && 
                    <button onClick={()=>this.props.submitSubCategory("Unsupported features")}>Unsupported features</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("Select")}>Select</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AccountBudgetProposalService")}>AccountBudgetProposalService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AccountBudgetService")}>AccountBudgetService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupAdLabelService")}>AdGroupAdLabelService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupAdService")}>AdGroupAdService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupAudienceViewService")}>AdGroupAudienceViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupBidModifierService")}>AdGroupBidModifierService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupCriterionLabelService")}>AdGroupCriterionLabelService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupCriterionService")}>AdGroupCriterionService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupCriterionSimulationService")}>AdGroupCriterionSimulationService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupExtensionSettingService")}>AdGroupExtensionSettingService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupFeedService")}>AdGroupFeedService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupLabelService")}>AdGroupLabelService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupService")}>AdGroupService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdGroupSimulationService")}>AdGroupSimulationService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdParameterService")}>AdParameterService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AdScheduleViewService")}>AdScheduleViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AgeRangeViewService")}>AgeRangeViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("AssetService")}>AssetService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("BatchJobService")}>BatchJobService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("BiddingStrategyService")}>BiddingStrategyService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("BillingSetupService")}>BillingSetupService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignAudienceViewService")}>CampaignAudienceViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignBidModifierService")}>CampaignBidModifierService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignBudgetService")}>CampaignBudgetService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignCriterionService")}>CampaignCriterionService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignCriterionSimulationService")}>CampaignCriterionSimulationService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignDraftService")}>CampaignDraftService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignExperimentService")}>CampaignExperimentService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignExtensionSettingService")}>CampaignExtensionSettingService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignFeedService")}>CampaignFeedService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignLabelService")}>CampaignLabelService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignService")}>CampaignService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CampaignSharedSetService")}>CampaignSharedSetService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CarrierConstantService")}>CarrierConstantService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("ChangeStatusService")}>ChangeStatusService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("ClickViewService")}>ClickViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("ConversionActionService")}>ConversionActionService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("ConversionAdjustmentUploadService")}>ConversionAdjustmentUploadService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("ConversionUploadService")}>ConversionUploadService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomAudienceService")}>CustomAudienceService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomerClientLinkService")}>CustomerClientLinkService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomerClientService")}>CustomerClientService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomerExtensionSettingService")}>CustomerExtensionSettingService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomerFeedService")}>CustomerFeedService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomerLabelService")}>CustomerLabelService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomerManagerLinkService")}>CustomerManagerLinkService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomerNegativeCriterionService")}>CustomerNegativeCriterionService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomerService")}>CustomerService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomerUserAccessService")}>CustomerUserAccessService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("CustomInterestService")}>CustomInterestService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("DetailPlacementViewService")}>DetailPlacementViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("DisplayKeywordViewService")}>DisplayKeywordViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("DomainCategoryService")}>DomainCategoryService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("DynamicSearchAdsSearchTermViewService")}>DynamicSearchAdsSearchTermViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("ExpandedLandingPageViewService")}>ExpandedLandingPageViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("ExtensionFeedItemService")}>ExtensionFeedItemService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("FeedItemService")}>FeedItemService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("FeedItemTargetService")}>FeedItemTargetService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("FeedMappingService")}>FeedMappingService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("FeedPlaceholderViewService")}>FeedPlaceholderViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("FeedService")}>FeedService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("GenderViewService")}>GenderViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("GeographicViewService")}>GeographicViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("GeoTargetConstantService")}>GeoTargetConstantService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("Google Ads API Migration")}>Google Ads API Migration</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("GoogleAdsFieldService")}>GoogleAdsFieldService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("GoogleAdsService")}>GoogleAdsService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("GroupPlacementViewService")}>GroupPlacementViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("HotelGroupViewService")}>HotelGroupViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("HotelPerformanceViewService")}>HotelPerformanceViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("InvoiceService")}>InvoiceService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("KeywordPlanAdGroupService")}>KeywordPlanAdGroupService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("KeywordPlanCampaignService")}>KeywordPlanCampaignService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("KeywordPlanIdeaService")}>KeywordPlanIdeaService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("KeywordPlanKeywordService")}>KeywordPlanKeywordService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("KeywordPlanNegativeKeywordService")}>KeywordPlanNegativeKeywordService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("KeywordPlanService")}>KeywordPlanService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("KeywordViewService")}>KeywordViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("LabelService")}>LabelService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("LandingPageViewService")}>LandingPageViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("LanguageConstantService")}>LanguageConstantService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("LocationViewService")}>LocationViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("ManagedPlacementViewService")}>ManagedPlacementViewService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("MediaFileService")}>MediaFileService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("MerchantCenterLinkService")}>MerchantCenterLinkService</button>
                }
                {this.props.data === "APIServices" && 
                    <button onClick={()=>this.props.submitSubCategory("MobileAppCategoryConstantService")}>MobileAppCategoryConstantService</button>
                }
                {this.props.data === "Test" && 
                    <button onClick={()=>this.props.submitSubCategory("test")}>tes</button>
                }
                {/*DBMAPI*/}
                {this.props.data === "APIversions" && 
                    <button onClick={()=>this.props.submitSubCategory("v1.0")}>v1.0</button>
                }
                {this.props.data === "APIversions" && 
                    <button onClick={()=>this.props.submitSubCategory("v1.1")}>v1.1</button>
                }
                {this.props.data === "Authentication" && 
                    <button onClick={()=>this.props.submitSubCategory("OAuth2.0")}>OAuth2.0</button>
                }
                {this.props.data === "LineItems" && 
                    <button onClick={()=>this.props.submitSubCategory("Downloadlineitems")}>Downloadlineitems</button>
                }
                {this.props.data === "LineItems" && 
                    <button onClick={()=>this.props.submitSubCategory("Error Codes")}>Error Codes</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("Uploadlineitems")}>Uploadlineitems</button>
                }
                {this.props.data === "ProductRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("Product related concern")}>Product related concern</button>
                }
                {this.props.data === "Queries" && 
                    <button onClick={()=>this.props.submitSubCategory("Createquery")}>Createquery</button>
                }
                {this.props.data === "Queries" && 
                    <button onClick={()=>this.props.submitSubCategory("Deletequery")}>Deletequery</button>
                }
                {this.props.data === "Queries" && 
                    <button onClick={()=>this.props.submitSubCategory("Getquery")}>Getquery</button>
                }
                {this.props.data === "Queries" && 
                    <button onClick={()=>this.props.submitSubCategory("Llistqueries")}>Llistqueries</button>
                }
                {this.props.data === "Queries" && 
                    <button onClick={()=>this.props.submitSubCategory("Runquery")}>Runquery</button>
                }
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Listreports")}>Listreports</button>
                }
                {this.props.data === "SDF" && 
                    <button onClick={()=>this.props.submitSubCategory("Download")}>Download</button>
                }
                {/*AudiencePartnerAPI*/}
                {this.props.data === "AudiencePartnerAPIAnnouncementsgroupaccess" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "AudiencePartnerProductrelated" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "Authentication" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "CustomerMatchUploaderService" && 
                    <button onClick={()=>this.props.submitSubCategory("Service Inquiry")}>Service Inquiry</button>
                }
                {this.props.data === "CustomerMatchUploaderService" && 
                    <button onClick={()=>this.props.submitSubCategory("Service Errors")}>Service Errors</button>
                }
                {this.props.data === "CustomerMatchUploaderService" && 
                    <button onClick={()=>this.props.submitSubCategory("Allowlisting verification")}>Allowlisting verification</button>
                }
                {this.props.data === "DMPUserListService" && 
                    <button onClick={()=>this.props.submitSubCategory("Service Inquiry")}>Service Inquiry</button>
                }
                {this.props.data === "DMPUserListService" && 
                    <button onClick={()=>this.props.submitSubCategory("Service Errors")}>Service Errors</button>
                }
                {this.props.data === "DMPUserListService" && 
                    <button onClick={()=>this.props.submitSubCategory("Allowlisting verification")}>Allowlisting verification</button>
                }
                {this.props.data === "GettingStarted" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "Notclearyet" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "UserListClientService" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "UserListService" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "WrongForum/Support" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {/* DCMAPI */}
                {this.props.data === "4xxErrors" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "5xxErrors" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "Ads" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "APIClarification" && 
                    <button onClick={()=>this.props.submitSubCategory("JSON request/response")}>JSON request/response</button>
                }
                {this.props.data === "APIClarification" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "Campaigns" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "Conversions" && 
                    <button onClick={()=>this.props.submitSubCategory("Conversion upload issue")}>Conversion upload issue</button>
                }
                {this.props.data === "Conversions" && 
                    <button onClick={()=>this.props.submitSubCategory("Upload Errors")}>Upload Errors</button>
                }
                {this.props.data === "Creatives" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "Floodlightactivities" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "Integration" && 
                    <button onClick={()=>this.props.submitSubCategory("API Integration")}>API Integration</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("General Developer issue")}>General Developer issue</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("Remarkable list")}>Remarkable list</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("Cookies")}>Cookies</button>
                }
                {this.props.data === "OutofScope" && 
                    <button onClick={()=>this.props.submitSubCategory("Product Related")}>Product Related</button>
                }
                {this.props.data === "OutofScope" && 
                    <button onClick={()=>this.props.submitSubCategory("BigQuery")}>BigQuery</button>
                }
                {this.props.data === "PermissionsandFilters" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "Placements" && 
                    <button onClick={()=>this.props.submitSubCategory("General")}>General</button>
                }
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Clarrification")}>Clarrification</button>
                }
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Discrepancy Issues")}>Discrepancy Issues</button>
                }
                {this.props.data === "Reports" && 
                    <button onClick={()=>this.props.submitSubCategory("Dimensions and Metrics")}>Dimensions and Metrics</button>
                }
                {this.props.data === "WrongForum/Support" && 
                    <button onClick={()=>this.props.submitSubCategory("Product Related")}>Product Related</button>
                }
                {this.props.data === "WrongForum/Support" && 
                    <button onClick={()=>this.props.submitSubCategory("BigQuery")}>BigQuery</button>
                }
                {/* GoogleAdsScripts */}
                {this.props.data === "AdvancedAPIs" && 
                    <button onClick={()=>this.props.submitSubCategory("Analytics")}>Analytics</button>
                }
                {this.props.data === "AdvancedAPIs" && 
                    <button onClick={()=>this.props.submitSubCategory("Big Query")}>Big Query</button>
                }
                {this.props.data === "AdvancedAPIs" && 
                    <button onClick={()=>this.props.submitSubCategory("YouTube")}>YouTube</button>
                }
                {this.props.data === "AdvancedAPIs" && 
                    <button onClick={()=>this.props.submitSubCategory("Calendar")}>Calendar</button>
                }
                {this.props.data === "AdvancedAPIs" && 
                    <button onClick={()=>this.props.submitSubCategory("Shopping Content")}>Shopping Content</button>
                }
                {this.props.data === "AdvancedAPIs" && 
                    <button onClick={()=>this.props.submitSubCategory("Tasks")}>Tasks</button>
                }
                {this.props.data === "AdvancedAPIs" && 
                    <button onClick={()=>this.props.submitSubCategory("Slides")}>Slides</button>
                }
                {this.props.data === "Beta" && 
                    <button onClick={()=>this.props.submitSubCategory("Search")}>Search</button>
                }
                {this.props.data === "Beta" && 
                    <button onClick={()=>this.props.submitSubCategory("Others")}>Others</button>
                }
                {this.props.data === "ForPilotImplementation" && 
                    <button onClick={()=>this.props.submitSubCategory("General (specify if applicable)")}>General (specify if applicable)</button>
                }
                {this.props.data === "ScriptsServices" && 
                    <button onClick={()=>this.props.submitSubCategory("Charts")}>Charts</button>
                }
                {this.props.data === "ScriptsServices" && 
                    <button onClick={()=>this.props.submitSubCategory("DriveApp")}>DriveApp</button>
                }
                {this.props.data === "ScriptsServices" && 
                    <button onClick={()=>this.props.submitSubCategory("JDBC")}>JDBC</button>
                }
                {this.props.data === "ScriptsServices" && 
                    <button onClick={()=>this.props.submitSubCategory("Mail")}>Mail</button>
                }
                {this.props.data === "ScriptsServices" && 
                    <button onClick={()=>this.props.submitSubCategory("SpreadSheet")}>SpreadSheet</button>
                }
                {this.props.data === "ScriptsServices" && 
                    <button onClick={()=>this.props.submitSubCategory("UrlFetch")}>UrlFetch</button>
                }
                {this.props.data === "ScriptsServices" && 
                    <button onClick={()=>this.props.submitSubCategory("XmlService")}>XmlService</button>
                }
                {/* GoogleAdManagerAPI */}
                {this.props.data === "AudienceSegmentService" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "Authentication" && 
                    <button onClick={()=>this.props.submitSubCategory("Service Account")}>Service Account</button>
                }
                {this.props.data === "Authentication" && 
                    <button onClick={()=>this.props.submitSubCategory("API Access")}>API Access</button>
                }
                {this.props.data === "CompanyService" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "Creatives/CreativePlacements" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "CustomFields" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "CustomTargeting" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "Documentationrelated" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "Forecasting/checking inventory issues" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "GeneralGoogleAdManagerAPIClarifications" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "GoogleAdManagerAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Feature Request")}>Feature Request</button>
                }
                {this.props.data === "GoogleAdManagerAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Key Values")}>Key Values</button>
                }
                {this.props.data === "GoogleAdManagerAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Report Bug")}>Report Bug</button>
                }
                {this.props.data === "GoogleAdManagerAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Report Clarification")}>Report Clarification</button>
                }
                {this.props.data === "GoogleAdManagerAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Report Data Mismatch")}>Report Data Mismatch</button>
                }
                {this.props.data === "GoogleAdManagerAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Report Failure")}>Report Failure</button>
                }
                {this.props.data === "GoogleAdManagerAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Report Latency")}>Report Latency</button>
                }
                {this.props.data === "GoogleAdManagerAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Reporting Backend Error")}>Reporting Backend Error</button>
                }
                {this.props.data === "GoogleAdManagerAPIReports" && 
                    <button onClick={()=>this.props.submitSubCategory("Unsupported column/dimension or missing feature")}>Unsupported column/dimension or missing feature</button>
                }
                {this.props.data === "InventoryService" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "LICAService" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "LineItemService" && 
                    <button onClick={()=>this.props.submitSubCategory("Create Line Item")}>Create Line Item</button>
                }
                {this.props.data === "LineItemService" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "LineItemService" && 
                    <button onClick={()=>this.props.submitSubCategory("Others")}>Others</button>
                }
                {this.props.data === "LineItemService" && 
                    <button onClick={()=>this.props.submitSubCategory("Perform Actions")}>Perform Actions</button>
                }
                {this.props.data === "LineItemService" && 
                    <button onClick={()=>this.props.submitSubCategory("Retrieve Line Items")}>Retrieve Line Items</button>
                }
                {this.props.data === "LineItemService" && 
                    <button onClick={()=>this.props.submitSubCategory("Update Line Item")}>Update Line Item</button>
                }
                {this.props.data === "LiveStreamEvent" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "MatchTables" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "OrderService" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("New Feature Requests")}>New Feature Requests</button>
                }
                {this.props.data === "Performanceissues" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "PQL" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "ProductRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("Data Related Concern")}>Data Related Concern</button>
                }
                {this.props.data === "ProductRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("Product Level")}>Product Level</button>
                }
                {this.props.data === "ProductRelated" && 
                    <button onClick={()=>this.props.submitSubCategory("SDK")}>SDK</button>
                }
                {this.props.data === "ProposalService" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "Spam" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "User/TeamPermissions" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "VersionSpecificIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {this.props.data === "Wrong Forum/Support" && 
                    <button onClick={()=>this.props.submitSubCategory("General Clarification")}>General Clarification</button>
                }
                {/* IMA */}
                {this.props.data === "Additionalplatformanddevicesintegrationconcerns" && 
                    <button onClick={()=>this.props.submitSubCategory("Amazon Fire TV")}>Amazon Fire TV</button>
                }
                {this.props.data === "Additionalplatformanddevicesintegrationconcerns" && 
                    <button onClick={()=>this.props.submitSubCategory("Samsung Smart TV (Tizen)")}>Samsung Smart TV (Tizen)</button>
                }
                {this.props.data === "Additionalplatformanddevicesintegrationconcerns" && 
                    <button onClick={()=>this.props.submitSubCategory("LG TV (select models)")}>LG TV (select models)</button>
                }
                {this.props.data === "Additionalplatformanddevicesintegrationconcerns" && 
                    <button onClick={()=>this.props.submitSubCategory("HbbTV")}>HbbTV</button>
                }
                {this.props.data === "Additionalplatformanddevicesintegrationconcerns" && 
                    <button onClick={()=>this.props.submitSubCategory("Xbox (JavaScript apps)")}>Xbox (JavaScript apps)</button>
                }
                {this.props.data === "Additionalplatformanddevicesintegrationconcerns" && 
                    <button onClick={()=>this.props.submitSubCategory("KaiOS")}>KaiOS</button>
                }
                {this.props.data === "Additionalplatformanddevicesintegrationconcerns" && 
                    <button onClick={()=>this.props.submitSubCategory("General (specify if applicable)")}>General (specify if applicable)</button>
                }
                {this.props.data === "DocumentationInquiries" && 
                    <button onClick={()=>this.props.submitSubCategory("SDK API inquiries")}>SDK API inquiries</button>
                }
                {this.props.data === "DocumentationInquiries" && 
                    <button onClick={()=>this.props.submitSubCategory("New Features/Feature Improvements")}>New Features/Feature Improvements</button>
                }
                {this.props.data === "DocumentationInquiries" && 
                    <button onClick={()=>this.props.submitSubCategory("Documentation issues")}>Documentation issues</button>
                }
                {this.props.data === "DocumentationInquiries" && 
                    <button onClick={()=>this.props.submitSubCategory("General (specify if applicable)")}>General (specify if applicable)</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Client-side HTML5 SDK")}>Client-side HTML5 SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Client-side Android SDK")}>Client-side Android SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Client-side iOS SDK")}>Client-side iOS SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Client-side Google Cast SDK")}>Client-side Google Cast SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Client-side tvOS SDK")}>Client-side tvOS SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI HTML5 SDK")}>DAI HTML5 SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI Android SDK")}>DAI Android SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI iOS SDK")}>DAI iOS SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI Google Cast SDK")}>DAI Google Cast SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI tvOS SDK")}>DAI tvOS SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI Roku SDK")}>DAI Roku SDK</button>
                }
                {this.props.data === "ImplementationsIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("teGeneral (specify if applicable)st")}>General (specify if applicable)</button>
                }
                {this.props.data === "NotsupportedIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("VAST related concern")}>VAST related concern</button>
                }
                {this.props.data === "NotsupportedIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Google Ad Manager / Ad provider related concern")}>Google Ad Manager / Ad provider related concern</button>
                }
                {this.props.data === "NotsupportedIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Ad serving issue")}>Ad serving issue</button>
                }
                {this.props.data === "NotsupportedIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("General (specify if applicable)")}>General (specify if applicable)</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("PAL SDK concern")}>PAL SDK concern</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("Open Measurement SDK concern")}>Open Measurement SDK concern</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("Video JS concern")}>Video JS concern</button>
                }
                {this.props.data === "Others" && 
                    <button onClick={()=>this.props.submitSubCategory("General (specify if applicable)")}>General (specify if applicable)</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Client-side HTML5 SDK")}>Client-side HTML5 SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Client-side Android SDK")}>Client-side Android SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Client-side iOS SDK")}>Client-side iOS SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Client-side Google Cast SDK")}>Client-side Google Cast SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("Client-side tvOS SDK")}>Client-side tvOS SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI HTML5 SDK")}>DAI HTML5 SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI Android SDK")}>DAI Android SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI iOS SDK")}>DAI iOS SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI Google Cast SDK")}>DAI Google Cast SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI tvOS SDK")}>DAI tvOS SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("DAI Roku SDK")}>DAI Roku SDK</button>
                }
                {this.props.data === "SDKIssues" && 
                    <button onClick={()=>this.props.submitSubCategory("teGeneral (specify if applicable)st")}>General (specify if applicable)</button>
                }
                {this.props.data === "Test" && 
                    <button onClick={()=>this.props.submitSubCategory("test")}>tes</button>
                }
            </div>
        )
    }

}
export default SubCategorys;
{/*Adwords API 288*/}
{/*Google Ads API 466*/}