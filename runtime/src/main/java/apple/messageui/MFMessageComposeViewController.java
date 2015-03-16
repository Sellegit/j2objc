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



/**
 * @since Available in iOS 4.0 and later.
 */

@Library("MessageUI/MessageUI.h") @Mapping("MFMessageComposeViewController")
public class MFMessageComposeViewController 
    extends UINavigationController 
     {

    
    
    public MFMessageComposeViewController() {}
    @Mapping("initWithRootViewController:")
    public MFMessageComposeViewController(UIViewController rootViewController) { }
    @Mapping("initWithNibName:bundle:")
    public MFMessageComposeViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("messageComposeDelegate")
    public native MFMessageComposeViewControllerDelegate getMessageComposeDelegate();
    @Mapping("setMessageComposeDelegate:")
    public native void setMessageComposeDelegate(MFMessageComposeViewControllerDelegate v);
    @Mapping("recipients")
    public native List<String> getRecipients();
    @Mapping("setRecipients:")
    public native void setRecipients(List<String> v);
    @Mapping("body")
    public native String getBody();
    @Mapping("setBody:")
    public native void setBody(String v);
    @Mapping("subject")
    public native String getSubject();
    @Mapping("setSubject:")
    public native void setSubject(String v);
    @Mapping("attachments")
    public native List<MFMessageComposeViewControllerAttachment> getAttachments();
    
    
    
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MFMessageComposeViewControllerTextMessageAvailabilityDidChangeNotification")
    public static native NSString TextMessageAvailabilityDidChangeNotification();
    /**
     * @since Available in iOS 5.0 and later.
     */
    @GlobalConstant("MFMessageComposeViewControllerTextMessageAvailabilityKey")
    protected static native NSString TextMessageAvailabilityKey();
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("disableUserAttachments")
    public native void disableUserAttachments();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("addAttachmentURL:withAlternateFilename:")
    public native boolean addAttachment(NSURL attachmentURL, String alternateFilename);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("addAttachmentData:typeIdentifier:filename:")
    public native boolean addAttachment(NSData attachmentData, String uti, String filename);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("canSendText")
    public static native boolean canSendText();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("canSendSubject")
    public static native boolean canSendSubject();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("canSendAttachments")
    public static native boolean canSendAttachments();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("isSupportedAttachmentUTI:")
    public static native boolean isSupportedAttachmentUTI(String uti);
    
}
