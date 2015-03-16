package apple.gamekit;


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
 * @since Available in iOS 3.0 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated

@Library("GameKit/GameKit.h") @Mapping("GKPeerPickerController")
public class GKPeerPickerController 
    extends NSObject 
     {

    
    
    public GKPeerPickerController() {}
    
    
    @Mapping("connectionTypesMask")
    public native @Representing("GKPeerPickerConnectionType") int getConnectionTypesMask();
    @Mapping("setConnectionTypesMask:")
    public native void setConnectionTypesMask(@Representing("GKPeerPickerConnectionType") int v);
    @Mapping("delegate")
    public native GKPeerPickerControllerDelegate getDelegate();
    @Mapping("setDelegate:")
    public native void setDelegate(GKPeerPickerControllerDelegate v);
    @Mapping("isVisible")
    public native boolean isVisible();
    
    
    
    @Mapping("show")
    public native void show();
    @Mapping("dismiss")
    public native void dismiss();
    
}
