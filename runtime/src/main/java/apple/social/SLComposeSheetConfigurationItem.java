package apple.social;


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
import apple.accounts.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("Social") @Mapping("SLComposeSheetConfigurationItem")
public class SLComposeSheetConfigurationItem 
    extends NSObject 
     {

    
    
    public SLComposeSheetConfigurationItem() {}
    
    
    @Mapping("title")
    public native String getTitle();
    public native void setTitle(String v);
    @Mapping("value")
    public native String getValue();
    public native void setValue(String v);
    @Mapping("valuePending")
    public native boolean isValuePending();
    public native void setValuePending(boolean v);
    @Mapping("tapHandler")
    public native @Block Runnable getTapHandler();
    public native void setTapHandler(@Block Runnable v);
    
    
    
    
    
}
