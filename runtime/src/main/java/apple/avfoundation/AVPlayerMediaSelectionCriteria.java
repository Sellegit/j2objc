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

@Library("AVFoundation") @Mapping("AVPlayerMediaSelectionCriteria")
public class AVPlayerMediaSelectionCriteria 
    extends NSObject 
     {

    
    
    public AVPlayerMediaSelectionCriteria() {}
    @Mapping("initWithPreferredLanguages:preferredMediaCharacteristics:")
    public AVPlayerMediaSelectionCriteria(List<String> preferredLanguages, List<AVMediaCharacteristic> preferredMediaCharacteristics) { }
    
    
    @Mapping("preferredLanguages")
    public native List<String> getPreferredLanguages();
    @Mapping("preferredMediaCharacteristics")
    public native List<AVMediaCharacteristic> getPreferredMediaCharacteristics();
    
    
    
    
    
}
