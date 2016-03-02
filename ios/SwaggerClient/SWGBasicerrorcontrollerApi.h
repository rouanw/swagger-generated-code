#import <Foundation/Foundation.h>
#import "SWGInlineResponse200.h"
#import "SWGObject.h"
#import "SWGApiClient.h"


/**
 * NOTE: This class is auto generated by the swagger code generator program. 
 * https://github.com/swagger-api/swagger-codegen 
 * Do not edit the class manually.
 */

@interface SWGBasicerrorcontrollerApi: NSObject

@property(nonatomic, assign)SWGApiClient *apiClient;

-(instancetype) initWithApiClient:(SWGApiClient *)apiClient;
-(void) addHeader:(NSString*)value forKey:(NSString*)key;
-(unsigned long) requestQueueSize;
+(SWGBasicerrorcontrollerApi*) apiWithHeader:(NSString*)headerValue key:(NSString*)key;
+(SWGBasicerrorcontrollerApi*) sharedAPI;
///
///
/// error
/// 
///
/// 
///
/// @return SWGInlineResponse200*
-(NSNumber*) errorUsingGETWithCompletionBlock :
    (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock;
    


///
///
/// error
/// 
///
/// 
///
/// @return SWGInlineResponse200*
-(NSNumber*) errorUsingHEADWithCompletionBlock :
    (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock;
    


///
///
/// error
/// 
///
/// 
///
/// @return SWGInlineResponse200*
-(NSNumber*) errorUsingPUTWithCompletionBlock :
    (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock;
    


///
///
/// error
/// 
///
/// 
///
/// @return SWGInlineResponse200*
-(NSNumber*) errorUsingPOSTWithCompletionBlock :
    (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock;
    


///
///
/// error
/// 
///
/// 
///
/// @return SWGInlineResponse200*
-(NSNumber*) errorUsingDELETEWithCompletionBlock :
    (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock;
    


///
///
/// error
/// 
///
/// 
///
/// @return SWGInlineResponse200*
-(NSNumber*) errorUsingPATCHWithCompletionBlock :
    (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock;
    


///
///
/// error
/// 
///
/// 
///
/// @return SWGInlineResponse200*
-(NSNumber*) errorUsingOPTIONSWithCompletionBlock :
    (void (^)(SWGInlineResponse200* output, NSError* error))completionBlock;
    



@end
