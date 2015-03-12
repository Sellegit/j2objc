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

@Library("UIKit") @Mapping("UIDocumentPickerViewController")
public class UIDocumentPickerViewController 
    extends UIViewController 
     {

    
    
    public UIDocumentPickerViewController() {}
    @Mapping("initWithDocumentTypes:inMode:")
    public UIDocumentPickerViewController(NSArray<?> allowedUTIs, @Representing("UIDocumentPickerMode") @MachineSizedUInt long mode) { }
    @Mapping("initWithURL:inMode:")
    public UIDocumentPickerViewController(NSURL url, @Representing("UIDocumentPickerMode") @MachineSizedUInt long mode) { }
    @Mapping("initWithNibName:bundle:")
    public UIDocumentPickerViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("delegate")
    public native UIDocumentPickerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIDocumentPickerDelegate v);
    @Mapping("documentPickerMode")
    public native @Representing("UIDocumentPickerMode") @MachineSizedUInt long getDocumentPickerMode();
    
    
    
    
    
}
