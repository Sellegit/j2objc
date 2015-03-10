package apple.avfoundation;


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
import apple.dispatch.*;
import apple.coreanimation.*;
import apple.coreaudio.*;
import apple.coremedia.*;
import apple.corevideo.*;
import apple.mediatoolbox.*;



/**
 * @since Available in iOS 8.0 and later.
 */

@Library("AVFoundation") @Mapping("AVPlayerItemMetadataOutput")
public class AVPlayerItemMetadataOutput 
    extends AVPlayerItemOutput 
     {

    
    
    public AVPlayerItemMetadataOutput() {}
    @Mapping("initWithIdentifiers:")
    public AVPlayerItemMetadataOutput(NSArray<?> identifiers) { }
    
    
    @Mapping("delegate")
    public native AVPlayerItemMetadataOutputPushDelegate getDelegate();
    @Mapping("delegateQueue")
    public native DispatchQueue getDelegateQueue();
    @Mapping("advanceIntervalForDelegateInvocation")
    public native double getAdvanceIntervalForDelegateInvocation();
    public native void setAdvanceIntervalForDelegateInvocation(double v);
    
    
    
    @Mapping("setDelegate:queue:")
    public native void setDelegate(AVPlayerItemMetadataOutputPushDelegate delegate, DispatchQueue delegateQueue);
    
}
