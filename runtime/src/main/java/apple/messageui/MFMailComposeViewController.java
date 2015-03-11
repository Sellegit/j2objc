package apple.messageui;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.uikit.*;





@Library("MessageUI") @Mapping("MFMailComposeViewController")
public class MFMailComposeViewController 
    extends UINavigationController 
     {

    
    
    public MFMailComposeViewController() {}
    @Mapping("initWithRootViewController:")
    public MFMailComposeViewController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public MFMailComposeViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("mailComposeDelegate")
    public native MFMailComposeViewControllerDelegate getMailComposeDelegate();
    @Mapping("setMailComposeDelegate:")
    public native void setMailComposeDelegate(MFMailComposeViewControllerDelegate v);
    
    
    
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setSubject:")
    public native void setSubject(String subject);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setToRecipients:")
    public native void setToRecipients(List<String> toRecipients);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setCcRecipients:")
    public native void setCcRecipients(List<String> ccRecipients);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setBccRecipients:")
    public native void setBccRecipients(List<String> bccRecipients);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("setMessageBody:isHTML:")
    public native void setMessageBody(String body, boolean isHTML);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("addAttachmentData:mimeType:fileName:")
    public native void addAttachmentData(NSData attachment, String mimeType, String filename);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("canSendMail")
    public static native boolean canSendMail();
    
}
