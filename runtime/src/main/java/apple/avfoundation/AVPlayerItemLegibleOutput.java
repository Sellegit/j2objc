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
 * @since Available in iOS 7.0 and later.
 */

@Library("AVFoundation") @Mapping("AVPlayerItemLegibleOutput")
public class AVPlayerItemLegibleOutput 
    extends AVPlayerItemOutput 
     {

    
    
    public AVPlayerItemLegibleOutput() {}
    @Mapping("initWithMediaSubtypesForNativeRepresentation:")
    public AVPlayerItemLegibleOutput(NSArray<NSNumber> subtypes) { }
    
    
    @Mapping("delegate")
    public native AVPlayerItemLegibleOutputPushDelegate getDelegate();
    @Mapping("delegateQueue")
    public native DispatchQueue getDelegateQueue();
    @Mapping("advanceIntervalForDelegateInvocation")
    public native double getAdvanceIntervalForDelegateInvocation();
    public native void setAdvanceIntervalForDelegateInvocation(double v);
    @Mapping("textStylingResolution")
    public native AVPlayerItemLegibleOutputTextStylingResolution getTextStylingResolution();
    public native void setTextStylingResolution(AVPlayerItemLegibleOutputTextStylingResolution v);
    
    
    
    @Mapping("setDelegate:queue:")
    public native void setDelegate(AVPlayerItemLegibleOutputPushDelegate delegate, DispatchQueue delegateQueue);
    
}
