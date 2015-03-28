package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;


/**
 * @since Available in iOS 8.0 and later.
 */
@Library("Foundation/Foundation.h") @Mapping("NSExtensionItem")
public class NSExtensionItem 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public NSExtensionItem() { }

    
    @Mapping("attributedTitle")
    public native NSAttributedString getAttributedTitle();
    @Mapping("setAttributedTitle:")
    public native void setAttributedTitle(NSAttributedString v);
    @Mapping("attributedContentText")
    public native NSAttributedString getAttributedContentText();
    @Mapping("setAttributedContentText:")
    public native void setAttributedContentText(NSAttributedString v);
    @Mapping("attachments")
    public native NSArray<?> getAttachments();
    @Mapping("setAttachments:")
    public native void setAttachments(NSArray<?> v);
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    @Mapping("setUserInfo:")
    public native void setUserInfo(NSDictionary<?, ?> v);

    
    
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSExtensionItemAttributedTitleKey")
    public static native String AttributedTitleKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSExtensionItemAttributedContentTextKey")
    public static native String AttributedContentTextKey();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @GlobalConstant("NSExtensionItemAttachmentsKey")
    public static native String AttachmentsKey();

    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
