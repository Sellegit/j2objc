package apple.coreaudiokit;


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
import apple.coreaudio.*;
import apple.uikit.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("CoreAudioKit/CoreAudioKit.h") @Mapping("CAInterAppAudioSwitcherView")
public class CAInterAppAudioSwitcherView 
    extends UIView 
     {

    
    
    public CAInterAppAudioSwitcherView() {}
    @Mapping("initWithFrame:")
    public CAInterAppAudioSwitcherView(CGRect frame) { }
    
    
    @Mapping("isShowingAppNames")
    public native boolean isShowingAppNames();
    @Mapping("setShowingAppNames:")
    public native void setShowingAppNames(boolean v);
    
    
    
    @Mapping("setOutputAudioUnit:")
    public native void setOutputAudioUnit(OpaqueAudioComponentInstance au);
    @Mapping("contentWidth")
    public native float getContentWidth();
    
}
