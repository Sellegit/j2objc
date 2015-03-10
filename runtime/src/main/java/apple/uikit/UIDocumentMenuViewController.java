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

@Library("UIKit") @Mapping("UIDocumentMenuViewController")
public class UIDocumentMenuViewController 
    extends UIViewController 
     {

    
    
    public UIDocumentMenuViewController() {}
    @Mapping("initWithDocumentTypes:inMode:")
    public UIDocumentMenuViewController(List<String> allowedUTIs, @Representing("UIDocumentPickerMode") @MachineSizedUInt long mode) { }
    @Mapping("initWithURL:inMode:")
    public UIDocumentMenuViewController(NSURL url, @Representing("UIDocumentPickerMode") @MachineSizedUInt long mode) { }
    @Mapping("initWithNibName:bundle:")
    public UIDocumentMenuViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    @Mapping("delegate")
    public native UIDocumentMenuDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(UIDocumentMenuDelegate v);
    
    
    
    @Mapping("addOptionWithTitle:image:order:handler:")
    public native void addOption(String title, UIImage image, @Representing("UIDocumentMenuOrder") @MachineSizedUInt long order, @Block Runnable handler);
    
}
