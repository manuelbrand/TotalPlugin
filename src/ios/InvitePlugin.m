#import "InvitePlugin.h"

@implementation InvitePlugin
@protocol FBSDKAppInviteDialogDelegate

- (void)pluginInitialize {
    [super pluginInitialize];
    NSLog(@"iOs-InvitePlugin, launched");
}

- (void)invite:(CDVInvokedUrlCommand*)command
{
    NSLog(@"iOs invite, launched")

    FBSDKAppInviteContent *content =[[FBSDKAppInviteContent alloc] init];

    content.appLinkURL = [NSURL URLWithString:@"https://fb.me/400072263520020"];
    content.appInvitePreviewImageURL = [NSURL URLWithString:@"http://wzzrb.nl/appinvite/1.png"];

    // present the dialog. Assumes self implements protocol `FBSDKAppInviteDialogDelegate`

    if (FBSDKAppInviteDialog.canShow()) {
        [FBSDKAppInviteDialog showWithContent:content
                                 delegate:self];
    }

}

@end