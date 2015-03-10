package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("UIKit") @Mapping("UIDocumentPickerExtensionViewController")
public class UIDocumentPickerExtensionViewController 
    extends UIViewController 
     {

    
    
    public UIDocumentPickerExtensionViewController() {}
    @Mapping("initWithNibName:bundle:")
    public UIDocumentPickerExtensionViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("documentPickerMode")
    public native @Representing("UIDocumentPickerMode") @MachineSizedUInt long getDocumentPickerMode();
    @Mapping("originalURL")
    public native NSURL getOriginalURL();
    @Mapping("validTypes")
    public native List<String> getValidTypes();
    @Mapping("providerIdentifier")
    public native String getProviderIdentifier();
    @Mapping("documentStorageURL")
    public native NSURL getDocumentStorageURL();
    
    
    
    @Mapping("dismissGrantingAccessToURL:")
    public native void dismissGrantingAccessToURL(NSURL url);
    @Mapping("prepareForPresentationInMode:")
    public native void prepareForPresentation(@Representing("UIDocumentPickerMode") @MachineSizedUInt long mode);
    
}
