#import <Cordova/CDV.h>

@interface InvitePlugin : CDVPlugin

- (void) pluginInitialize;
- (void) invite:(CDVInvokedUrlCommand*)command;

@end